package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBC {
	
	public Connection conn;
	public Statement stm;
	
	public SQLiteJDBC() {
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:simulador.db");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void desconectar(){
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void initBD(){
		
		try {
			
			stm = conn.createStatement();
			
			String sql = "CREATE TABLE IF NOT EXISTS usuario "+
					 "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "+
					 "nome VARCHAR(100) NOT NULL, "+
					 "senha VARCHAR(100) NOT NULL, "+
					 "tipo VARCHAR(100) NOT NULL ); "+
					 
					 "CREATE TABLE IF NOT EXISTS questao "+
					 "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "+
					 "enunciado TEXT NOT NULL, "+
					 "resposta_A VARCHAR(255) NOT NULL, "+
					 "resposta_B VARCHAR(255) NOT NULL, "+
					 "resposta_C VARCHAR(255) NOT NULL, "+
					 "resposta_D VARCHAR(255) NOT NULL, "+
					 "resposta_E VARCHAR(255) NOT NULL, "+
					 "resposta_correta VARCHAR(1) NOT NULL,"+
					 "tipo_questao INT NOT NULL ); "+
					 
					 "INSERT INTO usuario (nome, senha, tipo) "+
					 "SELECT 'admin', 'admin', 'administrador' "+
					 "WHERE NOT EXISTS (SELECT 1 FROM usuario WHERE "+
					 "nome='admin' AND senha='admin' AND tipo='administrador')";
			
			this.stm.executeUpdate(sql);	
			
			System.out.println("Tables created sucessfully!");
			
			this.stm.close();
			this.conn.close();
			
		} catch (SQLException e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
		}
	}

}
