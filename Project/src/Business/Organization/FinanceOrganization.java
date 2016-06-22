/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.FinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FinanceOrganization extends Organization{

    public FinanceOrganization() {
        super(Organization.OrganizationType.Finance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new FinanceRole());
        
        return roleList;
    }
}
