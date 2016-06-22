/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import Business.Transaction.Transaction;
import Business.UserAccount.UserAccount;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class MobileNotification {

    public static void sendDonationMessageNotification(UserAccount objUserAccountPassed, Transaction objTransactionPassed) {

        String requestUrl;
        UserAccount objUserAccount = objUserAccountPassed;
        Transaction objTransaction = objTransactionPassed;
        String mobileNumber = objUserAccount.getObjPerson().getPersonContactNumber();

        String message = "Thank you " + objUserAccount.getObjPerson() + " for your donation of $ " + objTransaction.getTransactionBDAmount() + " to Direct Donation Inc.";

        System.out.println(message);
        
        try {
            requestUrl = "http://api.clickatell.com/http/sendmsg?user=smitshah14&password=tejsmi146185&api_id=3512143&to=" + mobileNumber + "&text=" + message;

            System.out.println(requestUrl);

            
             URL url = new URL(requestUrl);
             HttpURLConnection uc = (HttpURLConnection) url.openConnection();

             System.out.println(uc.getResponseMessage());

             uc.disconnect();
            
             
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}
