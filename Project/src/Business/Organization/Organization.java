/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.Transaction.TransactionDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public abstract class Organization {
    
    //Variable Declaration
    private String organizationName;    
    private PersonDirectory objPersonDirectory;
    private UserAccountDirectory objUserAccountDirectory;
    private TransactionDirectory objTransactionDirectory;
    private WorkQueue objWorkQueue;
    private int organizationID;
    private static int counter = 1;
    //End of Variable Declaration
    
    
    //Constructor
    public Organization(String orgNamePassed) {
        
        organizationID = counter;
        counter++;
        organizationName = orgNamePassed;
        objPersonDirectory = new PersonDirectory();
        objUserAccountDirectory = new UserAccountDirectory();
        objTransactionDirectory = new TransactionDirectory();
        objWorkQueue = new WorkQueue();
    }
    
    //Getter methods
    public String getOrganizationName() {
        return organizationName;
    }

    public PersonDirectory getObjPersonDirectory() {
        return objPersonDirectory;
    }

    public UserAccountDirectory getObjUserAccountDirectory() {
        return objUserAccountDirectory;
    }

    public WorkQueue getObjWorkQueue() {
        return objWorkQueue;
    }

    public TransactionDirectory getObjTransactionDirectory() {
        return objTransactionDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    @Override
    public String toString() {
        return getOrganizationName();
    }

    
    //Abstract method
    public abstract ArrayList<Role> getSupportedRole();
    
    
    //Enum Type
    public enum OrganizationType {
        
        WorldAdmin("WorldAdminOrganization"),
        CountryAdmin("CountryAdminOrganization"),
        RegisteredSiteAdmin("RegisteredSiteAdminOrganization"),
        RegisteredSiteAgent("RegisteredSiteAgentOrganization"),
        Donor("DonorOrganization"),
        Finance("FinanceOrganization"),
        Support("SupportOrganization"),
        PoorPeople("PoorPeopleOrganization"),
        FieldAgent("FieldAgentOrganization"),
        FieldExpert("FieldExpertOrganization");
        
        private String value;
        
        private OrganizationType(String valuePassed) {
            
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
}
