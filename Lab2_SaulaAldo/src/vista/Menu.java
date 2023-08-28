
package vista;

import Control.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author xaldo
 */
public class Menu extends JFrame{
    private JButton boton1;
    private JButton boton2,boton3;
     public JPanel panel;
     private JLabel txt1;
      
     
    public Menu(){
        this.setSize(600,450);
        setTitle("MENU");
        //Para que cierre el sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //Centrar la ventana
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
     private void iniciarComponentes(){
        colocarPanel();
        crearBotones();
        creacionTexto();
     
       
         
    }
    
     private void colocarPanel(){
        panel = new JPanel();
        //Damos color al panel
        panel.setBackground(Color.white);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);       
    }
    
    private void creacionTexto(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\ESPE\\Desktop\\Lab2_SaulaAldo");
        txt1= new JLabel();
        txt1.setText("");  
        panel.add(txt1);
        txt1.setBounds(100, 50, 100, 100);
        txt1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(txt1.getWidth(),txt1.getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    private void crearBotones(){
        panel.setLayout(null);
         boton1 = new JButton("ESTUDIANTE");
        boton1.setBounds(50, 230, 120, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.black);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Estu inicia = new Estu();
              inicia.setVisible(true);
            JOptionPane.showMessageDialog(null,"Bienvenido a Registro Estudiantes");   
           
               
            }
        });

            boton2 = new JButton("PROFESOR");
            boton2.setBounds(230, 230, 120, 50);
            panel.add(boton2);
            boton2.setEnabled(true);
            boton2.setMnemonic('a');
            boton2.setForeground(Color.white);
            boton2.setBackground(Color.black);
            boton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  Profesor inicia = new  Profesor ();
                  inicia.setVisible(true);  
                  JOptionPane.showMessageDialog(null,"Bienvenido a Registro profesor");


                }
            });

            boton3 = new JButton("HORARIO");
            boton3.setBounds(400, 230, 120, 50);
            panel.add(boton3);
            boton3.setEnabled(true);
            boton3.setMnemonic('a');
            boton3.setForeground(Color.white);
            boton3.setBackground(Color.black);
            boton3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  Horario inicia = new  Horario ();
                  inicia.setVisible(true);  
                  JOptionPane.showMessageDialog(null,"Bienvenido a registro Horario");


                }
            });
    }
    
        public void cerrar(){
              this.dispose();
        }
}
