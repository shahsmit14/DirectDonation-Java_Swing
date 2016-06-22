/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.CountryEnterprise.CountryEnterprise;
import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorldEnterprise;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class UserAccountDirectory {

    //Variable Declaration
    private ArrayList<UserAccount> userAccountList;
    //End of variable Declaration

    //Constructor
    public UserAccountDirectory() {

        userAccountList = new ArrayList<>();
    }

    //Getter-setter method
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    //Method to add a new User Account
    public UserAccount createNewUserAccount(String userNamePassed, String passwordPassed,
            Person objPersonPassed, Role objRolePassed, String statusPassed) {

        UserAccount objUserAccount = new UserAccount();
        objUserAccount.setUserName(userNamePassed);
        objUserAccount.setPassword(passwordPassed);
        objUserAccount.setObjPerson(objPersonPassed);
        objUserAccount.setObjRole(objRolePassed);
        objUserAccount.setUserAccountStatus(statusPassed);

        userAccountList.add(objUserAccount);

        return objUserAccount;
    }

    
    //Method to validate a User
    public UserAccount validateUser(String username, String password){
        
        for (UserAccount objUserAccount : userAccountList)
            if (objUserAccount.getUserName().equals(username) && objUserAccount.getPassword().equals(password)){
                return objUserAccount;
            }
        return null;
    }
    
}