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
public class UserNameExists {

    public static UserAccount userNameCheck(WorldEnterprise objWorldEnterprisePassed, String userNamePassed) {

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;
        UserAccount objUserAccountExists = null;

        //Step 1 - Check in World Enterprise
        labelWorld:
        for (Organization objOrganization : objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

            for (UserAccount objUserAccount : objOrganization.getObjUserAccountDirectory().getUserAccountList()) {

                if (objUserAccount.getUserName().equalsIgnoreCase(userNamePassed)) {

                    objUserAccountExists = objUserAccount;
                    break labelWorld;
                }
            }
        }

        //Step 2 - Check in Country Enterprise
        labelCountry:
        if (objUserAccountExists == null) {

            for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

                for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                    for (UserAccount objUserAccount : objOrganization.getObjUserAccountDirectory().getUserAccountList()) {

                        if (objUserAccount.getUserName().equalsIgnoreCase(userNamePassed)) {

                            objUserAccountExists = objUserAccount;
                            break labelCountry;
                        }
                    }
                }
            }
        }

        //Step - 3 Registered Site Enterprise
        labelSite:
        if (objUserAccountExists == null) {

            for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

                for (RegisteredSiteEnterprise objRegisteredSiteEnterprise : objCountryEnterprise.getObjRegisteredSiteDirectory().getRegisteredSiteList()) {

                    for (Organization objOrganization : objRegisteredSiteEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                        for (UserAccount objUserAccount : objOrganization.getObjUserAccountDirectory().getUserAccountList()) {

                            if (objUserAccount.getUserName().equalsIgnoreCase(userNamePassed)) {

                                objUserAccountExists = objUserAccount;
                                break labelSite;
                            }
                        }
                    }
                }
            }
        }

        return objUserAccountExists;
    }
}
