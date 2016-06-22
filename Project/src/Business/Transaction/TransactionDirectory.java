/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class TransactionDirectory {

    //Variable Declaration
    private BigDecimal totalVirtualDebitAmount;
    private BigDecimal totalVirtualCreditAmount;
    private BigDecimal totalRealDebitAmount;
    private BigDecimal totalRealCreditAmount;
    private BigDecimal totalDonationReceived;

    private BigDecimal availableVirtualBalance;
    private BigDecimal availableRealBalance;

    private ArrayList<Transaction> transactionList;
    //End of variable Declaration

    //Constructor
    public TransactionDirectory() {

        transactionList = new ArrayList<>();

    }

    
    //Method to add new transaction
    public Transaction addNewTransaction() {

        Transaction objTransaction = new Transaction();
        transactionList.add(objTransaction);
        return objTransaction;
    }

    
    //Method to update transaction details
    public void updateTransactionAccount() {

        totalVirtualDebitAmount = BigDecimal.ZERO;
        totalVirtualCreditAmount = BigDecimal.ZERO;
        totalRealDebitAmount = BigDecimal.ZERO;
        totalRealCreditAmount = BigDecimal.ZERO;
        availableVirtualBalance = BigDecimal.ZERO;
        availableRealBalance = BigDecimal.ZERO;
        totalDonationReceived = BigDecimal.ZERO;
        
        for (Transaction objTransaction : transactionList) {

            //Real
            if (objTransaction.getTransactionMode().equals(Transaction.TransactionModeType.Real.getValue())) {
                //Credit
                if (objTransaction.getTransactionType().equals(Transaction.TransactionType.Credit.getValue())) {

                    totalRealCreditAmount = totalRealCreditAmount.add(objTransaction.getTransactionBDAmount());
                    
                    if (objTransaction.getTransactionSource().equals(Transaction.TransactionSourceType.FromDonor.getValue())) {
                        totalDonationReceived = totalDonationReceived.add(objTransaction.getTransactionBDAmount());
                    }
                }

                //Debit
                if (objTransaction.getTransactionType().equals(Transaction.TransactionType.Debit.getValue())) {

                    totalRealDebitAmount = totalRealDebitAmount.add(objTransaction.getTransactionBDAmount());
                }
            }

            //Virtual
            if (objTransaction.getTransactionMode().equals(Transaction.TransactionModeType.Virtual.getValue())) {
                //Credit
                if (objTransaction.getTransactionType().equals(Transaction.TransactionType.Credit.getValue())) {

                    totalVirtualCreditAmount = totalVirtualCreditAmount.add(objTransaction.getTransactionBDAmount());
                }

                //Debit
                if (objTransaction.getTransactionType().equals(Transaction.TransactionType.Debit.getValue())) {

                    totalVirtualDebitAmount = totalVirtualDebitAmount.add(objTransaction.getTransactionBDAmount());
                }
            }
        }

        availableVirtualBalance = totalVirtualCreditAmount.subtract(totalVirtualDebitAmount);
        availableRealBalance = totalRealCreditAmount.subtract(totalRealDebitAmount);

//        System.out.println("-------------------------------------------------------");
//        System.out.println(
//                "Total Real Credit:" + totalRealCreditAmount);
//        System.out.println(
//                "Total Real Debit:" + totalRealDebitAmount);
//        System.out.println(
//                "Available Real Balance:" + availableRealBalance);
//
//        System.out.println(
//                "Total Virtual Credit:" + totalVirtualCreditAmount);
//        System.out.println(
//                "Total Virtual Debit:" + totalVirtualDebitAmount);
//        System.out.println(
//                "Available Virtual Balance:" + availableVirtualBalance);
//        System.out.println(
//                "Total Donation Receives:" + totalDonationReceived);
//        System.out.println("-------------------------------------------------------");
    }

    
    //Getter-Setter methods
    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public BigDecimal getTotalVirtualDebitAmount() {
        return totalVirtualDebitAmount;
    }

    public void setTotalVirtualDebitAmount(BigDecimal totalVirtualDebitAmount) {
        this.totalVirtualDebitAmount = totalVirtualDebitAmount;
    }

    public BigDecimal getTotalVirtualCreditAmount() {
        return totalVirtualCreditAmount;
    }

    public void setTotalVirtualCreditAmount(BigDecimal totalVirtualCreditAmount) {
        this.totalVirtualCreditAmount = totalVirtualCreditAmount;
    }

    public BigDecimal getTotalRealDebitAmount() {
        return totalRealDebitAmount;
    }

    public void setTotalRealDebitAmount(BigDecimal totalRealDebitAmount) {
        this.totalRealDebitAmount = totalRealDebitAmount;
    }

    public BigDecimal getTotalRealCreditAmount() {
        return totalRealCreditAmount;
    }

    public void setTotalRealCreditAmount(BigDecimal totalRealCreditAmount) {
        this.totalRealCreditAmount = totalRealCreditAmount;
    }

    public BigDecimal getAvailableVirtualBalance() {
        return availableVirtualBalance;
    }

    public void setAvailableVirtualBalance(BigDecimal availableVirtualBalance) {
        this.availableVirtualBalance = availableVirtualBalance;
    }

    public BigDecimal getAvailableRealBalance() {
        return availableRealBalance;
    }

    public void setAvailableRealBalance(BigDecimal availableRealBalance) {
        this.availableRealBalance = availableRealBalance;
    }

    public BigDecimal getTotalDonationReceived() {
        return totalDonationReceived;
    }

    public void setTotalDonationReceived(BigDecimal totalDonationReceived) {
        this.totalDonationReceived = totalDonationReceived;
    }

}
