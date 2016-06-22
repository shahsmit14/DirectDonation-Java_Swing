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
import UserInterface.PoorPeopleRole.PoorPeopleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class PoorPeopleRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount objUserAccount, WorldEnterprise objWorldEnterprise, CountryEnterprise objCountryEnterprise, RegisteredSiteEnterprise objRegisteredSiteEnterprise, Organization objOrganization) {
        return new PoorPeopleWorkAreaJPanel(userProcessContainer, objUserAccount, objWorldEnterprise, objCountryEnterprise, objOrganization);
    }
}
