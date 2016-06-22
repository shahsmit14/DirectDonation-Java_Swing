/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CountryEnterprise.RegSiteEnterprise;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Organization.RegisteredSiteAdminOrganization;
import Business.WorldEnterprise;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class RegisteredSiteDirectory {

    //Variable Declaration
    private ArrayList<RegisteredSiteEnterprise> registeredSiteList;
    //End of Variable Declaration

    //Constructor
    public RegisteredSiteDirectory() {
        registeredSiteList = new ArrayList<>();
    }

    //Getter method
    public ArrayList<RegisteredSiteEnterprise> getRegisteredSiteList() {
        return registeredSiteList;
    }

    //Method to add a new Registered Site
    public RegisteredSiteEnterprise addRegisteredSite() {

        RegisteredSiteEnterprise objRegisteredSite = new RegisteredSiteEnterprise();
        registeredSiteList.add(objRegisteredSite);

        //Add Registered Site Admin Organization
        RegisteredSiteAdminOrganization objRegisteredSiteAdminOrganization = new RegisteredSiteAdminOrganization();
        objRegisteredSite.getObjOrganizationDirectory().getOrganizationList().add(objRegisteredSiteAdminOrganization);

        return objRegisteredSite;
    }

    
    //Method to check a registered site enterprise
    public static RegisteredSiteEnterprise checkRegSiteEnterpriseExists(String regSiteNamePassed, WorldEnterprise objWorldEnterprisePassed) {

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;

        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {
            for (RegisteredSiteEnterprise objRegisteredSiteEnterprise : objCountryEnterprise.getObjRegisteredSiteDirectory().getRegisteredSiteList()) {

                if (objRegisteredSiteEnterprise.getRegSiteName().equalsIgnoreCase(regSiteNamePassed)) {
                    return objRegisteredSiteEnterprise;
                }
            }
        }
        return null;
    }
}
