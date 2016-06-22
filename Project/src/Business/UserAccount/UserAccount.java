/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class UserAccount {
    
    //Variable Declaration
    private Person objPerson;
    private Role objRole;
    private WorkQueue objWorkQueue;
    
    private String userAccountStatus;    
    private String userName;
    private String password;
    //End of variable Declaration
    
    
    //Constructor
    public UserAccount() {
    
        objWorkQueue = new WorkQueue();        
    }

    //Enum Type
    public enum StatusType {
        
        Acitve("Active"),
        Pending("Pending"),
        Disabled("Disabled");
        
        private String value;
        
        private StatusType(String valuePassed) {
            
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
    
    //Getter-setter methods
    public Person getObjPerson() {
        return objPerson;
    }

    public void setObjPerson(Person objPerson) {
        this.objPerson = objPerson;
    }

    public String getUserAccountStatus() {
        return userAccountStatus;
    }

    public void setUserAccountStatus(String userAccountStatus) {
        this.userAccountStatus = userAccountStatus;
    }


    public Role getObjRole() {
        return objRole;
    }

    public void setObjRole(Role objRole) {
        this.objRole = objRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WorkQueue getObjWorkQueue() {
        return objWorkQueue;
    }

    public void setObjWorkQueue(WorkQueue objWorkQueue) {
        this.objWorkQueue = objWorkQueue;
    }


    
    
    @Override
    public String toString() {
        return getUserName();
    }
}
