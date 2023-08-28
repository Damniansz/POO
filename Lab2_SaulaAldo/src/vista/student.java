package Vista;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class student extends JFrame {

    //Se instancia objetos para conectarse
    Conexion cc = new Conexion();
    Connection con = cc.conexion();
    private JTextField codigoField, cedulaField, apellidoField, nombreField, telefonoField, direccionField;
    private JComboBox<String> materiaComboBox;
    private JRadioButton activoRadioButton, inactivoRadioButton;
    private JButton guardarButton, editarButton, eliminarButton;
    private DefaultTableModel tableModel;
    private JTable table;
    private int selectedIndex = -1;

    public student() {

        setSize(800, 800);
        setTitle("Esudiante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null); // Usar un diseño absoluto

        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(30, 70, 350, 40);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(30, 100, 350, 40);
        add(codigoField);

        JLabel codigoLabe2 = new JLabel("Cedula:");
        codigoLabe2.setBounds(30, 130, 350, 50);
        add(codigoLabe2);

        cedulaField = new JTextField();
        cedulaField.setBounds(30, 160, 350, 40);
        add(cedulaField);

        JLabel codigoLabe3 = new JLabel("Apellido:");
        codigoLabe3.setBounds(30, 190, 350, 40);
        add(codigoLabe3);

        apellidoField = new JTextField();
        apellidoField.setBounds(30, 220, 350, 40);
        add(apellidoField);

        JLabel codigoLabe4 = new JLabel("Nombre:");
        codigoLabe4.setBounds(30, 250, 350, 40);
        add(codigoLabe4);

        nombreField = new JTextField();
        nombreField.setBounds(30, 280, 350, 40);
        add(nombreField);

        JLabel codigoLabe5 = new JLabel("Telefono:");
        codigoLabe5.setBounds(30, 310, 350, 40);
        add(codigoLabe5);

        telefonoField = new JTextField();
        telefonoField.setBounds(30, 340, 350, 40);
        add(telefonoField);

        JLabel codigoLabe6 = new JLabel("Direccion:");
        codigoLabe6.setBounds(30, 370, 350, 40);
        add(codigoLabe6);

        direccionField = new JTextField();
        direccionField.setBounds(30, 400, 350, 40);
        add(direccionField);

        JLabel materiaLabel = new JLabel("Materia:");
        materiaLabel.setBounds(30, 430, 250, 40);
        add(materiaLabel);

        String[] materias = {"POO", "COMPUTACION DIGITAL", "CALCULO"};
        materiaComboBox = new JComboBox<>(materias);
        materiaComboBox.setBounds(60, 470, 250, 40);
        add(materiaComboBox);

        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setBounds(30, 520, 350, 40);
        add(estadoLabel);

        activoRadioButton = new JRadioButton("Activo");
        inactivoRadioButton = new JRadioButton("Inactivo");
        activoRadioButton.setBounds(130, 510, 100, 30);
        inactivoRadioButton.setBounds(130, 540, 100, 30);
        ButtonGroup estadoGroup = new ButtonGroup();
        estadoGroup.add(activoRadioButton);
        estadoGroup.add(inactivoRadioButton);
        add(activoRadioButton);
        add(inactivoRadioButton);

        guardarButton = new JButton("Guardar");
        guardarButton.setBounds(400, 550, 100, 30);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                insertarDatos();
                mostrarDatos();
                //guardarDatos();
            }
        });
        add(guardarButton);

        editarButton = new JButton("Editar");
        editarButton.setBounds(520, 550, 100, 30);
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarDatos();
                mostrarDatos();
            }
        });
        add(editarButton);

        eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(640, 550, 100, 30);
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarDatos();
                mostrarDatos();
            }
        });
        add(eliminarButton);

        String[] columnNames = {"Código", "Cédula", "Apellido", "Nombre", "Teléfono", "Dirección", "Materia", "Estado"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRowClicked();
            }
        });
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 600, 650, 150);
        add(scrollPane);
    }

    private void tableRowClicked() {
        selectedIndex = table.getSelectedRow();
        if (selectedIndex >= 0) {
            codigoField.setText(table.getValueAt(selectedIndex, 0).toString());
            cedulaField.setText(table.getValueAt(selectedIndex, 1).toString());
            apellidoField.setText(table.getValueAt(selectedIndex, 2).toString());
            nombreField.setText(table.getValueAt(selectedIndex, 3).toString());
            telefonoField.setText(table.getValueAt(selectedIndex, 4).toString());
            direccionField.setText(table.getValueAt(selectedIndex, 5).toString());
            materiaComboBox.setSelectedItem(table.getValueAt(selectedIndex, 6).toString());
            String estado = table.getValueAt(selectedIndex, 7).toString();
            activoRadioButton.setSelected(estado.equals("Activo"));
            inactivoRadioButton.setSelected(estado.equals("Inactivo"));
        }
    }

    /*private void guardarDatos() {
        String codigo = codigoField.getText();
        String cedula = cedulaField.getText();
        String apellido = apellidoField.getText();
        String nombre = nombreField.getText();
        String telefono = telefonoField.getText();
        String direccion = direccionField.getText();
        String materia = (String) materiaComboBox.getSelectedItem();
        String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

        tableModel.addRow(new Object[]{codigo, cedula, apellido, nombre, telefono, direccion, materia, estado});

        // Limpiar los campos después de guardar
        codigoField.setText("");
        cedulaField.setText("");
        apellidoField.setText("");
        nombreField.setText("");
        telefonoField.setText("");
        direccionField.setText("");
        materiaComboBox.setSelectedIndex(0);
        activoRadioButton.setSelected(true);
    }*/

    private void editarDatos() {
    if (selectedIndex >= 0) {
        // Update the table model
        table.setValueAt(codigoField.getText(), selectedIndex, 0);
        table.setValueAt(cedulaField.getText(), selectedIndex, 1);
        table.setValueAt(apellidoField.getText(), selectedIndex, 2);
        table.setValueAt(nombreField.getText(), selectedIndex, 3);
        table.setValueAt(telefonoField.getText(), selectedIndex, 4);
        table.setValueAt(direccionField.getText(), selectedIndex, 5);
        table.setValueAt(materiaComboBox.getSelectedItem(), selectedIndex, 6);
        table.setValueAt(activoRadioButton.isSelected() ? "Activo" : "Inactivo", selectedIndex, 7);

        try {
            String SQL = "UPDATE estudiante SET estud_codigo=?, estud_cedula=?, estud_apellido=?, estud_nombre=?, estud_telefono=?, estud_direccion=?, estud_materia=?, estud_estado=? WHERE estud_codigo=?";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            
            pst.setString(1, codigoField.getText());
            pst.setString(2, cedulaField.getText());
            pst.setString(3, apellidoField.getText());
            pst.setString(4, nombreField.getText());
            pst.setString(5, telefonoField.getText());
            pst.setString(6, direccionField.getText());
            pst.setString(7, (String) materiaComboBox.getSelectedItem());
            pst.setString(8, activoRadioButton.isSelected() ? "Activo" : "Inactivo");
            pst.setString(9, codigoField.getText()); // Use the same ID for updating
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar registro" + e);
        }

        selectedIndex = -1;
        table.clearSelection();
        codigoField.setText("");
        cedulaField.setText("");
        apellidoField.setText("");
        nombreField.setText("");
        telefonoField.setText("");
        direccionField.setText("");
        materiaComboBox.setSelectedIndex(0);
        activoRadioButton.setSelected(true);
    }
}

    /*private void eliminarDatos() {
        if (selectedIndex >= 0) {
            tableModel.removeRow(selectedIndex);
            selectedIndex = -1;
            table.clearSelection();
            codigoField.setText("");
            cedulaField.setText("");
            apellidoField.setText("");
            nombreField.setText("");
            telefonoField.setText("");
            direccionField.setText("");
            materiaComboBox.setSelectedIndex(0);
            activoRadioButton.setSelected(true);
        }
    }*/
    
    public void eliminarDatos(){
        
        int filaSeleccionada=table.getSelectedRow();
        try {
            String SQL="delete from estudiante where estud_codigo="+table.getValueAt(filaSeleccionada, 0);
            Statement st=(Statement) con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en eliminar registro"+e.getMessage());
        }
    }
    
    public void mostrarDatos(){
        //Se crea los titulos de la tabla y el nombre de la base de datos
        String titulos[]={"Códigos","Cedula","Apellidos","Nombres","Telefono","Direccion","Materia","Estado"};
        String registro[]=new String [8];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `estudiante`";
        //Se agrega los datos de la base de datos al arreglo y luego a la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro [0]=rs.getString("estud_codigo");
                registro [1]=rs.getString("estud_cedula");
                registro [2]=rs.getString("estud_apellido");
                registro [3]=rs.getString("estud_nombre");
                registro [4]=rs.getString("estud_telefono");
                registro [5]=rs.getString("estud_direccion");
                registro [6]=rs.getString("estud_materia");
                registro [7]=rs.getString("estud_estado");
                modelo.addRow(registro);
            }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }

    public void insertarDatos() {
    try {
        // Corrected SQL statement with all 8 placeholders
        String SQL = "INSERT INTO estudiante(estud_codigo,estud_cedula,estud_apellido,estud_nombre,estud_telefono,estud_direccion,estud_materia,estud_estado) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

        // Setting all 8 parameters
        pst.setString(1, codigoField.getText());
        pst.setString(2, cedulaField.getText());
        pst.setString(3, apellidoField.getText());
        pst.setString(4, nombreField.getText());
        pst.setString(5, telefonoField.getText());
        pst.setString(6, direccionField.getText());
        pst.setString(7, (String) materiaComboBox.getSelectedItem()); // Materia
        pst.setString(8, activoRadioButton.isSelected() ? "Activo" : "Inactivo"); // Estado

        pst.execute();
        JOptionPane.showMessageDialog(null, "Registro exitoso");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de insercion" + e);
    }
}
    

}



