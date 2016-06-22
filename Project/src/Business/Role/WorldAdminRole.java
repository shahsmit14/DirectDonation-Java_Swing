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
import UserInterface.WorldAdminRole.WorldAdminWorkAreaJPanelJPanel;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class WorldAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount objUserAccount, WorldEnterprise objWorldEnterprise, CountryEnterprise objCountryEnterprise, RegisteredSiteEnterprise objRegisteredSiteEnterprise, Organization objOrganization) {
        return new WorldAdminWorkAreaJPanelJPanel(userProcessContainer, objWorldEnterprise, objUserAccount, objOrganization);
    }
}
