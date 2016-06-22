/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.CountryEnterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteDirectory;
import Business.Role.CountryAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class CountryEnterprise extends Organization{
    
    //Variabe Declaration
    private int countryID;
    private static int countryIDCount = 1;
    private String countryEntName;
    private OrganizationDirectory objOrganizationDirectory;
    private RegisteredSiteDirectory objRegisteredSiteDirectory;
    //End of variabe Declaration

    
    //Constructor
    public CountryEnterprise() {
        
        super(null);
        countryID = countryIDCount;
        countryIDCount++;
        objOrganizationDirectory = new OrganizationDirectory();
        objRegisteredSiteDirectory = new RegisteredSiteDirectory();
    }

    
    //Getter-setter method
    public String getCountryEntName() {
        return countryEntName;
    }

    public void setCountryEntName(String countryEntName) {
        this.countryEntName = countryEntName;
    }

    public OrganizationDirectory getObjOrganizationDirectory() {
        return objOrganizationDirectory;
    }

    public RegisteredSiteDirectory getObjRegisteredSiteDirectory() {
        return objRegisteredSiteDirectory;
    }

    public int getCountryID() {
        return countryID;
    }

    
    @Override
    public String toString() {
        return getCountryEntName();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new CountryAdminRole());
        return roles;
    }
    
}
