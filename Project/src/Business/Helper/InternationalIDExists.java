/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Organization.Organization;
import Business.Organization.PoorPeopleOrganization;
import Business.Person.Person;
import Business.Person.PoorPeople.FamilyMember;
import Business.WorldEnterprise;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class InternationalIDExists {

    public static boolean userIDCheck(WorldEnterprise objWorldEnterprisePassed, String internationalIDPassed) {

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;

        //Step 1 - Check in each Country Enterprise
        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

            for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                if (objOrganization instanceof PoorPeopleOrganization) {

                    for (Person objPerson : objOrganization.getObjPersonDirectory().getPersonList()) {

                        if (objPerson.getPersonInternationalID().equalsIgnoreCase(internationalIDPassed)) {
                            return true;
                        }
                        for (FamilyMember objFamilyMember : objPerson.getObjFamilyMemberDirectory().getFamilyMemberList()) {
                            if (objFamilyMember.getMemberInternationalID().equalsIgnoreCase(internationalIDPassed)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
