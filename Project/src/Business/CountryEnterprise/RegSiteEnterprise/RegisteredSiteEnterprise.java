/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.CountryEnterprise.RegSiteEnterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.RegSiteAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class RegisteredSiteEnterprise extends Organization{

    //Variabe Declaration
    private String regSiteName;
    private OrganizationDirectory objOrganizationDirectory;
    //End of variabe Declaration

    
    //Constructor
    public RegisteredSiteEnterprise() {
        
        super(null);
        objOrganizationDirectory = new OrganizationDirectory();
        
    }

    public String getRegSiteName() {
        return regSiteName;
    }

    public void setRegSiteName(String regSiteName) {
        this.regSiteName = regSiteName;
    }

    public OrganizationDirectory getObjOrganizationDirectory() {
        return objOrganizationDirectory;
    }

    @Override
    public String toString() {
        return getRegSiteName();
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new RegSiteAdminRole());        
        return roleList;
    }
    
}
