/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public abstract class WorkRequest {
    
    //Variable Declaration
    private static int workRequestCount = 1;
    private int workRequestID;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    
    //Constructor
    public WorkRequest() {
        
        workRequestID = workRequestCount;
        workRequestCount++;
    }
    
    //Enum Type
    public enum WorkRequestStatus {
        
        ASSIGNED("ASSIGNED"),
        PROCESSING("PROCESSING"),
        WORKING("WORKING"),
        COMPLETED("COMPLETED"),
        PENDING("PENDING"),
        DENIED("DENIED");
        
        private String value;
        
        private WorkRequestStatus(String valuePassed) {
            
            this.value = valuePassed;
        }
        
        public String getValue() {
            
            return value;
        }

        @Override
        public String toString() {
            return getValue();
        }
    } 
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWorkRequestID() {
        return workRequestID;
    }
    
    @Override
    public String toString() {
        return getStatus();
    }
}