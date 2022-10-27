/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Pranav
 */
public class PatientHistory {
    private ArrayList<PatientHistory> phistory;
    
    public PatientHistory(){        
        phistory = new  ArrayList<PatientHistory>();
     }
    public ArrayList<PatientHistory> getHistory() {
        return phistory;
    }

    public void setHistory(ArrayList<PatientHistory> phistory) {
        this.phistory = phistory;
    }
    
    public PatientHistory addNewPatient(){
        PatientHistory patient = new PatientHistory();
        phistory.add(patient);
        return patient ; 
    }
   public PatientHistory deleteEmployee(PatientHistory patient){
       phistory.remove(patient);
       return patient;
   }
   public PatientHistory updateNewEmployee(){
        PatientHistory patient = new PatientHistory();
        phistory.add(patient);
        return patient ; 
    }
}
