/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
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

        lbl_fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mn_clientes = new javax.swing.JMenuItem();
        mn_vendedores = new javax.swing.JMenuItem();
        mn_producto = new javax.swing.JMenuItem();
        mn_salir = new javax.swing.JMenu();
        mn_salir2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/2560_3000.jpg"))); // NOI18N

        jMenu1.setText("Formularios");

        mn_clientes.setText("Clientes");
        mn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_clientesActionPerformed(evt);
            }
        });
        jMenu1.add(mn_clientes);

        mn_vendedores.setText("Vendedores");
        mn_vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_vendedoresActionPerformed(evt);
            }
        });
        jMenu1.add(mn_vendedores);

        mn_producto.setText("Productos");
        mn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_productoActionPerformed(evt);
            }
        });
        jMenu1.add(mn_producto);

        jMenuBar1.add(jMenu1);

        mn_salir.setText("Salir");
        mn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_salirActionPerformed(evt);
            }
        });

        mn_salir2.setText("Salir");
        mn_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_salir2ActionPerformed(evt);
            }
        });
        mn_salir.add(mn_salir2);

        jMenuBar1.add(mn_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 2298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mn_salirActionPerformed

    private void mn_vendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_vendedoresActionPerformed
        LlamarVendedores();
    }//GEN-LAST:event_mn_vendedoresActionPerformed

    private void mn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_clientesActionPerformed
        LlamarClientes();
    }//GEN-LAST:event_mn_clientesActionPerformed

    private void mn_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_salir2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_mn_salir2ActionPerformed

    private void mn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_productoActionPerformed
        LlamarProducto();
    }//GEN-LAST:event_mn_productoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JMenuItem mn_clientes;
    private javax.swing.JMenuItem mn_producto;
    private javax.swing.JMenu mn_salir;
    private javax.swing.JMenuItem mn_salir2;
    private javax.swing.JMenuItem mn_vendedores;
    // End of variables declaration//GEN-END:variables

    
    private void LlamarClientes(){
        JOptionPane.showMessageDialog(null, "Escogio abrir el formulario de Clientes");
        new Clientes().setVisible(true);
    }
    
    private void LlamarVendedores(){
        JOptionPane.showMessageDialog(null, "Escogio abrir el formulario de Vendedores");
        new Vendedores().setVisible(true);
    }
 
    private void LlamarProducto(){
        JOptionPane.showMessageDialog(null, "Escogio abrir el formulario de Productos");
        new Producto().setVisible(true);
    }
    
}
