/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import Business.CountryEnterprise.CountryEnterprise;
import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
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
public class AutoTransfer {

    //Check on available balance and total transfer amount
    public static BigDecimal transferCheck(WorldEnterprise objWorldEnterprisePassed, UserAccount objFinanceUserAccount,
            BigDecimal transferAmountPassed) {

        BigDecimal worldDonation = BigDecimal.ZERO;

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;

        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

            for (RegisteredSiteEnterprise objRegisteredSiteEnterprise : objCountryEnterprise.getObjRegisteredSiteDirectory().getRegisteredSiteList()) {

                BigDecimal individualDonation = transferAmountPassed;

                worldDonation = worldDonation.add(individualDonation);
            }
        }
        return worldDonation;
    }

    //Actual transfer
    public static BigDecimal transferConfirm(WorldEnterprise objWorldEnterprisePassed, UserAccount objFinanceUserAccount,
            BigDecimal transferAmountPassed) {

        BigDecimal worldDonation = BigDecimal.ZERO;

        WorldEnterprise objWorldEnterprise = objWorldEnterprisePassed;

        for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

            for (RegisteredSiteEnterprise objRegisteredSiteEnterprise : objCountryEnterprise.getObjRegisteredSiteDirectory().getRegisteredSiteList()) {

                if (objRegisteredSiteEnterprise != null) {

                    BigDecimal individualDonation = transferAmountPassed;

                    worldDonation = worldDonation.add(individualDonation);

                    //Registered Site Transaction
                    Transaction objRealRSTransaction = (Transaction) objRegisteredSiteEnterprise.getObjTransactionDirectory().addNewTransaction();
                    objRealRSTransaction.setTransactionBDAmount(individualDonation);
                    objRealRSTransaction.setObjUserAccountSource(objFinanceUserAccount);
                    objRealRSTransaction.setObjUserAccountDestination(null);
                    objRealRSTransaction.setTransactionSource(Transaction.TransactionSourceType.FromWorldEnterprise.getValue());
                    objRealRSTransaction.setTransactionDestination(Transaction.TransactionSourceType.ToRegSiteEnterprise.getValue());
                    objRealRSTransaction.setTransactionType(Transaction.TransactionType.Credit.getValue());
                    objRealRSTransaction.setTransactionMode(Transaction.TransactionModeType.Real.getValue());
                    objRegisteredSiteEnterprise.getObjTransactionDirectory().updateTransactionAccount();

                    //WorldEnterprise Transaction
                    Transaction objRealWETransaction = (Transaction) objWorldEnterprise.getObjTransactionDirectory().addNewTransaction();
                    objRealWETransaction.setTransactionBDAmount(individualDonation);
                    objRealWETransaction.setObjUserAccountSource(objFinanceUserAccount);
                    objRealWETransaction.setObjUserAccountDestination(null);
                    objRealWETransaction.setTransactionSource(Transaction.TransactionSourceType.FromWorldEnterprise.getValue());
                    objRealWETransaction.setTransactionDestination(Transaction.TransactionSourceType.ToRegSiteEnterprise.getValue());
                    objRealWETransaction.setTransactionType(Transaction.TransactionType.Debit.getValue());
                    objRealWETransaction.setTransactionMode(Transaction.TransactionModeType.Real.getValue());
                    objWorldEnterprise.getObjTransactionDirectory().updateTransactionAccount();

                    //RegSiteTransferRecords
                    String donationLogs = objRealWETransaction.getTransactionID() + ","
                            + objRealWETransaction.getTransactionBDAmount() + ","
                            + objRealWETransaction.getObjUserAccountSource() + ","
                            + objRealWETransaction.getTransactionSource() + ","
                            + objRegisteredSiteEnterprise + ","
                            + objRealWETransaction.getTransactionDestination() + ","
                            + objRealWETransaction.getTransactionType() + ","
                            + objRealWETransaction.getTransactionMode();

                    GenerateReports.regSiteTransferRecords(donationLogs);

                }
            }
        }
        return worldDonation;
    }
}
