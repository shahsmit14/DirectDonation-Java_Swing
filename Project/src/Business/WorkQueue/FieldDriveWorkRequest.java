/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Person.FieldExpert.FieldDrive;
import java.util.Date;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FieldDriveWorkRequest extends WorkRequest {
    
    private Date driveStartDate;
    private Date driveEndDate;
    private FieldDrive objFieldDrive;

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

    public FieldDrive getObjFieldDrive() {
        return objFieldDrive;
    }

    public void setObjFieldDrive(FieldDrive objFieldDrive) {
        this.objFieldDrive = objFieldDrive;
    }

}
