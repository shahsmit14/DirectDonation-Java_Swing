/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Helper;

import Business.CountryEnterprise.CountryEnterprise;
import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class AuthenticateUser {
    
    public static UserAccount authenticateUser(WorldEnterprise objWorldEnterprisePassed, String userNamePassed, String passwordPassed) {
        
        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;
        UserAccount objUserAccount = null;

        //Step 1 - Check in World Enterprise
        labelWorld:
        for (Organization objOrganization : objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

            objUserAccount = objOrganization.getObjUserAccountDirectory().validateUser(userNamePassed, passwordPassed);

            if (objUserAccount != null) {
                break labelWorld;
            }
        }

        //Step 2 - Check in Country Enterprise
        labelCountry:
        if (objUserAccount == null) {

            for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

                for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                    objUserAccount = objOrganization.getObjUserAccountDirectory().validateUser(userNamePassed, passwordPassed);

                    if (objUserAccount != null) {
                        break labelCountry;
                    }
                }
            }
        }

        //Step - 3 Registered Site Enterprise
        labelSite:
        if (objUserAccount == null) {

            for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

                for (RegisteredSiteEnterprise objRegisteredSiteEnterprise : objCountryEnterprise.getObjRegisteredSiteDirectory().getRegisteredSiteList()) {

                    for (Organization objOrganization : objRegisteredSiteEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                        objUserAccount = objOrganization.getObjUserAccountDirectory().validateUser(userNamePassed, passwordPassed);

                        if (objUserAccount != null) {
                            break labelSite;
                        }
                    }
                }
            }
        }

        return objUserAccount;
    }
}
