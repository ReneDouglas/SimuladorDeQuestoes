package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class UsuarioDAO{
	
	private SQLiteJDBC db;
	
	public UsuarioDAO() {
		db = new SQLiteJDBC();
	}
	
	public void inserir(Usuario obj) {

		try {
			
			db.stm = db.conn.createStatement();		
			String sql = "INSERT INTO usuario (nome, senha, tipo) VALUES ('"+obj.nome+"','"+obj.senha+"','"+obj.tipo+"')";
			System.out.println(sql);
			db.stm.executeUpdate(sql);
			db.stm.close();
			
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
	}
	
	public void remover(Usuario obj) {
		
		try {
			
			db.stm = db.conn.createStatement();
			String sql = "DELETE FROM usuario WHERE id="+obj.id;
			db.stm.executeUpdate(sql);
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
	}
	
	public void alterar(Usuario obj) {
		
		try {
			
			db.stm = db.conn.createStatement();
			String sql = "UPDATE usuario SET nome='"+obj.nome+"', senha='"+obj.senha+"', tipo='"+obj.tipo+
					"' WHERE nome='"+obj.nome+"'";
			System.out.println(sql);
			db.stm.executeUpdate(sql);
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
	}
	
	public Vector<Usuario> getAll() {
		
		Vector<Usuario> lista = new Vector<Usuario>();
		Usuario obj;
		ResultSet rs;
		
		try {
			
			String sql = "SELECT * FROM usuario ORDER BY id";
			db.stm = db.conn.createStatement();
			rs = db.stm.executeQuery(sql);
			
			while (rs.next()) {
				
				obj = new Usuario();
				obj.id = rs.getInt("id");
				obj.nome = rs.getString("nome");
				obj.senha = rs.getString("senha");
				obj.tipo = rs.getString("tipo");
				
				lista.add(obj);
				
			}
			
			rs.close();
			db.stm.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
		
		return lista;
	}
	
	public boolean getUsuario(Usuario user){
		
		Usuario obj;
		ResultSet rs;
		
		
		try {
			
			String sql = "SELECT id FROM usuario WHERE nome='"+user.nome+"' AND senha='"+user.senha+"'";
			db.stm = db.conn.createStatement();
			rs = db.stm.executeQuery(sql);
			
			if(rs.next()){
				
				obj = new Usuario();
				obj.id = rs.getInt("id");
				
				return true;
				
			}
			else return false;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
