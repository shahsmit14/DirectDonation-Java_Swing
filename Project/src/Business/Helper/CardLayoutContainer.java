/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Helper;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class CardLayoutContainer {
    
    
    //Adds new Card Layout
    public static void addNewCardLayout(JPanel userProcessContainer, String cardName, Component objCardJPanel) {
       
        CardLayout objCardLayout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(cardName, objCardJPanel);
        objCardLayout.next(userProcessContainer);
    }
    
    
    //Removes current Layout
    public static void removeCurrentCardLayout(JPanel userProcessContainer, Component objCardJPanel) {
        
        userProcessContainer.remove(objCardJPanel);
        CardLayout objCardLayout = (CardLayout) userProcessContainer.getLayout();
        objCardLayout.previous(userProcessContainer);
    }
}
