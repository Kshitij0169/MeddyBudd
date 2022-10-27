/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.PersonHistory;

/**
 *
 * @author Pranav
 */
public class AdminMenuPage extends javax.swing.JFrame {

    /**
     * Creates new form MenuPage
     */
    PersonHistory perhistory ;
    public AdminMenuPage(PersonHistory perhistory) {
        initComponents();
        this.perhistory=perhistory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnUpdatePatient = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnUpdatePatient1 = new javax.swing.JButton();
        btnDeletePatient1 = new javax.swing.JButton();
        btnAddPatient1 = new javax.swing.JButton();
        btnViewPatient1 = new javax.swing.JButton();
        btnAddPatient2 = new javax.swing.JButton();
        btnViewPatient2 = new javax.swing.JButton();
        btnUpdatePatient2 = new javax.swing.JButton();
        btnDeletePatient2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnViewPatient.setText("View Patients");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnUpdatePatient.setText("Update Patients");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });

        btnDeletePatient.setText("Delete Patients");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Menu ");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnUpdatePatient1.setText("Update Person");
        btnUpdatePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatient1ActionPerformed(evt);
            }
        });

        btnDeletePatient1.setText("Delete Person");
        btnDeletePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatient1ActionPerformed(evt);
            }
        });

        btnAddPatient1.setText("Add Person");
        btnAddPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatient1ActionPerformed(evt);
            }
        });

        btnViewPatient1.setText("View Person");
        btnViewPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatient1ActionPerformed(evt);
            }
        });

        btnAddPatient2.setText("Add Doctor");
        btnAddPatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatient2ActionPerformed(evt);
            }
        });

        btnViewPatient2.setText("View Doctor");
        btnViewPatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatient2ActionPerformed(evt);
            }
        });

        btnUpdatePatient2.setText("Update Doctor");
        btnUpdatePatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatient2ActionPerformed(evt);
            }
        });

        btnDeletePatient2.setText("Delete Doctor");
        btnDeletePatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatient2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeletePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdatePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeletePatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdatePatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewPatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(btnLogout)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAddPatient)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewPatient)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdatePatient)
                            .addGap(18, 18, 18)
                            .addComponent(btnDeletePatient))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAddPatient2)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewPatient2)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdatePatient2)
                            .addGap(18, 18, 18)
                            .addComponent(btnDeletePatient2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddPatient1)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewPatient1)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdatePatient1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletePatient1)))
                .addGap(72, 72, 72)
                .addComponent(btnLogout)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
          
            PersonHistory perhistory = new PersonHistory();
            PatientPage pg = new PatientPage(perhistory);
            pg.setVisible(true);
            dispose();
            
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePatientActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
          LoginPage lp = new LoginPage(perhistory);
          lp.setVisible(true);
          dispose();
          
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdatePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePatient1ActionPerformed

    private void btnDeletePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletePatient1ActionPerformed

    private void btnAddPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPatient1ActionPerformed

    private void btnViewPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatient1ActionPerformed
        // TODO add your handling code here:
       ViewPersonPage vpp = new ViewPersonPage(perhistory);
       vpp.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btnViewPatient1ActionPerformed

    private void btnAddPatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPatient2ActionPerformed

    private void btnViewPatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPatient2ActionPerformed

    private void btnUpdatePatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePatient2ActionPerformed

    private void btnDeletePatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletePatient2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        PersonHistory perhistory = new PersonHistory();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new AdminMenuPage(perhistory).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnAddPatient1;
    private javax.swing.JButton btnAddPatient2;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnDeletePatient1;
    private javax.swing.JButton btnDeletePatient2;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JButton btnUpdatePatient1;
    private javax.swing.JButton btnUpdatePatient2;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JButton btnViewPatient1;
    private javax.swing.JButton btnViewPatient2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
