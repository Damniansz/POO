/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Control.Conexion;
import com.mysql.jdbc.Connection;
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
     Conexion cc=new Conexion();
    Connection con = cc.conexion();
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
     public JPanel panel;
     private JLabel txt1,txt2;
      
     
    public Menu(){
        this.setSize(600,600);
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
        cerrar();
     
       
         
    }
    
     private void colocarPanel(){
        panel = new JPanel();
        //Damos color al panel
        panel.setBackground(Color.white);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);       
    }
    
    private void creacionTexto(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\ESPE\\Desktop\\POO\\Lab2_SaulaAldo\\Registro.png");
        txt1= new JLabel();
        txt1.setText("");  
        panel.add(txt1);
        txt1.setBounds(230, 50, 150, 150);
         txt1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(txt1.getWidth(),txt1.getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    private void crearBotones(){
        panel.setLayout(null);
         boton1 = new JButton("Estudiante");
        boton1.setBounds(70, 230, 120, 120);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.DARK_GRAY);
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //student inicia = new student();No encontre solucion al problema de instanciar
             //inicia.setVisible(true);            
            JOptionPane.showMessageDialog(null,"Registro Estudiante");   
           
               
            }
        });
        
        panel.setLayout(null);
         boton3 = new JButton("Horario");
        boton3.setBounds(240, 230, 120, 120);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('a');
        boton3.setForeground(Color.white);
        boton3.setBackground(Color.DARK_GRAY);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Horario horario = new Horario();
             horario.setVisible(true);
            JOptionPane.showMessageDialog(null,"Registro Horario");   
           
               
            }
        });
        
        boton2 = new JButton("Profesor");
        boton2.setBounds(400, 230, 120, 120);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.DARK_GRAY);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Profesor inicia = new  Profesor ();
              inicia.setVisible(true);  
              JOptionPane.showMessageDialog(null,"Registro Profesor");
              
               
            }
        });
    }
    
    public void cerrar(){
              this.dispose();
          } 
}
