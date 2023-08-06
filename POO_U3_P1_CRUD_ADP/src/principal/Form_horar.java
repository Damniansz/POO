/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import control.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


/**
 *
 * @author xaldo
 */
public class Form_horar extends javax.swing.JInternalFrame {
    Conexion cc=new Conexion();
    Connection con=cc.conexion();

    /**
     * Creates new form Form_horar
     */
    public Form_horar() {
        initComponents();
        mostrarDatos();
    // Configurar el comportamiento de la tabla al hacer clic en una fila
    TablaHorario.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int fila = TablaHorario.rowAtPoint(evt.getPoint());
            if (fila >= 0) {
                TablaHorario.setRowSelectionInterval(fila, fila);
            }
        }
    });
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnLabo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnProfesor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnInstrumentos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHorario = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Horario");

        jLabel2.setText("Materia:");

        btnMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POO", "COMPUTACION DIGITAL" }));

        jLabel3.setText("Laboratorio:");

        btnLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboActionPerformed(evt);
            }
        });

        jLabel4.setText("Profesor:");

        jLabel5.setText("Estado:");

        btnEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE", "OCUPADO", " " }));
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Instrumentos:");

        btnInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrumentosActionPerformed(evt);
            }
        });

        TablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaHorario);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo");

        btnRefrescar.setText("REFRESCAR");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnActualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar))
                                    .addComponent(btnProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btnLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnRefrescar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnLabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar1)
                            .addComponent(btnRefrescar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String codigoHorarioSeleccionado;
    
    public void mostrarDatos(){
        
   String titulos[] = {"Codigo","Materia", "Labo", "Profesor", "Estado", "Instrumentos"};
    String registro[] = new String[6];
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);
    String SQL = "SELECT * FROM `horario`";
    try {
        Statement st = (Statement) con.createStatement();
        ResultSet rs = st.executeQuery(SQL);
        while (rs.next()) {
            registro[0] = rs.getString("horar_codigo");
            registro[1] = rs.getString("horar_materia");
            registro[2] = rs.getString("horar_labo");
            registro[3] = rs.getString("horar_profesor");
            registro[4] = rs.getString("horar_estado");
            registro[5] = rs.getString("horar_instrumentos");
            
            modelo.addRow(registro);
        }
        TablaHorario.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e);
    }

    TablaHorario.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int fila = TablaHorario.rowAtPoint(evt.getPoint());
            if (fila >= 0) {
                TablaHorario.setRowSelectionInterval(fila, fila);
                codigoHorarioSeleccionado = TablaHorario.getValueAt(fila, 0).toString();
            }
        }
    });
        
    }
    public void limpiarDatos(){
        btnMateria.setSelectedItem(null);
        btnLabo.setText("");
        btnProfesor.setText("");
        btnInstrumentos.setText("");
        btnEstado.setSelectedItem(null);
    }
    
    
    
    
    
    public void insertarDatos(){
        
    }
    
    public void eliminarDatos(int filaSeleccionada){
        
        String codigoHorario = TablaHorario.getValueAt(filaSeleccionada, 0).toString();
        String SQL = "DELETE FROM horario WHERE horar_codigo = ?";
    try {
        PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
        pst.setString(1, codigoHorario);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e);
    }
    }
    
    
    private void btnLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaboActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String SQL = "INSERT INTO horario(horar_materia, horar_labo, horar_profesor,horar_instrumentos, horar_estado)values(?,?,?,?,?)";
        try {
            int select = btnMateria.getSelectedIndex();
            int select2 = btnEstado.getSelectedIndex();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,btnMateria.getSelectedItem().toString());
            pst.setString(2,btnLabo.getText());
            pst.setString(3,btnProfesor.getText());
            pst.setString(4,btnInstrumentos.getText());
            pst.setString(5,btnEstado.getSelectedItem().toString());
            
            
            pst.execute();
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   
        // Verificar si se ha seleccionado un estudiante en la tabla
    if (codigoHorarioSeleccionado == null) {
        JOptionPane.showMessageDialog(null, "Seleccione un estudiante para editar.");
        return;
    }

    String SQL = "SELECT * FROM horario WHERE horar_codigo = ?";
    try {
        PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
        pst.setString(1, codigoHorarioSeleccionado);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Cargar los datos del estudiante seleccionado en los campos de texto
            btnMateria.setSelectedItem(rs.getString("horar_materia"));
            btnLabo.setText(rs.getString("horar_labo"));
            btnProfesor.setText(rs.getString("horar_profesor"));
            btnInstrumentos.setText(rs.getString("horar_instrumentos"));
            btnEstado.setSelectedItem(rs.getString("horar_estado"));
            
            
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos del estudiante: " + e);
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void btnInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstrumentosActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        int filaSeleccionada = TablaHorario.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
        return;
    }
    eliminarDatos(filaSeleccionada);
    mostrarDatos(); // Actualizar la tabla después de eliminar el registro
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed

        int filaSeleccionada = TablaHorario.getSelectedRow();
         btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        String codigoHorario = TablaHorario.getValueAt(filaSeleccionada, 0).toString();
        String nuevoMateria = btnMateria.getSelectedItem().toString();
        String nuevoLaboratorio = btnLabo.getText();
        String nuevoProfesor = btnProfesor.getText();
        String nuevoEstado = btnEstado.getSelectedItem().toString();
        String nuevoInstrumentos = btnInstrumentos.getText();


        String SQL = "UPDATE horario SET horar_materia=?, horar_labo=?, horar_profesor=?, horar_instrumentos=?, horar_estado=?  WHERE horar_codigo=?";
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            
            pst.setString(1, nuevoMateria);
            pst.setString(2, nuevoLaboratorio);
            pst.setString(3, nuevoProfesor);
            pst.setString(4, nuevoEstado);
            pst.setString(5, nuevoInstrumentos);
            pst.setString(6, codigoHorario);
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
            mostrarDatos(); // Actualizar la tabla después de la actualización
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e);
        }
    }                                      

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
          int filaSeleccionada = TablaHorario.getSelectedRow();
            if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
            return;
    }
    eliminarDatos(filaSeleccionada);
    mostrarDatos();

    }//GEN-LAST:event_btnRefrescarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_horar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_horar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_horar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_horar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_horar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHorario;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JComboBox<String> btnEstado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField btnInstrumentos;
    private javax.swing.JTextField btnLabo;
    private javax.swing.JComboBox<String> btnMateria;
    private javax.swing.JTextField btnProfesor;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}