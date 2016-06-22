/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.CountryEnterprise.CountryEnterprise;
import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public abstract class Role {

    
    //Enum type
    public enum RoleType{
        
        WorldAdmin("WorldAdmin"),
        CountryAdmin("CountryAdmin"),
        RegisteredSiteAdmin("RegisteredSiteAdmin"),
        RegisteredSiteAgent("RegisteredSiteAgent"),
        Donor("Donor"),
        Finance("Finance"),
        Support("Support"),
        PoorPeople("PoorPeople"),
        FieldAgent("FieldAgent"),
        FieldExpert("FieldExpert");
        
        private String value;
                
        private RoleType(String valuePassed) {
            
            this.value = valuePassed;
        }
        
        public String getValue() {
            
            return value;
        }

        @Override
        public String toString() {
            return getValue();
        }
    }
        
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    //Abstract method
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount objUserAccount, 
            WorldEnterprise objWorldEnterprise, CountryEnterprise objCountryEnterprise,
            RegisteredSiteEnterprise objRegisteredSiteEnterprise, Organization organization);

}

