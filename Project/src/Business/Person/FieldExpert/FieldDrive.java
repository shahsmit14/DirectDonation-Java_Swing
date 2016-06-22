/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person.FieldExpert;

import Business.UserAccount.UserAccount;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FieldDrive {
    
    private static int fieldDriveIDCount = 1;
    private int fieldDriveID;
    private String fieldDriveName;
    private String fieldDriveCountry;
    private String fieldDriveState;
    private String fieldDriveVillage;
    private Date driveStartDate;
    private Date driveEndDate;
    private UserAccount objFieldExpertUserAccount;
    private int driveTotalDays;
    private ArrayList<UserAccount> fieldAgentAssignedList;

   
    //Constructor
    public FieldDrive() {
        
        fieldDriveID = fieldDriveIDCount;
        fieldDriveIDCount++;
        fieldAgentAssignedList = new ActivatableArrayList<>();
    }

    
    //Getter-Setter methods
    public int getFieldDriveID() {
        return fieldDriveID;
    }

    public String getFieldDriveName() {
        return fieldDriveName;
    }

    public void setFieldDriveName(String fieldDriveName) {
        this.fieldDriveName = fieldDriveName;
    }

    public Date getDriveStartDate() {
        return driveStartDate;
    }

    public void setDriveStartDate(Date driveStartDate) {
        this.driveStartDate = driveStartDate;
    }

    public Date getDriveEndDate() {
        return driveEndDate;
    }

    public void setDriveEndDate(Date driveEndDate) {
        this.driveEndDate = driveEndDate;
    }

    public int getDriveTotalDays() {
        return driveTotalDays;
    }

    public void setDriveTotalDays(int driveTotalDays) {
        this.driveTotalDays = driveTotalDays;
    }

    public ArrayList<UserAccount> getFieldAgentAssignedList() {
        return fieldAgentAssignedList;
    }

    public void setFieldAgentAssignedList(ArrayList<UserAccount> fieldAgentAssignedList) {
        this.fieldAgentAssignedList = fieldAgentAssignedList;
    }

    public String getFieldDriveState() {
        return fieldDriveState;
    }

    public void setFieldDriveState(String fieldDriveState) {
        this.fieldDriveState = fieldDriveState;
    }

    public String getFieldDriveVillage() {
        return fieldDriveVillage;
    }

    public void setFieldDriveVillage(String fieldDriveVillage) {
        this.fieldDriveVillage = fieldDriveVillage;
    }    

    public String getFieldDriveCountry() {
        return fieldDriveCountry;
    }

    public void setFieldDriveCountry(String fieldDriveCountry) {
        this.fieldDriveCountry = fieldDriveCountry;
    }

    public UserAccount getObjFieldExpertUserAccount() {
        return objFieldExpertUserAccount;
    }

    public void setObjFieldExpertUserAccount(UserAccount objFieldExpertUserAccount) {
        this.objFieldExpertUserAccount = objFieldExpertUserAccount;
    }

    @Override
    public String toString() {
        return String.valueOf(getFieldDriveID());
    }
    
}
