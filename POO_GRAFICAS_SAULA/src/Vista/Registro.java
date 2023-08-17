
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Registro extends JFrame{
    //Creamos una ventana grafica con JFrame
    public JPanel panel;
    
    public Registro(){
        setSize(500,500);
        setTitle("REGISTRO");
        //Para que se cierre el sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //CERRAR VENTANA
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        ColocarCajaTexto();
        colocarAreaTexto();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Damos color al panel
        panel.setBackground(Color.PINK);
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("REGISTRAR",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(70,10,350,50);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.cyan);
        label.setOpaque(true);
        //Creamos objeto
        JLabel label1 = new JLabel();
        label1.setText("NOMBRE");
        //Agregamos la etiqueta al panel
        panel.add(label1);
        //Ubicar
        label1.setHorizontalAlignment(HEIGHT);
        //Fuente
        label1.setForeground(Color.black);
        label1.setFont(new Font("arial",Font.PLAIN,20));
        label1.setBounds(30, 70, 350, 40);
        //Poner Imagen
        JLabel labelimagen = new JLabel();
        ImageIcon imagen =new ImageIcon("registro.png");
        labelimagen.setBounds(30,90,90,90);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(),Image.SCALE_SMOOTH)));
    }
    public void colocarBotones(){
        JButton boton = new JButton("CLIC");
        boton.setBounds(30, 410, 100, 50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        boton.setBorder(BorderFactory.createLineBorder(Color.YELLOW,5,true));
        
        JButton boton1 = new JButton();
        boton1.setBounds(300, 410, 100, 50);
        boton1.setEnabled(true);
        boton1.setMnemonic('b');
        ImageIcon imagen1=new ImageIcon("boton.png");
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton1);
        
    }
    public void ColocarCajaTexto(){
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(130, 80, 250, 30);
        panel.add(cajaTexto1);
        cajaTexto1.setText("POO");
        System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    }
    public void colocarAreaTexto(){
        JTextArea textarea1 = new JTextArea();
        textarea1.setBounds(130, 130, 250, 250);
        panel.add(textarea1);
        textarea1.setText("POO");
        textarea1.append("\n Escribir aqui..");
        JScrollPane barra = new JScrollPane(textarea1);
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(130,140,250,90);
        panel.add(barra);
    }
}