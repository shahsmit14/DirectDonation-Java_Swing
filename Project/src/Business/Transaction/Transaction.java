/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Transaction;

import Business.UserAccount.UserAccount;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class Transaction {
    
    
    //Variable Declaration
    private static int transactionCount = 1;
    private int transactionID;
    private String transactionSource;
    private String transactionDestination;
    private String transactionType;
    private String transactionMode;
    private BigDecimal transactionBDAmount; //BigDecimal to handle complex numbers even with decimals
    private UserAccount objUserAccountSource;
    private UserAccount objUserAccountDestination;
    private Calendar transactionDate;
    private String transactionDateToDisplay;    
    private SimpleDateFormat dateFormat;
    
    
    //Constructor
    public Transaction() {
        
        transactionID = transactionCount;
        transactionCount++;
        
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        transactionDate = Calendar.getInstance();
        transactionDateToDisplay = dateFormat.format(transactionDate.getTime());
    }
    
    
    //Enum Type
    public enum TransactionType {
        
        Debit("Debit"),
        Credit("Credit");
        
        private String value;
        
        private TransactionType(String valuePassed) {
            
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
    
    public enum TransactionModeType {
        
        Virtual("Virtual"),
        Real("Real");
        
        private String value;
        
        private TransactionModeType(String valuePassed) {
            
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
    
    //Enum Type
    public enum TransactionSourceType {
        
        FromWorldEnterprise("FromWorldEnterprise"),
        ToWorldEnterprise("ToWorldEnterprise"),
        FromCountryEnterprise("FromCountryEnterprise"),
        ToCountryEnterprise("ToCountryEnterprise"),
        FromRegSiteEnterprise("FromRegSiteEnterprise"),
        ToRegSiteEnterprise("ToRegSiteEnterprise"),
        FromDonor("FromDonor"),
        ToDonor("ToDonor"),        
        FromPoorPeople("FromPoorPeople"),
        ToPoorPeople("ToPoorPeople");
                
        private String value;
        
        private TransactionSourceType(String valuePassed) {
            
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

    
    //Getter-Setter methods
    public static int getTransactionCount() {
        return transactionCount;
    }

    public static void setTransactionCount(int transactionCount) {
        Transaction.transactionCount = transactionCount;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionSource() {
        return transactionSource;
    }

    public void setTransactionSource(String transactionSource) {
        this.transactionSource = transactionSource;
    }

    public String getTransactionDestination() {
        return transactionDestination;
    }

    public void setTransactionDestination(String transactionDestination) {
        this.transactionDestination = transactionDestination;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public UserAccount getObjUserAccountSource() {
        return objUserAccountSource;
    }

    public void setObjUserAccountSource(UserAccount objUserAccountSource) {
        this.objUserAccountSource = objUserAccountSource;
    }

    public UserAccount getObjUserAccountDestination() {
        return objUserAccountDestination;
    }

    public void setObjUserAccountDestination(UserAccount objUserAccountDestination) {
        this.objUserAccountDestination = objUserAccountDestination;
    }

    public Calendar getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDateToDisplay() {
        return transactionDateToDisplay;
    }

    public void setTransactionDateToDisplay(String transactionDateToDisplay) {
        this.transactionDateToDisplay = transactionDateToDisplay;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public BigDecimal getTransactionBDAmount() {
        return transactionBDAmount;
    }

    public void setTransactionBDAmount(BigDecimal transactionBDAmount) {
        this.transactionBDAmount = transactionBDAmount;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }
 
    @Override
    public String toString() {
        return String.valueOf(getTransactionID());
    }
    
}
