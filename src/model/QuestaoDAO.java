package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class QuestaoDAO{
	
	private SQLiteJDBC db;
	
	public QuestaoDAO() {
		db = new SQLiteJDBC();
	}
	
	public void inserir(Questao obj) {

		try {
			
			db.stm = db.conn.createStatement();
			String sql = "INSERT INTO questao (enunciado, resposta_A, resposta_B, resposta_C, "+
			"resposta_D, resposta_E, resposta_correta, tipo_questao) VALUES ('"+obj.enunciado+"','"+
					obj.resposta_A+"','"+obj.resposta_B+"','"+obj.resposta_C+"','"+
			obj.resposta_D+"','"+obj.resposta_E+"','"+obj.resposta_correta+"',"+obj.tipo_questao+")";
			db.stm.executeUpdate(sql);
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}	
		
	}
	
	public void remover(Questao obj) {
		
		try {
			
			db.stm = db.conn.createStatement();
			String sql = "DELETE FROM questao WHERE id="+obj.id;
			db.stm.executeUpdate(sql);
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
	}
	
	public void alterar(Questao obj) {
		
		try {
			
			db.stm = db.conn.createStatement();
			String sql = "UPDATE questao SET enunciado='"+obj.enunciado+"', resposta_A='"+
					obj.resposta_A+"', resposta_B='"+obj.resposta_B+"', resposta_C='"+obj.resposta_C+"', resposta_D='"+
			obj.resposta_D+"', resposta_E='"+obj.resposta_E+"', resposta_correta='"+obj.resposta_correta+"', tipo_questao="+
					obj.tipo_questao+" WHERE id="+obj.id;
			db.stm.executeUpdate(sql);
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
	}
	
	public Vector<Questao> getAll() {
		
		Vector<Questao> lista = new Vector<Questao>();
		Questao obj;
		ResultSet rs;	
		
		try {
			
			String sql = "";
			db.stm = db.conn.createStatement();
			rs = db.stm.executeQuery(sql);
			
			while (rs.next()) {
				
				obj = new Questao();
				obj.id = rs.getInt("id");
				obj.enunciado = rs.getString("enunciado");
				obj.resposta_A = rs.getString("resposta_A");
				obj.resposta_B = rs.getString("resposta_B");
				obj.resposta_C = rs.getString("resposta_C");
				obj.resposta_D = rs.getString("resposta_D");
				obj.resposta_E = rs.getString("resposta_E");
				obj.resposta_correta = rs.getString("resposta_correta");
				obj.tipo_questao = rs.getInt("tipo_questao");
				
				lista.add(obj);
			}
			
			rs.close();
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
		
		return lista;
	}

}
