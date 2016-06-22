/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import Business.WorldEnterprise;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class GenerateReports {

    
    //Generate donation received records
    public static void donationReceivedRecords(String content) {

        try {
            File file = new File("D://Reports/DonationReceivedReports.csv");
            System.out.println(file);

            if (!file.exists()) {
                file.createNewFile();

                //Create header for the file
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                String header = "Transaction ID, Source, Donor Name, Type, Mode, Amount, Date";
                
                pw.println(header);
                pw.close();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(content);

            pw.close();

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
    //Generate donation given records
    public static void donationGivenRecords(String content) {

        try {
            File file = new File("D://Reports/DonationGivenReports.csv");
            System.out.println(file);

            if (!file.exists()) {
                file.createNewFile();

                //Create header for the file
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                String header = "Transaction ID, Amount, Sender, Sender Organization, Receiver, Receiver Organization, Type, Mode";
                
                pw.println(header);
                pw.close();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(content);

            pw.close();

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
    
    //Generate transfer records
    public static void regSiteTransferRecords(String content) {

        try {
            File file = new File("D://Reports/RegSiteTransferReports.csv");
            System.out.println(file);

            if (!file.exists()) {
                file.createNewFile();

                //Create header for the file
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                String header = "Transaction ID, Amount, Sender, Sender Organization, Receiver, Receiver Organization, Type, Mode";
                
                pw.println(header);
                pw.close();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(content);

            pw.close();

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
    
    ////Generate user logs
    public static void userAccountLogs(String content) {

        try {
            File file = new File("D://Reports/UserAccountLogs.csv");
            System.out.println(file);

            if (!file.exists()) {
                file.createNewFile();

                //Create header for the file
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                String header = "User ID, Name, UserName, Previous Status, Current Status, Action Performed by, Organization, Date";
                
                pw.println(header);
                pw.close();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(content);

            pw.close();

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
