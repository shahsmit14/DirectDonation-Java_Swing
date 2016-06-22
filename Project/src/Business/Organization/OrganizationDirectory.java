/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class OrganizationDirectory {
    
    //Variable Declaration
    private ArrayList<Organization> organizationList;
    //End of Variable Declaration
    
    
    //Constructor
    public OrganizationDirectory() {
        
        organizationList = new ArrayList<>();
    }
    
    
    //Getter method
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    //Method to add a new Organization
    public Organization addOrganization(Organization.OrganizationType orgType){
        
        Organization objOrganization = null;
        
        if (orgType.getValue().equals(Organization.OrganizationType.WorldAdmin.getValue())){
            objOrganization = new WorldAdminOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.CountryAdmin.getValue())){
            objOrganization = new CountryAdminOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.RegisteredSiteAdmin.getValue())){
            objOrganization = new RegisteredSiteAdminOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.RegisteredSiteAgent.getValue())){
            objOrganization = new RegisteredSiteAgentOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.Donor.getValue())){
            objOrganization = new DonorOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.FieldAgent.getValue())){
            objOrganization = new FieldAgentOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.FieldExpert.getValue())){
            objOrganization = new FieldExpertOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.Finance.getValue())){
            objOrganization = new FinanceOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.PoorPeople.getValue())){
            objOrganization = new PoorPeopleOrganization();
            organizationList.add(objOrganization);
        }
        else if (orgType.getValue().equals(Organization.OrganizationType.Support.getValue())){
            objOrganization = new SupportOrganization();
            organizationList.add(objOrganization);
        }
                
        return objOrganization;
    }
}
