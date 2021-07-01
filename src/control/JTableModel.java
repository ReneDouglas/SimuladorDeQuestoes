package control;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

import model.Materia;
import model.Questao;

public class JTableModel extends AbstractTableModel{
	
	private int tipo;
	private ArrayList<Materia> linhas;
	private ArrayList<Questao> linhas2;
	private String[] colunas = new String[]{"ID", "Matéria", "Editar", "Excluir"};
	private String[] colunas2 = new String[]{"Editar", "Excluir", "ID", "Enunciado", "Resposta_A"
			, "Resposta_B", "Resposta_C", "Resposta_D", "Resposta_E", "Resposta Correta"
			, "Matéria"};
	
	public JTableModel(int tipo) {
		
		this.tipo = tipo;
		
		if(tipo == 1){
			linhas = new ArrayList<Materia>();
		}else
			linhas2 = new ArrayList<Questao>();
	}

	@Override
	public int getColumnCount() {
		if(tipo == 1)
			return colunas.length;
		else return colunas2.length;
	}

	@Override
	public int getRowCount() {
		if(tipo == 1)
			return linhas.size();
		else return linhas2.size();
	}
	
	public String getColumnName(int columnIndex){
		if(tipo == 1)
			return colunas[columnIndex];
		else return colunas2[columnIndex];
	}
	
	public Class<?> getColumnClass(int columnIndex){
		
		if(tipo == 1){
			switch(columnIndex){
				case 0:
					return String.class;
				case 1:
					return String.class;
				case 2:
					return Icon.class;
				case 3:
					return Icon.class;
				default:
					throw new IndexOutOfBoundsException("Column index out of bounds");
		
			}
		} else{
			
			switch(columnIndex){
				case 0:
					return Icon.class;
				case 1:
					return Icon.class;
				case 2:
					return String.class;
				case 3:
					return String.class;
				case 4:
					return String.class;
				case 5:
					return String.class;
				case 6:
					return String.class;
				case 7:
					return String.class;
				case 8:
					return String.class;
				case 9:
					return String.class;
				case 10:
					return String.class;
				default:
					throw new IndexOutOfBoundsException("Column index out of bounds");
			}
		}
			
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(tipo == 1){
			
			Materia cols = linhas.get(rowIndex);
			
			switch (columnIndex) {
				case 0:
					return cols.id;
				case 1:
					return cols.nome;
				case 2:
					return cols.editar;
				case 3:
					return cols.excluir;
				default:
					throw new IndexOutOfBoundsException("Column index out of bounds");
			}
			
		} else{
			
			Questao cols = linhas2.get(rowIndex);
			
			switch (columnIndex) {
				
				case 0:
					return cols.editar;
				case 1:
					return cols.excluir;
				case 2:
					return cols.id;
				case 3:
					return cols.enunciado;
				case 4:
					return cols.resposta_A;
				case 5:
					return cols.resposta_B;
				case 6:
					return cols.resposta_C;
				case 7:
					return cols.resposta_D;
				case 8:
					return cols.resposta_E;
				case 9:
					return cols.resposta_correta;
				case 10:
					return cols.tipo_questao;
				default:
					throw new IndexOutOfBoundsException("Column index out of bounds");
			}
			
		}
		
		
		
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex){};
	
	public Object getObjeto(int indiceLinha){
		
		if(tipo == 1) return linhas.get(indiceLinha);
		else return linhas2.get(indiceLinha);
	}
	
	public void addObjeto(Object obj){
		
		if(tipo == 1) linhas.add((Materia)obj);
		else linhas2.add((Questao)obj);
		
		int ultimoIndice = getRowCount() - 1;
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
		
	}
	
	public void removeObjeto(int indiceLinha){
		
		if(tipo == 1) linhas.remove(indiceLinha);
		else linhas2.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
		
	}
	
	/*public void addListaMaterias(ArrayList<Materia> lista){
		
		int tamanhoAntigo = getRowCount();
		linhas.addAll(lista);
		fireTableRowsInserted(tamanhoAntigo, getRowCount() -1);
		
	}*/
	
	public void limpar(){  
		if(tipo == 1) linhas.clear(); 
		else linhas2.clear();
        fireTableDataChanged();  
    }  
  
    public boolean isEmpty(){  
    	if(tipo == 1) return linhas.isEmpty();
    	else return linhas.isEmpty();
    }  
  

}
