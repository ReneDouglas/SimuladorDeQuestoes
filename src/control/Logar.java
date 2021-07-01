package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Usuario;
import model.UsuarioDAO;
import view.Login;

public class Logar implements ActionListener{
	
	private Login login;
	private UsuarioDAO dao;
	private Usuario user;
	
	public Logar(Login login) {
		this.login = login;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		dao = new UsuarioDAO();
		user = new Usuario();
		
		user.nome = login.textField.getText();
		user.senha = login.textField_1.getText();
		
		if(dao.getUsuario(user)){
			
			login.setVisible(false);
			login.textField.setText("");
			login.textField_1.setText("");
			login.pai.menuBar.setVisible(true);
			login.pai.cadQuest.setVisible(true);
			login.pai.repaint();
			
		}else{
			login.textField.setText("");
			login.textField_1.setText("");
			JOptionPane.showMessageDialog(login, "Usuário Inválido.", "Erro!", JOptionPane.ERROR_MESSAGE);	
		}
		
	}

}
