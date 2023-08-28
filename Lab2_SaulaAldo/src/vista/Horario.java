package vista;

import Control.Conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class Horario extends JFrame {
    //Se instancia objetos para conectarse
   private DBCollection horario;

    
    private JTextField codigoField, cedulaField, apellidoField, nombreField, telefonoField, direccionField;
        private JComboBox<String> materiaComboBox,laboComboBox,instrumentosComboBox;
        private JRadioButton activoRadioButton, inactivoRadioButton;
        private JButton guardarButton,editarButton,eliminarButton;
        private DefaultTableModel tableModel;
         private JTable table;  
        private int selectedIndex = -1;

        public Horario() {
         Conexion cc = new Conexion();
         horario = cc.conexionHorario();;
        
        setSize(800, 800);    
        setTitle("Horario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null); // Usar un diseño absoluto

        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(30, 70, 350, 40);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(30, 100, 350, 40);
        add(codigoField);

        JLabel materiaLabel = new JLabel("Materia:");
        materiaLabel.setBounds(30, 130, 350, 40);
        add(materiaLabel);

        String[] materias = {"POO", "COMPUTACION DIGITAL", "CALCULO"};
        materiaComboBox = new JComboBox<>(materias);
        materiaComboBox.setBounds(60, 190, 250, 40);
        add(materiaComboBox);

        JLabel laboLabel = new JLabel("Laboratorios:");
        laboLabel.setBounds(30, 220, 250, 40);
        add(laboLabel);

        String[] laboratorios = {"LAB1", "LAB2", "LAB3"};
        laboComboBox = new JComboBox<>(laboratorios);
        laboComboBox.setBounds(60, 250, 250, 40);
        add(laboComboBox);

        JLabel codigoLabe4 = new JLabel("Profesor:");
        codigoLabe4.setBounds(30, 330, 350, 40);
        add(codigoLabe4);

        nombreField = new JTextField();
        nombreField.setBounds(30, 360, 350, 40);
        add(nombreField);
   

        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setBounds(30, 390, 350, 40);
        add(estadoLabel);

        activoRadioButton = new JRadioButton("Activo");
        inactivoRadioButton = new JRadioButton("Inactivo");
        activoRadioButton.setBounds(130, 400, 100, 30);
        inactivoRadioButton.setBounds(130, 440, 100, 30);
        ButtonGroup estadoGroup = new ButtonGroup();
        estadoGroup.add(activoRadioButton);
        estadoGroup.add(inactivoRadioButton);
        add(activoRadioButton);
        add(inactivoRadioButton);
        
        JLabel instrumentos = new JLabel("Instrumentos:");
        instrumentos.setBounds(30, 490, 350, 40);
        add(instrumentos);
        
        String[] instrumentos1 = {"PC", "QUIMICOS", "VACAS"};
        instrumentosComboBox = new JComboBox<>(instrumentos1);
        instrumentosComboBox.setBounds(60, 520, 350, 40);
        add(instrumentosComboBox);

        

        guardarButton = new JButton("Guardar");
        guardarButton.setBounds(400, 550, 100, 30);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //guardarDatos();
                insertarDatos();
                mostrarDatos();
                        
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

         String[] columnNames = {"Código", "Materia", "Laboratorio", "Profesor", "Estado", "Instrumentos"};
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
                materiaComboBox.setSelectedItem(table.getValueAt(selectedIndex, 1).toString());
                laboComboBox.setSelectedItem(table.getValueAt(selectedIndex, 2).toString());
                nombreField.setText(table.getValueAt(selectedIndex, 3).toString());
                instrumentosComboBox.setSelectedItem(table.getValueAt(selectedIndex, 4).toString());
                String estado = table.getValueAt(selectedIndex, 5).toString();
                activoRadioButton.setSelected(estado.equals("Activo"));
                inactivoRadioButton.setSelected(estado.equals("Inactivo"));
            }
        }
        
        
        public void insertarDatos() {
            try {
            BasicDBObject document = new BasicDBObject()
        .append("horario_codigo", codigoField.getText())
        .append("horario_materia", (String) materiaComboBox.getSelectedItem())
        .append("horario_laboratorios", (String) laboComboBox.getSelectedItem())
        .append("horario_profesor", nombreField.getText())
        .append("horario_instrumentos", (String) instrumentosComboBox.getSelectedItem())
        .append("horario_estado", activoRadioButton.isSelected() ? "Activo" : "Inactivo");
        horario.insert(document); // Asegúrate de que estás usando la colección "horario"

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de inserción: " + e);
        }
            
        }
        public void mostrarDatos(){
            String titulos[] = {"Código", "Materia", "Laboratorios", "Profesor", "Estado", "Instrumentos"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);

    try {
        DBCursor cursor = horario.find();
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String registro[] = {
                obj.get("horario_codigo").toString(),
                obj.get("horario_materia") != null ? obj.get("horario_materia").toString() : "",
                obj.get("horario_laboratorios") != null ? obj.get("horario_laboratorios").toString() : "",
                obj.get("horario_profesor") != null ? obj.get("horario_profesor").toString() : "",
                obj.get("horario_estado") != null ? obj.get("horario_estado").toString() : "",
                obj.get("horario_instrumentos") != null ? obj.get("horario_instrumentos").toString() : ""
            };
            modelo.addRow(registro);
        }
        table.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e);
    }
        }
       
    
        
        public void eliminarDatos(){
        
        int filaSeleccionada = table.getSelectedRow();
        if (filaSeleccionada >= 0) {
            try {
                String codigo = table.getValueAt(filaSeleccionada, 0).toString();
                BasicDBObject query = new BasicDBObject("horario_codigo", codigo);
                horario.remove(query);
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en eliminar registro" + e.getMessage());
            }
        }
    }
       
         private void editarDatos() {
             if (selectedIndex >= 0) {
            tableModel.setValueAt(codigoField.getText(), selectedIndex, 0);
            tableModel.setValueAt(materiaComboBox.getSelectedItem(), selectedIndex, 1);
            tableModel.setValueAt(laboComboBox.getSelectedItem(), selectedIndex, 2);
            tableModel.setValueAt(nombreField.getText(), selectedIndex, 3);
            tableModel.setValueAt(instrumentosComboBox.getSelectedItem(), selectedIndex, 4);
            tableModel.setValueAt(activoRadioButton.isSelected() ? "Activo" : "Inactivo", selectedIndex, 5);

            try {
                BasicDBObject query = new BasicDBObject("horario_codigo", codigoField.getText());
                BasicDBObject updatedData = new BasicDBObject()
                        .append("$set", new BasicDBObject()
                                .append("horario_materia", (String) materiaComboBox.getSelectedItem())
                                .append("horario_laboratorios", (String) laboComboBox.getSelectedItem())
                                .append("horario_profesor", nombreField.getText())
                                .append("horario_instrumentos", (String) instrumentosComboBox.getSelectedItem())
                                .append("horario_estado", activoRadioButton.isSelected() ? "Activo" : "Inactivo")
                        );

                horario.update(query, updatedData);

                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar registro" + e);
            }

            selectedIndex = -1;
            table.clearSelection();
            codigoField.setText("");
            materiaComboBox.setSelectedIndex(0);
            laboComboBox.setSelectedIndex(0);
            nombreField.setText("");
            instrumentosComboBox.setSelectedIndex(0);
            activoRadioButton.setSelected(true);
        }
    }
         private void generatePDF() throws FileNotFoundException {
    Document document = new Document();
    try {
        PdfWriter.getInstance(document, new FileOutputStream("Horario.pdf"));
        document.open();

        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
        PdfPCell cell;

        // Add table headers
        for (int i = 0; i < table.getColumnCount(); i++) {
            cell = new PdfPCell(new Paragraph(table.getColumnName(i)));
            pdfTable.addCell(cell);
        }

        // Add table data
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                pdfTable.addCell(table.getValueAt(i, j).toString());
            }
        }

        document.add(pdfTable);
        document.close();

        JOptionPane.showMessageDialog(null, "PDF generated successfully.");
    } catch (DocumentException | FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Error generating PDF: " + e.getMessage());
    }
}
         }


        
        

        /*private void guardarDatos() {
            String codigo = codigoField.getText();
            String materia = (String) materiaComboBox.getSelectedItem();
            String laboratorio = (String) laboComboBox.getSelectedItem();
            String profesor = nombreField.getText();
            String instrumentos = (String) instrumentosComboBox.getSelectedItem();
            String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

            tableModel.addRow(new Object[]{codigo, materia, laboratorio, profesor, estado, instrumentos});

            // Limpiar los campos después de guardar
            codigoField.setText("");
            materiaComboBox.setSelectedIndex(0);
            laboComboBox.setSelectedIndex(0);
            nombreField.setText("");
            instrumentosComboBox.setSelectedIndex(0);
            activoRadioButton.setSelected(true);
        }*/

        /*private void editarDatos() {
            if (selectedIndex >= 0) {
                tableModel.setValueAt(codigoField.getText(), selectedIndex, 0);
                tableModel.setValueAt(materiaComboBox.getSelectedItem(), selectedIndex, 1);
                tableModel.setValueAt(laboComboBox.getSelectedItem(), selectedIndex,2 );
                tableModel.setValueAt(nombreField.getText(), selectedIndex, 3);
                tableModel.setValueAt(instrumentosComboBox.getSelectedItem(), selectedIndex, 4);
                tableModel.setValueAt(activoRadioButton.isSelected() ? "Activo" : "Inactivo", selectedIndex, 5);

                // Limpiar los campos después de editar
                selectedIndex = -1;
                table.clearSelection();
                codigoField.setText("");
                materiaComboBox.setSelectedIndex(0);
                laboComboBox.setSelectedIndex(0);
                nombreField.setText("");
                instrumentosComboBox.setSelectedIndex(0);
                activoRadioButton.setSelected(true);
            }
        }*/

        /*private void eliminarDatos() {
            if (selectedIndex >= 0) {
                tableModel.removeRow(selectedIndex);
                selectedIndex = -1;
                table.clearSelection();
                codigoField.setText("");
                materiaComboBox.setSelectedIndex(0);
                laboComboBox.setSelectedIndex(0);
                nombreField.setText("");
                instrumentosComboBox.setSelectedIndex(0);
                activoRadioButton.setSelected(true);
            }
        }*/
