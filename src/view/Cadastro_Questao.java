package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class Cadastro_Questao extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public Cadastro_Questao() {
		
		this.setLayout(null);
		this.setSize(774, 529);
		
		int x = 10;
		
		JLabel lblEnunciadoDaQuesto = new JLabel("Enunciado da quest\u00E3o:");
		lblEnunciadoDaQuesto.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnunciadoDaQuesto.setBounds(29, 57, 137, 14);
		this.add(lblEnunciadoDaQuesto);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		//scrollpane.this.add(textArea);
		
		JScrollPane scrollpane = new JScrollPane(textArea);
		scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setBounds(29-x, 82, 735, 185);
		this.add(scrollpane);
		//scrollpane.setViewportView();
		
		
		JLabel lblNewLabel = new JLabel("Resposta A:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(29-x, 302, 79, 14);
		this.add(lblNewLabel);
		
		JLabel lblRespostaB = new JLabel("Resposta B:");
		lblRespostaB.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRespostaB.setBounds(29-x, 327, 79, 14);
		this.add(lblRespostaB);
		
		JLabel lblRespostaC = new JLabel("Resposta C:");
		lblRespostaC.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRespostaC.setBounds(29-x, 352, 79, 14);
		this.add(lblRespostaC);
		
		JLabel lblRespostaD = new JLabel("Resposta D:");
		lblRespostaD.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRespostaD.setBounds(29-x, 377, 79, 14);
		this.add(lblRespostaD);
		
		JLabel lblRespostaE = new JLabel("Resposta E:");
		lblRespostaE.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRespostaE.setBounds(29-x, 402, 79, 14);
		this.add(lblRespostaE);
		
		textField = new JTextField();
		textField.setBounds(118-x, 300, 646, 20);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118-x, 325, 646, 20);
		this.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118-x, 350, 646, 20);
		this.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118-x, 375, 646, 20);
		this.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118-x, 400, 646, 20);
		this.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Mat\u00E9ria da Quest\u00E3o:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29-x, 13, 126, 14);
		this.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(165-x, 11, 256, 20);
		comboBox.addItem(new String("testeteste"));
		this.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Resposta Correta:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(29-x, 456, 112, 14);
		this.add(lblNewLabel_2);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnA.setBounds(156-x, 452, 57, 23);
		this.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnB.setBounds(215-x, 453, 57, 23);
		this.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnC.setBounds(274-x, 453, 57, 23);
		this.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnD.setBounds(333-x, 453, 57, 23);
		this.add(rdbtnD);
		
		JRadioButton rdbtnE = new JRadioButton("E");
		rdbtnE.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnE.setBounds(392-x, 453, 57, 23);
		this.add(rdbtnE);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(getClass().getResource("/salvar.png")));
		btnSalvar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSalvar.setBounds(550-x, 488, 102, 30);
		this.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(getClass().getResource("/limpar.png")));
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLimpar.setBounds(662-x, 488, 102, 30);
		this.add(btnLimpar);
		
		
	}
}
