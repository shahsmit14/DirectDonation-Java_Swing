/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person.PoorPeople;

import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FamilyMemberDirectory {
    
    //Variable Declaration
    private ArrayList<FamilyMember> familyMemberList;
    //End of variable Declaration
    
    
    //Constructor
    public FamilyMemberDirectory() {

        familyMemberList = new ArrayList<>();
    }

    
    public ArrayList<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }

    //Method to add new member
    public FamilyMember addNewFamilyMember() {
        
        FamilyMember objFamilyMember = new FamilyMember();
        familyMemberList.add(objFamilyMember);
        return objFamilyMember;
    }
}
