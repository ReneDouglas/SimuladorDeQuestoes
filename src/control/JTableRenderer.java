package control;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;

public class JTableRenderer extends DefaultTableCellRenderer  {  
	  
    protected void setValue(Object value){  
  
        if (value instanceof ImageIcon){  
  
            if (value != null){  
                ImageIcon d = (ImageIcon) value;
                setHorizontalAlignment(CENTER);  
                setIcon(d);  
            } else{  
                setText("");  
                setIcon(null);  
            }  
              
        } else {  
            super.setValue(value);  
        }  
          
    }// fim da fun��o  
      
} 