package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    public PilihGambarButtonFullScreen() {
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

        imagePanel = new javax.swing.JPanel();
        lNmax = new javax.swing.JLabel();
        lR15m = new javax.swing.JLabel();
        lWR155 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        bPic1 = new javax.swing.JButton();
        bPic2 = new javax.swing.JButton();
        bPic3 = new javax.swing.JButton();
        bExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel.setLayout(new java.awt.CardLayout());

        lNmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/N-MAX.png"))); // NOI18N
        imagePanel.add(lNmax, "0");

        lR15m.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lR15m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/R-15M.png"))); // NOI18N
        imagePanel.add(lR15m, "2");

        lWR155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lWR155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/WR-155.jpeg"))); // NOI18N
        imagePanel.add(lWR155, "1");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        bPic1.setText("N-MAX");
        bPic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPic1ActionPerformed(evt);
            }
        });
        buttonPanel.add(bPic1);

        bPic2.setText("R-15M");
        bPic2.setToolTipText("");
        bPic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPic2ActionPerformed(evt);
            }
        });
        buttonPanel.add(bPic2);

        bPic3.setText("WR-155");
        bPic3.setToolTipText("");
        bPic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPic3ActionPerformed(evt);
            }
        });
        buttonPanel.add(bPic3);

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        buttonPanel.add(bExit);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPic1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_bPic1ActionPerformed

    private void bPic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPic2ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_bPic2ActionPerformed

    private void bPic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPic3ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_bPic3ActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        int c = JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_bExitActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PilihGambarButtonFullScreen fullFrame = new PilihGambarButtonFullScreen();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExit;
    private javax.swing.JButton bPic1;
    private javax.swing.JButton bPic2;
    private javax.swing.JButton bPic3;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lNmax;
    private javax.swing.JLabel lR15m;
    private javax.swing.JLabel lWR155;
    // End of variables declaration//GEN-END:variables
}
