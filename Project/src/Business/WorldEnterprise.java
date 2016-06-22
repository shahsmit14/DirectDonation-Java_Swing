/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.CountryEnterprise.CountryEnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.WorldAdminRole;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class WorldEnterprise extends Organization{
    
    //Variable Declaration
    private String worldEntName;
    private static WorldEnterprise objWorldEnterprise;  //Static, so only one instance
    private CountryEnterpriseDirectory objCountryEnterpriseDirectory;
    private OrganizationDirectory objOrganizationDirectory;
    //End of Variable Declaration
    
    
    //Private Constructor, so no one can call this from outside
    private WorldEnterprise(){
        
        super(null);
        worldEntName = "Direct Donation Inc.";
        objCountryEnterpriseDirectory = new CountryEnterpriseDirectory();
        objOrganizationDirectory = new OrganizationDirectory();
    }

    
    //Getter method
    public String getWorldEntName() {
        return worldEntName;
    }

    public OrganizationDirectory getObjOrganizationDirectory() {
        return objOrganizationDirectory;
    }

    public CountryEnterpriseDirectory getObjCountryEnterpriseDirectory() {
        return objCountryEnterpriseDirectory;
    }

    
    //Method is created as static so it can be invoked by class name.
    //This method returns the instance or creates a new one
    public static WorldEnterprise getInstance(){
        
        if (objWorldEnterprise == null){
            objWorldEnterprise = new WorldEnterprise();
        }
        return objWorldEnterprise;
    }
        
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new WorldAdminRole());
        return roles;
    }
}
