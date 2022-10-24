package proyectofinal;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Nicolas
 */
public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
        this.setTitle("CLIENTES");
        limpiar();
    }

    private void limpiar(){
        txt_id.setText("");
        txt_apellidos.setText("");
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_edad.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_id = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        tbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("ID:");
        getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("NOMBRES:");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lbl_edad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_edad.setText("EDAD:");
        getContentPane().add(lbl_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("DIRECCIÓN:");
        getContentPane().add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lbl_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellido.setText("APELLIDOS:");
        getContentPane().add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        lbl_correo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_correo.setText("CORREO:");
        getContentPane().add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("TELEFONO:");
        getContentPane().add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));

        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });
        getContentPane().add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, -1));

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 160, -1));

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 160, -1));

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(153, 153, 153));
        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        tbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/milky-way-2695569__340.jpg"))); // NOI18N
        getContentPane().add(tbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        txt_direccion.transferFocus();
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        txt_id.transferFocus();
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        txt_nombre.transferFocus();
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        txt_apellidos.transferFocus();
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
        txt_edad.transferFocus();
    }//GEN-LAST:event_txt_edadActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        txt_correo.transferFocus();
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        txt_telefono.transferFocus();
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        conectar cc = new conectar();
        Connection cn = (Connection) cc.conexion();
        String nom, ape, dir, ema, edad, tel;
        String sql = "";
        nom = txt_nombre.getText();
        ape = txt_apellidos.getText();
        dir = txt_direccion.getText();
        ema = txt_correo.getText();
        edad = txt_edad.getText();
        tel = txt_telefono.getText();
        sql = "insert tblclientes (nombres, apellidos, direccion, email, edad, "
                + "telefono) values (?,?,?,?,?,?)";
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, ape);
            pst.setString(3, dir);
            pst.setString(4, ema);
            pst.setString(5, edad);
            pst.setString(6, tel);
            int registro = pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null, "Registro almacenado correctamente");
                limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro no almacenado" );
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       conectar cc = new conectar();
        Connection cn = cc.conexion();
        String id;
        String sql = "";
        id = txt_id.getText();
        sql = "delete from tblClientes where"
            + "Identifiacion = '"+id+"' ";
        System.out.println(sql);
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            int registro = pst.executeUpdate();
            if(registro>0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado para Eliminar");
            } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro no Eliminado" + e.getMessage());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String nom, ape, dir, ema, edad, tel;
        String sql = "";
        String id = txt_id.getText();
        nom = txt_nombre.getText();
        ape = txt_apellidos.getText();
        dir = txt_direccion.getText();
        ema = txt_correo.getText();
        edad = txt_edad.getText();
        tel = txt_telefono.getText();
        sql = "update tblClientes SET"
            + "Nombre = '"+nom+"' "
            + "Apellido = '"+ape+"' "
            + "Identifiacion = '"+id+"' "
            + "Dirección = '"+dir+"' "
            + "Correo = '"+ema+"' "
            + "Edad = '"+edad+"' "
            + "Telefono = '"+tel+"' ";
        System.out.println(sql);
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            int registro = pst.executeUpdate();
            if(registro>0){
                JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado para Actualizar");
            } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro no Actualizado" + e.getMessage());
        } 
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel tbl_fondo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
