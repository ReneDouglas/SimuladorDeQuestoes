package view;

import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import control.JTableRenderer;
import control.JTableModel;
import model.Materia;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Cadastro_Materia extends JInternalFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private Simulador tela;
	
	public Cadastro_Materia(Simulador tela) {
		
		this.setTitle("Cadastrar Matéria");
		getContentPane().setLayout(null);//371 264
		this.setClosable(true);
		this.setBounds(200, 100, 371, 264);
		
		this.tela = tela;
		 
		if(tela.cadQuest.isVisible()){
			tela.cadQuest.add(this);
			tela.cadQuest.setComponentZOrder(this, 0);
		}
		else if(tela.cadUser.isVisible()){
			tela.cadUser.add(this);
			tela.cadUser.setComponentZOrder(this, 0);
		}
        

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 339, 208);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 16, 44, 16);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(74, 15, 151, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("/salvar.png")));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBounds(237, 15, 90, 20);
		panel.add(btnNewButton);
		
		Icon editar = new ImageIcon(getClass().getResource("/editar2.png"));
		Icon deletar = new ImageIcon(getClass().getResource("/deletar2.png"));
		
		JTable tabela = new JTable();
		JTableModel matModel = new JTableModel(1);
		tabela.setModel(matModel);
		tabela.setRowHeight(20);

		tabela.getColumnModel().getColumn(0).setPreferredWidth(25);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(167);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(60);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(60);
		tabela.setFillsViewportHeight(true);
		
		TableColumnModel ColumnModel = tabela.getColumnModel();  
        JTableRenderer renderer = new JTableRenderer();  
        ColumnModel.getColumn(2).setCellRenderer(renderer);  
        ColumnModel.getColumn(3).setCellRenderer(renderer); 
		
		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(12, 50, 315, 146);
		panel.add(scrollPane);
		
		Materia materia = new Materia();
		materia.id = "1";
		materia.nome = "matemática";
		materia.editar = editar;
		materia.excluir = deletar;
		
		matModel.limpar();
		matModel.addObjeto(materia);
		matModel.addObjeto(materia);
		matModel.addObjeto(materia);
		
	}
}
