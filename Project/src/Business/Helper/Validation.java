/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class Validation {

    //To find Special Characters in String  
    private static final Pattern onlyAlphabets = Pattern.compile("[^a-zA-Z ]"); //Only alphabets
    private static final Pattern onlyNumAlphabets = Pattern.compile("[^a-zA-Z0-9]"); //Only alphabets and numbers
    private static final Pattern onlyNumbers = Pattern.compile("[^0-9]"); //Only numbers
    
    /*
    private static final Pattern validEmailId1 = Pattern.compile("[@]");
    private static final Pattern validEmailId2 = Pattern.compile("[.]");
    private static final Pattern inValidEmailId = Pattern.compile("[^0-9a-zA-Z@.]"); 
    */
    
    private static final Pattern inValidGPSCoordinates = Pattern.compile("^[-+]?[0-9]*[.,]?[0-9]+$"); //("^(\\-?\\d+(\\.\\d+)?),\\s*(\\-?\\d+(\\.\\d+)?)$");
    
    //To check NULL or empty values
    public static boolean checkForNull(String valuePassed) {
      
        
        String value = valuePassed.trim();

        if (value.equals("") || value.equals(null)) {
            return true;
        }
        return false;
        
    }

    //To check Alphabets
    public static boolean checkForOnlyAlphabets(String valuePassed) {

        boolean contains;
        String value = valuePassed.trim();

        contains = onlyAlphabets.matcher(value).find();

        if (contains) {
            return true;
        }

        return false;
    }
    
    //To check Numbers
    public static boolean checkForOnlyNumbers(String valuePassed) {

        boolean contains;
        String value = valuePassed.trim();

        contains = onlyNumbers.matcher(value).find();

        if (contains) {
            return true;
        }

        return false;
    }

    //To check Alphabets and Numbers
    public static boolean checkForOnlyNumAlphabets(String valuePassed) {

        boolean contains;
        String value = valuePassed.trim();

        contains = onlyNumAlphabets.matcher(value).find();

        if (contains) {
            return true;
        }

        return false;
    }
    
    //To check positive numbers
    public static boolean checkForPositiveNumbers(int valuePassed) {

        int value = valuePassed;

        if (value < 0) {
            return false;
        }

        return true;
    }
        
    //To check Negative amount
    public static boolean checkForNegativeAmount(BigDecimal valuePassed) {

        boolean contains;
        BigDecimal value = valuePassed;

        System.out.println(value);
        
        if (value.signum() <= 0) {
            return true;
        }
        
        return false;
    }
    
    //To check valid GPS coordinates
    public static boolean checkForInValidGPSCoordinates(String valuePassed) {

        boolean contains;
        String value = valuePassed.trim();

        contains = inValidGPSCoordinates.matcher(value).find();

        if (contains) {
            return false;
        }
        return true;
    }
}