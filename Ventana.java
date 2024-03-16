package poo.main;


import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ventana extends JFrame  {
    
    private JPanel panel;
    JScrollPane scroll;
    private JTable tabla;
    private DefaultTableModel tableModel ;
    
    private final String [][] datos={{"1","Fernando","Prieto","Peru"},
                             {"2","Isabel","Aguirre","Colombia"},
                             {"3","Juan","Acosta","Panama"},
                             {"3","Juan","Acosta","Panama"},
                             {"3","Juan","Acosta","Panama"},
                             {"3","Juan","Acosta","Panama"},
                             {"3","Juan","Acosta","Panama"},
                             {"3","Juan","Acosta","Panama"},
                             {"3","Juan","Acosta","Panama"},};
  
  
  private final String []cabezera={"Dato","Nombre","Apellido","Nacionalidad"};
    
    public Ventana(){
        setTitle("Ejemplo de ScrollPane");
        setSize (600,400);
        setLocationRelativeTo(null);
        iniciarComponentes();
        
        setVisible(true);
       
    }
    
   
    private void iniciarComponentes(){
        
        scroll= new JScrollPane();
        scroll.setBounds(5,10,180,23);
        
        panel =new JPanel();
        panel.setLayout(new BorderLayout());
        
        
        tabla= new JTable(new DefaultTableModel(datos,cabezera));
        
        tabla.setEnabled(false);
                
        panel.setPreferredSize(new Dimension(500,200));
        
        panel.add(tabla);
  
        scroll.setViewportView(panel);
        
        add(scroll);
        
        this.setResizable(false);
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
  
    
   }

