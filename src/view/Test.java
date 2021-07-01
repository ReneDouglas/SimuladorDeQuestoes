package view;

import java.util.Vector;

import model.SQLiteJDBC;
import model.Usuario;
import model.UsuarioDAO;

public class Test {
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		SQLiteJDBC db = new SQLiteJDBC();
		db.initBD();
		
		Usuario user = new Usuario();
		Usuario user2 = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();
		
		System.out.println("---------------------------");
		
		user.id=0;
		user.nome="rene";
		user.senha="123";
		user.tipo="administrador";
		
		dao.inserir(user);
		Vector<Usuario> lista = new Vector<Usuario>();
		lista = dao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("usuario: "+lista.get(i).id+", "+lista.get(i).nome+", "+
		lista.get(i).senha+", "+lista.get(i).tipo);
			
		}
		
		db.desconectar();
		db = new SQLiteJDBC();
		System.out.println("----- Alterando senha -----");
		user.senha="321";
		dao.alterar(user);
		
		lista = dao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("usuario: "+lista.get(i).id+", "+lista.get(i).nome+", "+
		lista.get(i).senha+", "+lista.get(i).tipo);
			
		}
		
		System.out.println("------ Inserindo Novo Usuário ------");
		
		user2.id=0;
		user2.nome="jana";
		user2.senha="123";
		user2.tipo="usuario";
		
		dao.inserir(user2);
		lista = dao.getAll();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("usuario: "+lista.get(i).id+", "+lista.get(i).nome+", "+
		lista.get(i).senha+", "+lista.get(i).tipo);
			
		}
		
	}

}
