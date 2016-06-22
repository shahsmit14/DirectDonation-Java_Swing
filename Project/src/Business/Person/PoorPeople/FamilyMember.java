/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person.PoorPeople;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class FamilyMember {

    //Variable Declaration
    private String memberInternationalID;
    private String memberFirstName;
    private String memberLastName;
    private String memberRelation;
    private String memberSex;
    private String memberDateOfBirth;
    private int memberAge;

    
    //Getter-Setter methods
    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public String getMemberDateOfBirth() {
        return memberDateOfBirth;
    }

    public void setMemberDateOfBirth(String memberDateOfBirth) {
        this.memberDateOfBirth = memberDateOfBirth;
    }
    
    public String getMemberInternationalID() {
        return memberInternationalID;
    }

    public void setMemberInternationalID(String memberInternationalID) {
        this.memberInternationalID = memberInternationalID;
    }

    public String getMemberRelation() {
        return memberRelation;
    }

    public void setMemberRelation(String memberRelation) {
        this.memberRelation = memberRelation;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    @Override
    public String toString() {
        return getMemberFirstName() +  " " + getMemberLastName();
    }
    
}
