/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorHistory;
import model.Person;
import model.PersonHistory;

/**
 *
 * @author kshitijkumartiwari
 */
public class SysAdminControlDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminViewDoctorPanel
     */
    DoctorHistory docHistory;
    PersonHistory perHistory ;
    public SysAdminControlDoctorPanel(PersonHistory perHistory, DoctorHistory docHistory) {
        initComponents();
        this.perHistory=perHistory;
        this.docHistory = docHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        lblTitleDoc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDocId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblHospName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHospName1 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtHospName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        drpGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "City", "Phone-Number", "Hospital Name", "Doctor ID"
            }
        ));
        jScrollPane1.setViewportView(tblDoctor);

        lblTitleDoc.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        lblTitleDoc.setText("Control Doctor Directory");

        jLabel6.setText("Contact-Number :");

        lblHospName.setText("Hospital Name:");

        lblHospName1.setText("Doctor ID:");

        jLabel2.setText("Name :");

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        drpGender.setSelectedIndex(-1);
        drpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpGenderActionPerformed(evt);
            }
        });

        jLabel3.setText("Age :");

        jLabel4.setText("Gender :");

        jLabel5.setText("City :");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(btnView)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDelete))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtAge)
                                    .addComponent(txtContactNumber)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHospName1)
                                    .addComponent(lblHospName))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHospName, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtDocId)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(lblTitleDoc)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitleDoc)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospName)
                            .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospName1)
                    .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpGenderActionPerformed
        // TODO add your handling code here:
        if(drpGender.getSelectedItem() != null){
            String Gender = drpGender.getSelectedItem().toString();
            txtGender.setText(Gender);
        }
    }//GEN-LAST:event_drpGenderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Selecta row to delete");
            return ;
        }

        DefaultTableModel model  = (DefaultTableModel) tblDoctor.getModel();
        Doctor selectedDoctor = (Doctor)model.getValueAt(selectedRowIndex, 0);

        docHistory.deleteDoctor(selectedDoctor);
        JOptionPane.showMessageDialog(this,"Employee Deleted !! ");
        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndedx = tblDoctor.getSelectedRow();

        if(selectedRowIndedx<0){

            JOptionPane.showMessageDialog(this, "Please select a row to update details.");
            return;
        }
        DefaultTableModel model  = (DefaultTableModel) tblDoctor.getModel();
        Doctor selectedDoctor = (Doctor)model.getValueAt(selectedRowIndedx , 0);

        if(tblDoctor.getSelectedRowCount() == 1){
            String Name = txtName.getText();
            String Age = txtAge.getText();
            String Gender = txtGender.getText();
            String City = txtCity.getText();
            String ContactNumber = txtContactNumber.getText();
            String HospName = txtHospName.getText();
            String DocId = txtDocId.getText();

            selectedDoctor.setName(Name);
            selectedDoctor.setAge(Age);
            selectedDoctor.setGender(Gender);
            selectedDoctor.setCity(City);
            selectedDoctor.setPhoneNumber(ContactNumber);
            selectedDoctor.setHospName(HospName);
            selectedDoctor.setDocId(DocId);

            docHistory.updatedDoctor(selectedDoctor, selectedRowIndedx);
            populateTable();

            txtAge.setText("");
            txtCity.setText("");
            txtContactNumber.setText("");
            txtGender.setText("");
            txtName.setText("");
            drpGender.setSelectedIndex(-1);
            txtHospName.setText("");
            txtDocId.setText("");

        } else{
            if(tblDoctor.getSelectedRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row to update.");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndedx = tblDoctor.getSelectedRow();

        if(selectedRowIndedx<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }

        DefaultTableModel model  = (DefaultTableModel) tblDoctor.getModel();
       Doctor selectedDoctor = (Doctor)model.getValueAt(selectedRowIndedx , 0);

        txtName.setText(selectedDoctor.getName());
        txtAge.setText(selectedDoctor.getAge());
        txtGender.setText(selectedDoctor.getGender());
        txtCity.setText(selectedDoctor.getCity());
        txtContactNumber.setText(selectedDoctor.getPhoneNumber());
        txtHospName.setText(selectedDoctor.getHospName());
        txtDocId.setText(selectedDoctor.getDocId());
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> drpGender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHospName;
    private javax.swing.JLabel lblHospName1;
    private javax.swing.JLabel lblTitleDoc;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
         
        for(Doctor d : docHistory.getDoctorhistory()){
            Object[] row = new Object[7];
            row[0] = d;
            row[1]=d.getAge();
            row[2]=d.getGender();
            row[3]=d.getCity();
            row[4]=d.getPhoneNumber();
            row[5]=d.getHospName();
            row[6]=d.getDocId();
            
            model.addRow(row);
        }
    }




}
