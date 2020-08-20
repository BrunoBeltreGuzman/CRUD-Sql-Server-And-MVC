/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Estudiante;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author diosl
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    Conexion c = new Conexion();
    Consultas c1 = new Consultas();

    public Ventana(){
        initComponents();
    }
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        texApellido = new javax.swing.JTextField();
        texEdad = new javax.swing.JTextField();
        texCurso = new javax.swing.JTextField();
        texId = new javax.swing.JTextField();
        texNombre = new javax.swing.JTextField();
        btnBruscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEstudiantes = new javax.swing.JTable();
        texResultado = new javax.swing.JLabel();
        cbBuscar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1230, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 199));
        jLabel1.setText("CRUD SQL SERVER AND MVC ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Apellido: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Edad: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Curso: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nombre: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        texApellido.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(texApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 320, 35));

        texEdad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(texEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 320, 35));

        texCurso.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(texCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 320, 35));

        texId.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(texId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 480, -1));

        texNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(texNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 320, 35));

        btnBruscar.setBackground(new java.awt.Color(51, 0, 199));
        btnBruscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBruscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBruscar.setText("Buscar");
        btnBruscar.setBorder(null);
        btnBruscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBruscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBruscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBruscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 110, 35));

        btnModificar.setBackground(new java.awt.Color(51, 0, 199));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 260, 120, 35));

        btnEliminar.setBackground(new java.awt.Color(51, 0, 199));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 320, 120, 35));

        btnLimpiar.setBackground(new java.awt.Color(51, 0, 199));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Linpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 380, 120, 35));

        btnRegistrar.setBackground(new java.awt.Color(51, 0, 199));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 200, 120, 35));

        btnPdf.setBackground(new java.awt.Color(51, 0, 199));
        btnPdf.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnPdf.setText("Generar PDF");
        btnPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 610, 50));

        jtEstudiantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEstudiantes.setMinimumSize(new java.awt.Dimension(0, 0));
        jtEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEstudiantes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 610, 390));

        texResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(texResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 610, 30));

        cbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Apellido", "Edad", "Curso" }));
        jPanel1.add(cbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 23));

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
        Document doc = new Document();
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet rs;
        Statement st;
        String sql;
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/Reporte PDF.pdf"));
            
            //Create Image and Text
            Image image = Image.getInstance("src/Vista/foto.png");
            image.scaleToFit(550, 1000);
            image.setAlignment(Chapter.ALIGN_CENTER);
            
            Paragraph parafo = new Paragraph();
            parafo.setAlignment(Chapter.ALIGN_CENTER);
            parafo.add("© 2020 BrunoDev \n\n");
            parafo.setFont(FontFactory.getFont("Arial", 14 , Font.BOLD, BaseColor.DARK_GRAY));
            parafo.add("Reporte PDF \n\n");
                     
            doc.open();
            
            //Add Image
            doc.add(image);
            
            //Add Texto
            doc.add(parafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("Id");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Edad");
            tabla.addCell("Curso");
            tabla.addCell("Estado");

            try {
                connection = c.getConexion();
                
                sql = "SELECT * FROM Estudiantes";

                st = (Statement) connection.createStatement();

                rs = st.executeQuery(sql);
                
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell("Activo");
                    }while(rs.next());
                    
                    doc.add(tabla);
                    JOptionPane.showMessageDialog(this, "Documento creado Correctamente");
                }

                
            } catch (DocumentException | HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error BD", "ERROR SQL", ERROR_MESSAGE);
            }
            doc.close();
            
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Error al generar Reporte", "ERROR SQL", ERROR_MESSAGE);
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error al añadir image", "ERROR SQL", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnBruscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBruscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBruscarActionPerformed

    
    private void jtEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEstudiantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEstudiantesMouseClicked

    
     /**
     * Metodos Setters y Getters
     */
    public JButton getBtnBruscar() {
        return btnBruscar;
    }

    public void setBtnBruscar(JButton btnBruscar) {
        this.btnBruscar = btnBruscar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JTextField getTexApellido() {
        return texApellido;
    }

    public void setTexApellido(JTextField texApellido) {
        this.texApellido = texApellido;
    }

    public JTextField getTexCurso() {
        return texCurso;
    }

    public void setTexCurso(JTextField texCurso) {
        this.texCurso = texCurso;
    }

    public JTextField getTexEdad() {
        return texEdad;
    }

    public void setTexEdad(JTextField texEdad) {
        this.texEdad = texEdad;
    }

    public JTextField getTexId() {
        return texId;
    }

    public void setTexId(JTextField texId) {
        this.texId = texId;
    }

    public JTextField getTexNombre() {
        return texNombre;
    }

    public JButton getBtnPdf() {
        return btnPdf;
    }

    public void setBtnPdf(JButton btnPdf) {
        this.btnPdf = btnPdf;
    }

    public JTable getJtEstudiantes() {
        return jtEstudiantes;
    }

    public void setJtEstudiantes(JTable jtEstudiantes) {
        this.jtEstudiantes = jtEstudiantes;
    }
    public void setTexNombre(JTextField texNombre) {
        this.texNombre = texNombre;
    }

    public JLabel getTexResultado() {
        return texResultado;
    }

    public void setTexResultado(JLabel texResultado) {
        this.texResultado = texResultado;
    }

    public JComboBox<String> getCbBuscar() {
        return cbBuscar;
    }

    public void setCbBuscar(JComboBox<String> cbBuscar) {
        this.cbBuscar = cbBuscar;
    }
    
    
     /**
     * Metodos Setters y Getters
     */

   
    

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBruscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEstudiantes;
    private javax.swing.JTextField texApellido;
    private javax.swing.JTextField texCurso;
    private javax.swing.JTextField texEdad;
    private javax.swing.JTextField texId;
    private javax.swing.JTextField texNombre;
    private javax.swing.JLabel texResultado;
    // End of variables declaration//GEN-END:variables

}
