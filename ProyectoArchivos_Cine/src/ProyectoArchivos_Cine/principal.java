/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoArchivos_Cine;

import javax.swing.JOptionPane;

/**
 *
 * @author yogg-saron
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        Btn_Pelicula1 = new javax.swing.JButton();
        Btn_Pelicula2 = new javax.swing.JButton();
        Btn_Pelicula3 = new javax.swing.JButton();
        Btn_Pelicula4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_Administracion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Pelicula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula1.png"))); // NOI18N
        Btn_Pelicula1.setPreferredSize(new java.awt.Dimension(70, 30));
        Btn_Pelicula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pelicula1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Pelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 180, 280));

        Btn_Pelicula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula2.png"))); // NOI18N
        Btn_Pelicula2.setPreferredSize(new java.awt.Dimension(70, 30));
        Btn_Pelicula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pelicula2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Pelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 180, 280));

        Btn_Pelicula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula3.png"))); // NOI18N
        Btn_Pelicula3.setPreferredSize(new java.awt.Dimension(70, 30));
        Btn_Pelicula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pelicula3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Pelicula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 180, 280));

        Btn_Pelicula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula4.png"))); // NOI18N
        Btn_Pelicula4.setPreferredSize(new java.awt.Dimension(70, 30));
        Btn_Pelicula4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pelicula4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Pelicula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 180, 280));

        jLabel1.setFont(new java.awt.Font("Courier 10 Pitch", 3, 24)); // NOI18N
        jLabel1.setText("Escoja la pelicula que desea ver");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        Btn_Administracion.setText("Admin Login");
        Btn_Administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AdministracionActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Administracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 210, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/footer.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 550, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/footer.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 380, -1));

        Btn_Salir.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Pelicula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pelicula1ActionPerformed
        // Pelicula 1
        seleccionCampos abrir = new seleccionCampos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Pelicula1ActionPerformed

    private void Btn_AdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AdministracionActionPerformed
        // TODO add your handling code here:
        String paswd = "eGt56$", contrasena=" ";
        int cont=3;
        boolean pase=false;
        do{
            contrasena = JOptionPane.showInputDialog("Introduzca la contraseña del Admisnitrador:");
            if(contrasena.equals(paswd)){
                pase=true;
                break;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Constraseña Incorrecta");
                cont--;
            }
        }while(!(cont==0));
        if(pase){
            administrador abrir = new administrador();
            abrir.setVisible(true);
            this.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(rootPane, "Maximo intentos aceptados.\n"
                   + "Chao..."); 
        }
    }//GEN-LAST:event_Btn_AdministracionActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        // Boton Salir
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_Pelicula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pelicula2ActionPerformed
        // Peicula 2
        seleccionCampos abrir = new seleccionCampos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Pelicula2ActionPerformed

    private void Btn_Pelicula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pelicula3ActionPerformed
        // Pelicula 3
        seleccionCampos abrir = new seleccionCampos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Pelicula3ActionPerformed

    private void Btn_Pelicula4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pelicula4ActionPerformed
        // pelicula 4
        seleccionCampos abrir = new seleccionCampos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Pelicula4ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Administracion;
    private javax.swing.JButton Btn_Pelicula1;
    private javax.swing.JButton Btn_Pelicula2;
    private javax.swing.JButton Btn_Pelicula3;
    private javax.swing.JButton Btn_Pelicula4;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
