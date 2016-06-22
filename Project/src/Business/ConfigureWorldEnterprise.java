/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Organization.DonorOrganization;
import Business.Organization.WorldAdminOrganization;
import Business.Person.Person;
import Business.Role.WorldAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class ConfigureWorldEnterprise {
    
    //Method to configure the Enterprise
    public static WorldEnterprise configure() {
        
        WorldEnterprise objWorldEnterprise = WorldEnterprise.getInstance();
        
        //WorldEnterprise Admin
        WorldAdminOrganization objWorldAdminOrganization = new WorldAdminOrganization();
        DonorOrganization objDonorOrganization = new DonorOrganization();
        objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList().add(objWorldAdminOrganization);
        objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList().add(objDonorOrganization);
        
        Person objPersonWorlAdmin = new Person(objWorldAdminOrganization.getClass().getSimpleName());
        objPersonWorlAdmin.setPersonFirstName("Smit");
        objPersonWorlAdmin.setPersonLastName("Shah");
        
        objWorldAdminOrganization.getObjPersonDirectory().getPersonList().add(objPersonWorlAdmin);
        objWorldAdminOrganization.getObjUserAccountDirectory().createNewUserAccount("worldadmin", "worldadmin", objPersonWorlAdmin, new WorldAdminRole(), UserAccount.StatusType.Acitve.getValue());
        
        return objWorldEnterprise;
    }
}
