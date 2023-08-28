
package vista;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame {
    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    private JTextField usuarioField;
    private JPasswordField contraField;
    private JButton loginButton;
    private boolean sesionIniciada = false;


    public Login() {
        setSize(400, 250);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 50, 100, 25);
        add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(150, 50, 200, 25);
        add(usuarioField);

        JLabel contraLabel = new JLabel("Contraseña:");
        contraLabel.setBounds(50, 100, 100, 25);
        add(contraLabel);

        contraField = new JPasswordField();
        contraField.setBounds(150, 100, 200, 25);
        add(contraField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {  
                    validarCredenciales();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        add(loginButton);
    }

    private void validarCredenciales() throws SQLException {
        try{
             String usuario = usuarioField.getText();
        String contraseña = new String(contraField.getPassword());

        String SQL = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, usuario);
        pst.setString(2, contraseña);

            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                int resultado = 1;
               if(resultado==1){
                   Menu inicio = new   Menu ();
                   inicio.setVisible(true);            
                   JOptionPane.showMessageDialog(null,"Entrando...");    
               } 
            } else{
                   JOptionPane.showMessageDialog(null,"Usuario Incorrecto");
            }                    
          }catch (Exception i){
              JOptionPane.showMessageDialog(null,"ERROR LOGIN"+i.getMessage());
          }
    }
    }


