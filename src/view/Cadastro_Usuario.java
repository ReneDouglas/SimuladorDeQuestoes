package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Cadastro_Usuario extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public Cadastro_Usuario() {
		
		this.setLayout(null);
		this.setSize(774, 529);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Usu\u00E1rio");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(301, 87, 204, 24);
		add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNome.setBounds(292, 157, 40, 14);
		add(lblNome);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblUsurio.setBounds(280, 182, 52, 14);
		add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSenha.setBounds(289, 207, 43, 14);
		add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConfirmarSenha.setBounds(220, 232, 112, 14);
		add(lblConfirmarSenha);
		
		textField = new JTextField();
		textField.setBounds(342, 230, 163, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(342, 205, 163, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(342, 180, 163, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(342, 155, 163, 20);
		add(textField_3);
		
		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNvel.setBounds(296, 257, 36, 14);
		add(lblNvel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(342, 255, 163, 20);
		add(comboBox);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(getClass().getResource("/salvar.png")));
		btnSalvar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSalvar.setBounds(291, 320, 102, 30);
		this.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(getClass().getResource("/limpar.png")));
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLimpar.setBounds(403, 320, 102, 30);
		this.add(btnLimpar);
		
		
		
	}
}
