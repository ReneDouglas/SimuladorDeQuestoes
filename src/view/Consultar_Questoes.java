package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableColumnModel;

import control.JTableRenderer;
import model.Questao;
import control.JTableModel;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Consultar_Questoes extends JPanel{
	
	public Consultar_Questoes() {
		this.setLayout(null);
		this.setSize(774, 529);
		
		JLabel lblMatria = new JLabel("Mat\u00E9ria:");
		lblMatria.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMatria.setBounds(10, 13, 53, 14);
		add(lblMatria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(73, 11, 174, 20);
		add(comboBox);
		
		Icon editar = new ImageIcon(getClass().getResource("/editar2.png"));
		Icon deletar = new ImageIcon(getClass().getResource("/deletar2.png"));
		
		JTable tabela = new JTable();
		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JTableModel matModel = new JTableModel(2);
		tabela.setModel(matModel);
		tabela.setRowHeight(20);

		tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(60);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(25);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(350);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(8).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(9).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(10).setPreferredWidth(80);
		tabela.setFillsViewportHeight(true);
		
		TableColumnModel ColumnModel = tabela.getColumnModel();  
        JTableRenderer renderer = new JTableRenderer();  
        ColumnModel.getColumn(0).setCellRenderer(renderer);  
        ColumnModel.getColumn(1).setCellRenderer(renderer); 
        
        JScrollPane scrollPane = new JScrollPane(tabela);
        //scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 38, 754, 480);
		add(scrollPane);
		
		Questao q = new Questao();
		q.editar = editar;
		q.excluir = deletar;
		q.id = 1;
		q.enunciado = "Uma farmácia necessita de um sistema para controle de estoque";
		q.resposta_A = "teste1";
		q.resposta_B = "teste2";
		q.resposta_C = "teste3";
		q.resposta_D = "teste4";
		q.resposta_E = "teste5";
		q.resposta_correta = "B";
		q.tipo_questao = 2;
		
		matModel.limpar();
		matModel.addObjeto(q);
		matModel.addObjeto(q);
		matModel.addObjeto(q);
	}
}
