/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.RegSiteAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class RegisteredSiteAgentOrganization extends Organization{

    public RegisteredSiteAgentOrganization() {
        super(Organization.OrganizationType.RegisteredSiteAgent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new RegSiteAgentRole());
        
        return roleList;
    }
}
