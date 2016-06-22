/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.FieldAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FieldAgentOrganization extends Organization{

    public FieldAgentOrganization() {
        super(Organization.OrganizationType.FieldAgent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new FieldAgentRole());
        
        return roleList;
    }
}
