/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person.FieldExpert;

import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FieldDriveDirectory {
    
    //Variable Declaration
    private ArrayList<FieldDrive> fieldDriveList;
    //End of variable Declaration
    
    
    //Constructor
    public FieldDriveDirectory() {
        
        fieldDriveList = new ArrayList<>();
    }

    public ArrayList<FieldDrive> getFieldDriveList() {
        return fieldDriveList;
    }
    
    
    //Method to add New Drive
    public FieldDrive addNewFieldDrive() {
        
        FieldDrive objFieldDrive = new FieldDrive();
        fieldDriveList.add(objFieldDrive);
        return objFieldDrive;
    }
}
