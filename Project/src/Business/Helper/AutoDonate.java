/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Organization.Organization;
import Business.Organization.PoorPeopleOrganization;
import Business.Person.Person;
import Business.Transaction.Transaction;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import java.math.BigDecimal;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class AutoDonate {

    //Check on available balance and total transfer amount
    public static BigDecimal donationCheck(WorldEnterprise objWorldEnterprisePassed, UserAccount objFinanceUserAccount) {

        BigDecimal worldDonation = BigDecimal.ZERO;

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;

        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

            for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                if (objOrganization instanceof PoorPeopleOrganization) {

                    for (UserAccount objUserAccount : objOrganization.getObjUserAccountDirectory().getUserAccountList()) {

                        if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Acitve.getValue())) {

                            Person objPerson = objUserAccount.getObjPerson();
                            if (objPerson.getPersonStatus().equals(Person.PersonRegStatusType.Active.getValue())) {

                                BigDecimal individualDonation, familyDonation;
                                BigDecimal totalDonation = new BigDecimal(0);

                                int personAge = objPerson.getPersonAge();

                                if (personAge >= 18 && personAge <= 25) {
                                    individualDonation = new BigDecimal(500);
                                } else if (personAge >= 26 && personAge <= 40) {
                                    individualDonation = new BigDecimal(600);
                                } else if (personAge >= 41 && personAge <= 55) {
                                    individualDonation = new BigDecimal(700);
                                } else if (personAge >= 56) {
                                    individualDonation = new BigDecimal(800);
                                } else {
                                    individualDonation = new BigDecimal(0);
                                }

                                int familyMemberSize = objPerson.getObjFamilyMemberDirectory().getFamilyMemberList().size();

                                if (familyMemberSize == 0) {
                                    familyDonation = new BigDecimal(0);
                                } else if (familyMemberSize >= 1 && familyMemberSize <= 2) {
                                    familyDonation = new BigDecimal(400);
                                } else if (familyMemberSize >= 3 && familyMemberSize <= 5) {
                                    familyDonation = new BigDecimal(800);
                                } else if (familyMemberSize >= 6) {
                                    familyDonation = new BigDecimal(1000);
                                } else {
                                    familyDonation = new BigDecimal(0);
                                }

                                totalDonation = individualDonation.add(familyDonation);

                                worldDonation = worldDonation.add(totalDonation);

                                System.out.println("----------////---------------------------///-------------------------------");
                                System.out.println("Individual Age: " + objPerson.getPersonAge());
                                System.out.println("Individua Donation: " + individualDonation);
                                System.out.println("Family Memebrs: " + objPerson.getObjFamilyMemberDirectory().getFamilyMemberList().size());
                                System.out.println("Family Donation: " + familyDonation);
                                System.out.println("Total Donation: " + totalDonation);
                                System.out.println("World Donation: " + worldDonation);
                            }
                        }
                    }
                }
            }
        }
        return worldDonation;
    }

    //Actual transfer
    public static BigDecimal donationConfirm(WorldEnterprise objWorldEnterprisePassed, UserAccount objFinanceUserAccount) {

        BigDecimal worldDonation = BigDecimal.ZERO;

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;

        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

            for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                if (objOrganization instanceof PoorPeopleOrganization) {

                    for (UserAccount objPPUserAccount : objOrganization.getObjUserAccountDirectory().getUserAccountList()) {

                        if (objPPUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Acitve.getValue())) {

                            Person objPPPerson = objPPUserAccount.getObjPerson();

                            if (objPPPerson.getPersonStatus().equals(Person.PersonRegStatusType.Active.getValue())) {

                                BigDecimal individualDonation, familyDonation;
                                BigDecimal totalDonation = new BigDecimal(0);

                                int personAge = objPPPerson.getPersonAge();

                                if (personAge >= 18 && personAge <= 25) {
                                    individualDonation = new BigDecimal(500);
                                } else if (personAge >= 26 && personAge <= 40) {
                                    individualDonation = new BigDecimal(600);
                                } else if (personAge >= 41 && personAge <= 55) {
                                    individualDonation = new BigDecimal(700);
                                } else if (personAge >= 56) {
                                    individualDonation = new BigDecimal(800);
                                } else {
                                    individualDonation = new BigDecimal(0);
                                }

                                int familyMemberSize = objPPPerson.getObjFamilyMemberDirectory().getFamilyMemberList().size();

                                if (familyMemberSize == 0) {
                                    familyDonation = new BigDecimal(0);
                                } else if (familyMemberSize >= 1 && familyMemberSize <= 2) {
                                    familyDonation = new BigDecimal(400);
                                } else if (familyMemberSize >= 3 && familyMemberSize <= 5) {
                                    familyDonation = new BigDecimal(800);
                                } else if (familyMemberSize >= 6) {
                                    familyDonation = new BigDecimal(1000);
                                } else {
                                    familyDonation = new BigDecimal(0);
                                }

                                totalDonation = individualDonation.add(familyDonation);
                                worldDonation = worldDonation.add(totalDonation);

                                //PoorPeople Transaction
                                Transaction objVirtualPPTransaction = (Transaction) objPPPerson.getObjPoorPeopleTransactionDirectory().addNewTransaction();
                                objVirtualPPTransaction.setTransactionBDAmount(totalDonation);
                                objVirtualPPTransaction.setObjUserAccountSource(objFinanceUserAccount);
                                objVirtualPPTransaction.setObjUserAccountDestination(objPPUserAccount);
                                objVirtualPPTransaction.setTransactionSource(Transaction.TransactionSourceType.FromWorldEnterprise.getValue());
                                objVirtualPPTransaction.setTransactionDestination(Transaction.TransactionSourceType.ToPoorPeople.getValue());
                                objVirtualPPTransaction.setTransactionType(Transaction.TransactionType.Credit.getValue());
                                objVirtualPPTransaction.setTransactionMode(Transaction.TransactionModeType.Virtual.getValue());
                                objPPPerson.getObjPoorPeopleTransactionDirectory().updateTransactionAccount();

                                //WorldEnterprise Transaction
                                Transaction objVirtualWETransaction = (Transaction) objWorldEnterprise.getObjTransactionDirectory().addNewTransaction();
                                objVirtualWETransaction.setTransactionBDAmount(totalDonation);
                                objVirtualWETransaction.setObjUserAccountSource(objFinanceUserAccount);
                                objVirtualWETransaction.setObjUserAccountDestination(objPPUserAccount);
                                objVirtualWETransaction.setTransactionSource(Transaction.TransactionSourceType.FromWorldEnterprise.getValue());
                                objVirtualWETransaction.setTransactionDestination(Transaction.TransactionSourceType.ToPoorPeople.getValue());
                                objVirtualWETransaction.setTransactionType(Transaction.TransactionType.Debit.getValue());
                                objVirtualWETransaction.setTransactionMode(Transaction.TransactionModeType.Virtual.getValue());
                                objWorldEnterprise.getObjTransactionDirectory().updateTransactionAccount();

                                //DonationGivenRecords
                                String donationLogs = objVirtualWETransaction.getTransactionID() + ","
                                        + objVirtualWETransaction.getTransactionBDAmount() + ","
                                        + objVirtualWETransaction.getObjUserAccountSource() + ","
                                        + objVirtualWETransaction.getTransactionSource() + ","
                                        + objVirtualWETransaction.getObjUserAccountDestination() + ","
                                        + objVirtualWETransaction.getTransactionDestination() + ","
                                        + objVirtualWETransaction.getTransactionType() + ","
                                        + objVirtualWETransaction.getTransactionMode();

                                GenerateReports.donationGivenRecords(donationLogs);

                            }
                        }
                    }
                }
            }
        }
        return worldDonation;
    }
}
