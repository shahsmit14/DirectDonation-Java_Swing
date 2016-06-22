/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Organization.Organization;
import Business.Person.FieldExpert.FieldDriveDirectory;
import Business.Person.PoorPeople.FamilyMemberDirectory;
import Business.Transaction.TransactionDirectory;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class Person {

    //Variable Declaration
    //People
    private String personFirstName;
    private String personLastName;
    private static int personCount = 1;
    private int personID;

    //Information
    private String personInternationalID;
    private String personAddress1;
    private String personAddress2;
    private String personCity;
    private String personState;
    private String personCountry;
    private String personPinCode;
    private String personContactNumber;
    private String personEmailID;
    private String personSIMNumber;
    private String personPINNumber = null;
    private String personSex;
    private String personDateOfBirth;
    private int personAge;
    private String personRegisteredDate;
    private String personStatus;

    //House
    private String personHouseType;
    private String personHouseCondition;
    private String personHouseLatitude;
    private String personHouseLongitude;    
    
    //Donor
    TransactionDirectory objDonorTransactionDirectory;

    //Field Expert
    FieldDriveDirectory objFieldDriveDirectory;

    //PoorPeople
    FamilyMemberDirectory objFamilyMemberDirectory;
    TransactionDirectory objPoorPeopleTransactionDirectory;
    //End of Variable Declaration

    
    //Constructor
    public Person(String organizationName) {

        personID = personCount;
        personCount++;

        System.out.println(organizationName);

        //WorldAdmin
        if (organizationName.equals(Organization.OrganizationType.WorldAdmin.getValue())) {

        } //CountryAdmin
        else if (organizationName.equals(Organization.OrganizationType.CountryAdmin.getValue())) {

        } //RegisteredSiteAdmin
        else if (organizationName.equals(Organization.OrganizationType.RegisteredSiteAdmin.getValue())) {

        } //RegisteredSiteAgent
        else if (organizationName.equals(Organization.OrganizationType.RegisteredSiteAgent.getValue())) {

        } //Support
        else if (organizationName.equals(Organization.OrganizationType.Support.getValue())) {

        } //Donor
        else if (organizationName.equals(Organization.OrganizationType.Donor.getValue())) {
            objDonorTransactionDirectory = new TransactionDirectory();
        } //Finance
        else if (organizationName.equals(Organization.OrganizationType.Finance.getValue())) {

        } //FieldExpert
        else if (organizationName.equals(Organization.OrganizationType.FieldExpert.getValue())) {
            objFieldDriveDirectory = new FieldDriveDirectory();
        } //FieldAgent
        else if (organizationName.equals(Organization.OrganizationType.FieldAgent.getValue())) {

        } //PoorPeople
        else if (organizationName.equals(Organization.OrganizationType.PoorPeople.getValue())) {
            objFamilyMemberDirectory = new FamilyMemberDirectory();
            objPoorPeopleTransactionDirectory = new TransactionDirectory();
        }

    }

    //Enum Type
    public enum SexType {

        Male("Male"),
        Female("Female");

        private String value;

        private SexType(String valuePassed) {

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

    
    public enum HouseType {

        Mud("Mud"),
        Concrete("Concrete"),
        Brick("Brick"),
        Snow("Snow"),
        Stilts("Stilts");

        private String value;

        private HouseType(String valuePassed) {

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
    
    
    public enum HouseConditionType {

        Good("Good"),
        Average("Average"),
        Bad("Bad"),
        ExtremelyBad("ExtremelyBad");

        private String value;

        private HouseConditionType(String valuePassed) {

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
    
    
    public enum RelationType {

        Son("Son"),
        Daughter("Daughter"),
        Father("Father"),
        Mother("Mother"),
        Uncle("Uncle"),
        Aunty("Aunty"),
        Brother("Brother"),
        Sister("Sister"),
        GrandFather("GrandFather"),
        GrandMother("GrandMother");

        private String value;

        private RelationType(String valuePassed) {

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
    
    public enum PersonRegStatusType {

        Registered("Registered"),
        Approved("Approved"),
        DisApproved("DisApproved"),
        Active("Active");

        private String value;

        private PersonRegStatusType(String valuePassed) {

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
    
    //Getter-setter methods
    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonEmailID() {
        return personEmailID;
    }

    public void setPersonEmailID(String personEmailID) {
        this.personEmailID = personEmailID;
    }

    public String getPersonInternationalID() {
        return personInternationalID;
    }

    public void setPersonInternationalID(String personInternationalID) {
        this.personInternationalID = personInternationalID;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public static void setPersonCount(int personCount) {
        Person.personCount = personCount;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonAddress1() {
        return personAddress1;
    }

    public void setPersonAddress1(String personAddress1) {
        this.personAddress1 = personAddress1;
    }

    public String getPersonAddress2() {
        return personAddress2;
    }

    public void setPersonAddress2(String personAddress2) {
        this.personAddress2 = personAddress2;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    public String getPersonState() {
        return personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState;
    }

    public String getPersonCountry() {
        return personCountry;
    }

    public void setPersonCountry(String personCountry) {
        this.personCountry = personCountry;
    }

    public String getPersonPinCode() {
        return personPinCode;
    }

    public void setPersonPinCode(String personPinCode) {
        this.personPinCode = personPinCode;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonContactNumber() {
        return personContactNumber;
    }

    public void setPersonContactNumber(String personContactNumber) {
        this.personContactNumber = personContactNumber;
    }

    public String getPersonSIMNumber() {
        return personSIMNumber;
    }

    public void setPersonSIMNumber(String personSIMNumber) {
        this.personSIMNumber = personSIMNumber;
    }

    public String getPersonPINNumber() {
        return personPINNumber;
    }

    public void setPersonPINNumber(String personPINNumber) {
        this.personPINNumber = personPINNumber;
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    public String getPersonDateOfBirth() {
        return personDateOfBirth;
    }

    public void setPersonDateOfBirth(String personDateOfBirth) {
        this.personDateOfBirth = personDateOfBirth;
    }

    public String getPersonRegisteredDate() {
        return personRegisteredDate;
    }

    public void setPersonRegisteredDate(String personRegisteredDate) {
        this.personRegisteredDate = personRegisteredDate;
    }

    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }

    public TransactionDirectory getObjDonorTransactionDirectory() {
        return objDonorTransactionDirectory;
    }

    public void setObjDonorTransactionDirectory(TransactionDirectory objDonorTransactionDirectory) {
        this.objDonorTransactionDirectory = objDonorTransactionDirectory;
    }

    public FieldDriveDirectory getObjFieldDriveDirectory() {
        return objFieldDriveDirectory;
    }

    public void setObjFieldDriveDirectory(FieldDriveDirectory objFieldDriveDirectory) {
        this.objFieldDriveDirectory = objFieldDriveDirectory;
    }

    public FamilyMemberDirectory getObjFamilyMemberDirectory() {
        return objFamilyMemberDirectory;
    }

    public void setObjFamilyMemberDirectory(FamilyMemberDirectory objFamilyMemberDirectory) {
        this.objFamilyMemberDirectory = objFamilyMemberDirectory;
    }

    public TransactionDirectory getObjPoorPeopleTransactionDirectory() {
        return objPoorPeopleTransactionDirectory;
    }

    public void setObjPoorPeopleTransactionDirectory(TransactionDirectory objPoorPeopleTransactionDirectory) {
        this.objPoorPeopleTransactionDirectory = objPoorPeopleTransactionDirectory;
    }

    public String getPersonHouseType() {
        return personHouseType;
    }

    public void setPersonHouseType(String personHouseType) {
        this.personHouseType = personHouseType;
    }

    public String getPersonHouseCondition() {
        return personHouseCondition;
    }

    public void setPersonHouseCondition(String personHouseCondition) {
        this.personHouseCondition = personHouseCondition;
    }

    public String getPersonHouseLatitude() {
        return personHouseLatitude;
    }

    public void setPersonHouseLatitude(String personHouseLatitude) {
        this.personHouseLatitude = personHouseLatitude;
    }

    public String getPersonHouseLongitude() {
        return personHouseLongitude;
    }

    public void setPersonHouseLongitude(String personHouseLongitude) {
        this.personHouseLongitude = personHouseLongitude;
    }

    @Override
    public String toString() {
        return getPersonFirstName() + " " + getPersonLastName();
    }
}
