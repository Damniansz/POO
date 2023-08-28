
package vista;

import Control.Conexion;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;




public class Profesor extends JFrame {
    
    
     private JTextField codigoField, cedulaField, apellidoField, nombreField, celularField, direccionField;
        private JComboBox<String> materiaComboBox;
        private JRadioButton activoRadioButton, inactivoRadioButton;
        private JButton guardarButton,editarButton,eliminarButton;
    private DefaultTableModel tableModel;
         private JTable table;  
        private int selectedIndex = -1;
        private DBCollection tabla1; 

        public Profesor() {
        Conexion cc = new Conexion();
        tabla1 = cc.conexionProfesor();
        
        setSize(800, 800);    
        setTitle("Profesor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null); // Usar un diseño absoluto

        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(30, 70, 350, 40);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(30, 100, 350, 40);
        add(codigoField);


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

        JLabel codigoLabe5 = new JLabel("Celular:");
        codigoLabe5.setBounds(30, 310, 350, 40);
        add(codigoLabe5);

        celularField = new JTextField();
        celularField.setBounds(30, 340, 350, 40);
        add(celularField);


        JLabel materiaLabel = new JLabel("Titulo:");
        materiaLabel.setBounds(30, 430, 250, 40);
        add(materiaLabel);

        String[] titulo = {"Ingeniero", "Licenciado", "Magister"};
        materiaComboBox = new JComboBox<>(titulo);
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

         String[] columnNames = {"Código",  "Apellido", "Nombre", "Celular", "Titulo",  "Estado"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRowClicked();
            }
        });
        
        JButton imprimirPDFButton = new JButton("Imprimir PDF");
            imprimirPDFButton.setBounds(400, 490, 340, 30);
            imprimirPDFButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        generatePDF();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            add(imprimirPDFButton);
        
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
                celularField.setText(table.getValueAt(selectedIndex, 4).toString());
                direccionField.setText(table.getValueAt(selectedIndex, 5).toString());
                materiaComboBox.setSelectedItem(table.getValueAt(selectedIndex, 6).toString());
                String estado = table.getValueAt(selectedIndex, 7).toString();
                activoRadioButton.setSelected(estado.equals("Activo"));
                inactivoRadioButton.setSelected(estado.equals("Inactivo"));
            }
        }
        
        private void insertarDatos() {
        try {
        String codigo = codigoField.getText();
        String apellido = apellidoField.getText();
        String nombre = nombreField.getText();
        String celular = celularField.getText();
        String titulo = (String) materiaComboBox.getSelectedItem();
        String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

        BasicDBObject document = new BasicDBObject();
        document.put("profe_codigo", codigo);
        document.put("profe_apellido", apellido);
        document.put("profe_nombre", nombre);
        document.put("profe_celular", celular);
        document.put("profe_titulo", titulo);
        document.put("profe_estado", estado);

        tabla1.insert(document);

        JOptionPane.showMessageDialog(null, "Registro exitoso");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de inserción: " + e);
    }
    }

    private void mostrarDatos() {
        // Se crea los títulos de la tabla y el nombre de la base de datos
    String titulos[] = {"Código", "Apellido", "Nombre", "Celular", "Titulo", "Estado"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);

    // Consulta MongoDB para obtener los datos
    try {
        DBCursor cursor = tabla1.find();
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String registro[] = {
                getStringValue(obj, "profe_codigo"),
                getStringValue(obj, "profe_apellido"),
                getStringValue(obj, "profe_nombre"),
                getStringValue(obj, "profe_celular"),
                getStringValue(obj, "profe_titulo"),
                getStringValue(obj, "profe_estado")
            };
            modelo.addRow(registro);
        }
        table.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e);
    }
}

private String getStringValue(DBObject obj, String key) {
    Object value = obj.get(key);
    return value != null ? value.toString() : "";

    }

    private void eliminarDatos() {
        
        
         int filaSeleccionada = table.getSelectedRow();
    if (filaSeleccionada >= 0) {
        try {
            String codigo = table.getValueAt(filaSeleccionada, 0).toString();
            BasicDBObject query = new BasicDBObject("profe_codigo", codigo);
            tabla1.remove(query);
            JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en eliminar registro" + e.getMessage());
        }
    }
    }

    private void editarDatos() {
         if (selectedIndex >= 0) {
        String codigo = codigoField.getText();
        String apellido = apellidoField.getText();
        String nombre = nombreField.getText();
        String celular = celularField.getText();
        String titulo = (String) materiaComboBox.getSelectedItem();
        String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

        BasicDBObject query = new BasicDBObject("profe_codigo", codigo);
        BasicDBObject updatedData = new BasicDBObject()
            .append("$set", new BasicDBObject()
                .append("profe_apellido", apellido)
                .append("profe_nombre", nombre)
                .append("profe_celular", celular)
                .append("profe_titulo", titulo)
                .append("profe_estado", estado)
            );

        tabla1.update(query, updatedData);

        JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");

        selectedIndex = -1;
        table.clearSelection();
        codigoField.setText("");
        apellidoField.setText("");
        nombreField.setText("");
        celularField.setText("");
        materiaComboBox.setSelectedIndex(0);
        activoRadioButton.setSelected(true);
    }
             
    }
    
    private void generatePDF() throws FileNotFoundException {
    Document document = new Document();
    try {
        PdfWriter.getInstance(document, new FileOutputStream("professors.pdf"));
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
    



        /*private void guardarDatos() {
            String codigo = codigoField.getText();
            String apellido = apellidoField.getText();
            String nombre = nombreField.getText();
            String celular = celularField.getText();
            String titulo = (String) materiaComboBox.getSelectedItem();
            String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

            tableModel.addRow(new Object[]{codigo, apellido, nombre, celular, titulo, estado});

            // Limpiar los campos después de guardar
            codigoField.setText("");
            apellidoField.setText("");
            nombreField.setText("");
            celularField.setText("");
            materiaComboBox.setSelectedIndex(0);
            activoRadioButton.setSelected(true);
        }

        private void editarDatos() {
            if (selectedIndex >= 0) {
                tableModel.setValueAt(codigoField.getText(), selectedIndex, 0);
                tableModel.setValueAt(apellidoField.getText(), selectedIndex, 1);
                tableModel.setValueAt(nombreField.getText(), selectedIndex, 2);
                tableModel.setValueAt(celularField.getText(), selectedIndex, 3);
                tableModel.setValueAt(materiaComboBox.getSelectedItem(), selectedIndex, 4);
                tableModel.setValueAt(activoRadioButton.isSelected() ? "Activo" : "Inactivo", selectedIndex, 5);

                // Limpiar los campos después de editar
                selectedIndex = -1;
                table.clearSelection();
                codigoField.setText("");
                apellidoField.setText("");
                nombreField.setText("");
                celularField.setText("");
                materiaComboBox.setSelectedIndex(0);
                activoRadioButton.setSelected(true);
            }
        }

        private void eliminarDatos() {
            if (selectedIndex >= 0) {
                tableModel.removeRow(selectedIndex);
                selectedIndex = -1;
                table.clearSelection();
                codigoField.setText("");
                apellidoField.setText("");
                nombreField.setText("");
                celularField.setText("");
                materiaComboBox.setSelectedIndex(0);
                activoRadioButton.setSelected(true);
            }
        }*/
    
}
