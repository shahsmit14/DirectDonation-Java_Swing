/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CountryEnterprise;

import Business.Organization.CountryAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.PoorPeopleOrganization;
import Business.WorldEnterprise;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class CountryEnterpriseDirectory {

    //Variable Declaration
    private ArrayList<CountryEnterprise> countryEnterpriseList;
    //End of Variable Declaration

    //Constructor
    public CountryEnterpriseDirectory() {

        countryEnterpriseList = new ArrayList<>();
    }

    public ArrayList<CountryEnterprise> getCountryEnterpriseList() {
        return countryEnterpriseList;
    }

    //Method to create a new Country Enterprise
    public CountryEnterprise createNewCountryEnterprise() {

        CountryEnterprise objCountryEnterprise = new CountryEnterprise();
        countryEnterpriseList.add(objCountryEnterprise);
                
        //Add CountryEnterprise Admin Organization
        CountryAdminOrganization objCountryAdminOrganization = new CountryAdminOrganization();
        objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList().add(objCountryAdminOrganization);
        
        //Add Poor People Organization 
        PoorPeopleOrganization objPeopleOrganization = new PoorPeopleOrganization();
        objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList().add(objPeopleOrganization);
        
        return objCountryEnterprise;
    }

    
    //Method to check a country enterprise
    public static CountryEnterprise checkCountryEnterpriseExists(String countryNamePassed, 
            WorldEnterprise objWorldEnterprisePasseed) {

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePasseed;

        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

            if (objCountryEnterprise.getCountryEntName().equalsIgnoreCase(countryNamePassed)) {
                return objCountryEnterprise;
            }
        }
        return null;
    }
}
