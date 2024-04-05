/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author albam
 */
public class PaymentInformationView extends javax.swing.JFrame {

    /**
     * Creates new form PaymentInformationView
     */
    public PaymentInformationView() {
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelAddressLine2 = new javax.swing.JLabel();
        jButtomRegisterFromRegister = new javax.swing.JButton();
        jLabelTitle1 = new javax.swing.JLabel();
        jButtonExitFromRegister = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLabelStateProvince = new javax.swing.JLabel();
        jButtomRegisterFromRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelTitle.setText("Item Price");

        jLabelAddressLine2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAddressLine2.setText("Total:");

        jButtomRegisterFromRegister.setText("Confirm");
        jButtomRegisterFromRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtomRegisterFromRegisterActionPerformed(evt);
            }
        });

        jLabelTitle1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelTitle1.setText("Items");

        jButtonExitFromRegister.setText("Exit");

        jLabelRegister.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelRegister.setText("Payment Information");

        jLabelStateProvince.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelStateProvince.setText("Card Number:");

        jButtomRegisterFromRegister1.setText("Add Payment Card");
        jButtomRegisterFromRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtomRegisterFromRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelStateProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelAddressLine2))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabelRegister)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtomRegisterFromRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButtomRegisterFromRegister1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExitFromRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRegister)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelTitle1))
                .addGap(89, 89, 89)
                .addComponent(jLabelAddressLine2)
                .addGap(54, 54, 54)
                .addComponent(jLabelStateProvince)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExitFromRegister)
                    .addComponent(jButtomRegisterFromRegister)
                    .addComponent(jButtomRegisterFromRegister1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtomRegisterFromRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtomRegisterFromRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtomRegisterFromRegisterActionPerformed

    private void jButtomRegisterFromRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtomRegisterFromRegister1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtomRegisterFromRegister1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentInformationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtomRegisterFromRegister;
    public javax.swing.JButton jButtomRegisterFromRegister1;
    private javax.swing.JButton jButtonExitFromRegister;
    public javax.swing.JLabel jLabelAddressLine2;
    public javax.swing.JLabel jLabelRegister;
    public javax.swing.JLabel jLabelStateProvince;
    public javax.swing.JLabel jLabelTitle;
    public javax.swing.JLabel jLabelTitle1;
    // End of variables declaration//GEN-END:variables
}