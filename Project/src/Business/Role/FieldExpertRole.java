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
import UserInterface.FieldExpertRole.FieldExpertWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FieldExpertRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount objUserAccount, WorldEnterprise objWorldEnterprise, CountryEnterprise objCountryEnterprise, RegisteredSiteEnterprise objRegisteredSiteEnterprise, Organization objOrganization) {
        return new FieldExpertWorkAreaJPanel(userProcessContainer, objUserAccount, objCountryEnterprise, objOrganization);
    }
}
