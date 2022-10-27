/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Pranav
 */
public class Patient {
    
    String PName;
    String PAge; 
    String PGender;
    String PCity;
    String PContactNumber;
    String PDoctor;
    Date DoA;
    
    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPAge() {
        return PAge;
    }

    public void setPAge(String PAge) {
        this.PAge = PAge;
    }

    public String getPGender() {
        return PGender;
    }

    public void setPGender(String PGender) {
        this.PGender = PGender;
    }

    public String getPCity() {
        return PCity;
    }

    public void setPCity(String PCity) {
        this.PCity = PCity;
    }

    public String getPContactNumber() {
        return PContactNumber;
    }

    public void setPContactNumber(String PContactNumber) {
        this.PContactNumber = PContactNumber;
    }

    public String getPDoctor() {
        return PDoctor;
    }

    public void setPDoctor(String PDoctor) {
        this.PDoctor = PDoctor;
    }

    public Date getDoA() {
        return DoA;
    }

    public void setDoA(Date DoA) {
        this.DoA = DoA;
    }
    
    
}
