package proyectofinal;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Nicolas
 */
public class Producto extends javax.swing.JFrame {

    public Producto() {
        initComponents();
        this.setTitle("PRODUCTOS");
        limpiar();
    }

    private void limpiar(){
        txt_codigo_pro.setText("");
        txt_nombre_pro.setText("");
        txt_valor_pro.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_codigo_pro = new javax.swing.JLabel();
        lbl_nombre_pro = new javax.swing.JLabel();
        lbl_valor_pro = new javax.swing.JLabel();
        txt_codigo_pro = new javax.swing.JTextField();
        txt_nombre_pro = new javax.swing.JTextField();
        txt_valor_pro = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_codigo_pro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo_pro.setText("CODIGO PRODUCTO:");
        getContentPane().add(lbl_codigo_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        lbl_nombre_pro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre_pro.setText("NOMBRE PRODUCTO:");
        getContentPane().add(lbl_nombre_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        lbl_valor_pro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_valor_pro.setText("VALOR PRODUCTO:");
        getContentPane().add(lbl_valor_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        txt_codigo_pro.setEditable(false);
        txt_codigo_pro.setBackground(new java.awt.Color(153, 153, 153));
        txt_codigo_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_proActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigo_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 130, -1));

        txt_nombre_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_proActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 130, -1));

        txt_valor_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor_proActionPerformed(evt);
            }
        });
        getContentPane().add(txt_valor_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, -1));

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/12B.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_proActionPerformed
        txt_nombre_pro.transferFocus();
    }//GEN-LAST:event_txt_nombre_proActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
               conectar cc = new conectar();
        Connection cn = cc.conexion();
        String cod_pro;
        String sql = "";
        cod_pro = txt_codigo_pro.getText();
        sql = "delete from tblProducto where"
            + "Codigo Producto = '"+cod_pro+"' ";
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

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        conectar cc = new conectar();
        Connection cn = (Connection) cc.conexion();
        String sql = "";
        String cod_pro = txt_codigo_pro.getText();
        String nom_pro = txt_nombre_pro.getText();
        String val_pro = txt_valor_pro.getText();
        sql = "insert tblProducto (codigo producto, nombre producto, valor producto) values (?,?,?)";
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, cod_pro);
            pst.setString(2, nom_pro);
            pst.setString(3, val_pro);
            int registro = pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null, "Registro almacenado correctamente");
                limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro no almacenado" + e.getMessage());
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "";
        String cod_pro = txt_codigo_pro.getText();
        String nom_pro = txt_nombre_pro.getText();
        String val_pro = txt_valor_pro.getText();
        sql = "update tblProducto SET"
            + "Codigo Producto = '"+cod_pro+"' "
            + "Nombre Producto = '"+nom_pro+"' "
            + "Valor Producto  = '"+val_pro+"' ";
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

    private void txt_codigo_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_proActionPerformed
        txt_codigo_pro.transferFocus();
    }//GEN-LAST:event_txt_codigo_proActionPerformed

    private void txt_valor_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor_proActionPerformed
        txt_valor_pro.transferFocus();
    }//GEN-LAST:event_txt_valor_proActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel lbl_codigo_pro;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_nombre_pro;
    private javax.swing.JLabel lbl_valor_pro;
    private javax.swing.JTextField txt_codigo_pro;
    private javax.swing.JTextField txt_nombre_pro;
    private javax.swing.JTextField txt_valor_pro;
    // End of variables declaration//GEN-END:variables
}
