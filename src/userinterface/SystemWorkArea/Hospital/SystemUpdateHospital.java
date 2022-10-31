/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemWorkArea.Hospital;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.Hospital;
import model.HospitalDirectory;
import userinterface.SystemWorkArea.Patient.*;

/**
 *
 * @author kshitijkumartiwari
 */
public class SystemUpdateHospital extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    HospitalDirectory hospitalDirectory;
    boolean validationCheck = true;
    boolean emptyValidationStatus = true;
    public SystemUpdateHospital(HospitalDirectory hospitalDirectory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
        initCityCmbx();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHospName = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        lblHospitalAddress = new javax.swing.JLabel();
        txtHospAddress = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        btnUpdateHospital = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblSearchHospital = new javax.swing.JLabel();
        txtHospitalSearch = new javax.swing.JTextField();
        btnSearchHospital = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHospName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHospName.setText("Hospital Name :");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        lblHospitalAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHospitalAddress.setText("Hospital Address :");

        txtHospAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospAddressActionPerformed(evt);
            }
        });

        lblContactNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContactNo.setText("Contact Number :");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City :");

        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCommunity.setText("Community :");

        btnUpdateHospital.setText("Update Hospital");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Hospital");

        lblSearchHospital.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchHospital.setText("Search Hospital by ID:");

        txtHospitalSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalSearchActionPerformed(evt);
            }
        });

        btnSearchHospital.setText("Search");
        btnSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHospitalSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHospitalAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHospName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnUpdateHospital)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCity, 0, 345, Short.MAX_VALUE)
                                    .addComponent(txtHospitalName)
                                    .addComponent(txtHospAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospitalSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHospName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboCommunity))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateHospital)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHospAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospAddressActionPerformed

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        // TODO add your handling code here:
        initCommunityCmbx();
    }//GEN-LAST:event_comboCityItemStateChanged

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed
        // TODO add your handling code here:

        try{

            if(EmpytyFieldValidation()){

                if(RegexValidation()){

                    int hospitalId = Integer.parseInt( txtHospitalSearch.getText());
                    Set<Hospital> hospitals = hospitalDirectory.getHospitals();
                    
                    String hospitalName = txtHospitalName.getText();
                    String hospitalAddress = txtHospAddress.getText();
                    long contactNo = Long.parseLong(txtContactNo.getText());
                    String city = comboCity.getSelectedItem().toString();
                    String community = comboCommunity.getSelectedItem().toString();
                    

                    Map<String, String> communityMap = new HashMap<>();
                    communityMap.put(city,community);

                    Community c = new Community();
                    c.setCommunity(communityMap);

                    
                    for(Hospital h: hospitals){
                        if(hospitalId == h.getHospitalID()){
                            
                            h.setHospitalName(hospitalName);
                            h.setHospitalAddress(hospitalAddress);
                            h.setContactNumber(contactNo);
                            h.setCommunity(c);
 
                        }
                    }
                  
          

                    JOptionPane.showMessageDialog(this,"Hospital InfoUpdated Successfully with Hospital ID Id is:"+hospitalId+",Please save this Hospital Id for furture reference.");
                }

                else{
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Some Error in entered data. Please check over the red fields to know more.");
                emptyValidationStatus=true;

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Patient not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
            if(hospitalDirectory.getHospitals().size()>0){
                hospitalDirectory.getHospitals().remove(hospitalDirectory.getHospitals().size() - 1);
            }
        }

    }//GEN-LAST:event_btnUpdateHospitalActionPerformed

    private void txtHospitalSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalSearchActionPerformed

    private void btnSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHospitalActionPerformed
        // TODO add your handling code here:
        int hospitalId = Integer.parseInt( txtHospitalSearch.getText());
        
        for(Hospital h: hospitalDirectory.getHospitals()){
            
            if(hospitalId == h.getHospitalID()){
                
                txtHospitalName.setText(h.getHospitalName());
                txtHospAddress.setText(h.getHospitalAddress());
                txtContactNo.setText(String.valueOf(h.getContactNumber()));
                comboCity.setSelectedItem(h.getCity());
                comboCommunity.setSelectedItem(h.getCommunity());
                
            }
        }
        
        
    }//GEN-LAST:event_btnSearchHospitalActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    
    private void initCommunityCmbx() {
        comboCommunity.removeAllItems();
        int count = 0;
        var selectedCity=comboCity.getSelectedItem().toString();
        City city=City.valueOf(selectedCity);
        Community community=new Community();
        community.setLstCommunity();
        String[] communities=community.getLstCommunity().get(city);
            for (String community_ : communities) {
                comboCommunity.addItem(communities[count++]);
            }
    }
    
    private void initCityCmbx() {
       comboCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City city_ : cities) {
            comboCity.addItem(cities[count++].toString());
        }
       initCommunityCmbx();
    }
    
    private boolean RegexValidation() {
        if(!txtHospitalName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospitalName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtHospitalName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
        
//        if(!txtHospAddress.getText().matches("^[a-zA-Z ]+$"))
//        {
//            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
//            txtHospAddress.setToolTipText("Please enter only characters and space.");
//            validationCheck=false;
//        }
//        
//        if(txtHospAddress.getText().matches("^[a-zA-Z ]+$"))
//        {
//            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
//        }
        
        if(!txtContactNo.getText().matches("^[0-9]{10}$"))
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtContactNo.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }
        
        if(txtContactNo.getText().matches("^[0-9]{10}$"))
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtHospitalName.getText().equals(null) || txtHospitalName.getText().trim().isEmpty() )
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospitalName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHospitalName.getText().equals(null) && !txtHospitalName.getText().trim().isEmpty() )
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(txtHospAddress.getText().equals(null) || txtHospAddress.getText().trim().isEmpty() )
        {
            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospAddress.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHospAddress.getText().equals(null) && !txtHospAddress.getText().trim().isEmpty() )
        {
            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(txtContactNo.getText().equals(null) || txtContactNo.getText().trim().isEmpty())
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtContactNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtContactNo.getText().equals(null) && !txtContactNo.getText().trim().isEmpty())
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchHospital;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblHospName;
    private javax.swing.JLabel lblHospitalAddress;
    private javax.swing.JLabel lblSearchHospital;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtHospAddress;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalSearch;
    // End of variables declaration//GEN-END:variables
}
