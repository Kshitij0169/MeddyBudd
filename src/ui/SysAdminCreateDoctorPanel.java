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
public class SysAdminCreateDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminCreateDoctorPanel
     */
    
    PersonHistory perHistory ;
    DoctorHistory docHistory;
    public SysAdminCreateDoctorPanel(PersonHistory perHistory, DoctorHistory docHistory) {
        initComponents();
        this.perHistory=perHistory;
        this.docHistory=docHistory;
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
        tblPerson = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        drpGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDocId = new javax.swing.JTextField();
        lblHospName = new javax.swing.JLabel();
        lblHospName1 = new javax.swing.JLabel();
        txtHospName = new javax.swing.JTextField();
        btnAddDoctor = new javax.swing.JButton();

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "City", "Phone-Number"
            }
        ));
        jScrollPane1.setViewportView(tblPerson);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("Add a Doctor from existing Person");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

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

        jLabel6.setText("Contact-Number :");

        jLabel2.setText("Name :");

        lblHospName.setText("Hospital Name:");

        lblHospName1.setText("Doctor ID:");

        btnAddDoctor.setText("Add Doctor");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(248, 248, 248)
                                        .addComponent(btnAddDoctor)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnView))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHospName1)
                                            .addComponent(lblHospName))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtCity, txtContactNumber, txtDocId, txtHospName, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospName)
                            .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnAddDoctor))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(80, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtCity, txtContactNumber, txtDocId, txtHospName, txtName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndedx = tblPerson.getSelectedRow();

        if(selectedRowIndedx<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }

        DefaultTableModel model  = (DefaultTableModel) tblPerson.getModel();
        Person selectedPerson = (Person)model.getValueAt(selectedRowIndedx , 0);

        txtName.setText(selectedPerson.getName());
        txtAge.setText(selectedPerson.getAge());
        txtGender.setText(selectedPerson.getGender());
        txtCity.setText(selectedPerson.getCity());
        txtContactNumber.setText(selectedPerson.getPhoneNumber());
    }//GEN-LAST:event_btnViewActionPerformed

    private void drpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpGenderActionPerformed
        // TODO add your handling code here:
        if(drpGender.getSelectedItem() != null){
            String Gender = drpGender.getSelectedItem().toString();
            txtGender.setText(Gender);
        }
    }//GEN-LAST:event_drpGenderActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        String Name = txtName.getText();
        String Age = txtAge.getText();
        String Gender = txtGender.getText();
        String City = txtCity.getText();
        String ContactNumber = txtContactNumber.getText();
        String HospName = txtHospName.getText();
        String DocId = txtDocId.getText();
        
        Doctor d = docHistory.addNewDoctor();
        d.setAge(Age);       
        d.setGender(Gender);
        d.setCity(City);
        d.setName(Name);
        d.setPhoneNumber(ContactNumber);
        d.setDocId(DocId);
        d.setHospName(HospName);
        JOptionPane.showMessageDialog(this, "Doctor has been created !! "); 
        clrfeilds();
        populateTable();
        deleterowfromPersonTable();
        
    }//GEN-LAST:event_btnAddDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> drpGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHospName;
    private javax.swing.JLabel lblHospName1;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        model.setRowCount(0);
         
        for(Person p : perHistory.getPersonhistory()){
            Object[] row = new Object[6];
            row[0] = p;
            row[1]=p.getName();
            row[2]=p.getAge();
            row[3]=p.getGender();
            row[4]=p.getCity();
            row[5]=p.getPhoneNumber();
            model.addRow(row);
        }
    }
public void deleterowfromPersonTable(){
    int selectedRowIndex = tblPerson.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
           
        }
         DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
         Person selectedPerson =(Person) model.getValueAt(selectedRowIndex , 0);
         perHistory.deletePerson(selectedPerson);
         JOptionPane.showMessageDialog(this, "Person moved to Doctor Directory.");
         
         populateTable();
}

private void clrfeilds() {
        txtAge.setText("");
        txtCity.setText("");       
        txtContactNumber.setText("");        
        txtGender.setText("");
        txtName.setText("");      
        drpGender.setSelectedIndex(-1);
        txtDocId.setText("");
        txtHospName.setText("");
}
}
