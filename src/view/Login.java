package view;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import control.Logar;
import model.Usuario;
import model.UsuarioDAO;

public class Login extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public JTextField textField;
	public JPasswordField textField_1;
	public Simulador pai;
	
	public Login(Simulador pai) {
		
		this.setLayout(null);
		this.setSize(774, 529);
		
		this.pai = pai;
		
		JLabel lblImg = new JLabel();
		lblImg.setIcon(new ImageIcon(getClass().getResource("/login_cadeado.png")));
		lblImg.setBounds(325, 38, 150, 162);
		add(lblImg);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLogin.setBounds(339, 211, 40, 20);
		add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSenha.setBounds(339, 261, 43, 14);
		add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(339, 231, 129, 20);
		add(textField);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(339, 276, 129, 20);
		add(textField_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setIcon(new ImageIcon(getClass().getResource("/chave.png")));
		btnEntrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEntrar.setBounds(349, 317, 102, 30);
		btnEntrar.addActionListener(new Logar(this));
		btnEntrar.registerKeyboardAction(
				btnEntrar.getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)), 
				KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), JComponent.WHEN_IN_FOCUSED_WINDOW);
		btnEntrar.registerKeyboardAction(
				btnEntrar.getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)), 
				KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), JComponent.WHEN_IN_FOCUSED_WINDOW);
		this.add(btnEntrar);
	
		
	}

}
