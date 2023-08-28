package vista;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private DBCollection loginCollection;

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
        
        // Conectarse a la base de datos y la colección
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        DB database = mongoClient.getDB("Registro"); // Cambiar por el nombre de tu base de datos
        loginCollection = database.getCollection("login"); // Cambiar por el nombre de tu colección
    }

    private void validarCredenciales() throws SQLException {
        try {
            String usuario = usuarioField.getText();
            String contraseña = new String(contraField.getPassword());

            BasicDBObject query = new BasicDBObject("usuario", usuario)
                    .append("contraseña", contraseña);
            DBCursor cursor = loginCollection.find(query);

            if (cursor.hasNext()) {
                JOptionPane.showMessageDialog(null, "Entrando...");

                sesionIniciada = true;
                dispose();

                if (sesionIniciada) {
                    Menu menu = new Menu();
                    menu.setVisible(sesionIniciada);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña inválida.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

  
}
