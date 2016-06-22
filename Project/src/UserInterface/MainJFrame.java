/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.CountryEnterprise.CountryEnterprise;
import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Helper.DB4OUtil;
import Business.Helper.Validation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import UserInterface.DonorRole.DonorSignUpJPanel;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private WorldEnterprise objWorldEnterprise;
    private DB4OUtil objDB4OUtil = DB4OUtil.getInstance();
    private String userName, password;

    public MainJFrame() {
        initComponents();

        //objWorldEnterprise = ConfigureWorldEnterprise.configure();
        objWorldEnterprise = objDB4OUtil.retrieveSystem();

        //Load Home Screen
        HomeScreenJPanel objHomeScreenJPanel = new HomeScreenJPanel();
        CardLayoutContainer.addNewCardLayout(userProcessContainer, "HomeScreenJPanel", objHomeScreenJPanel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJSplitPane = new javax.swing.JSplitPane();
        loginJPanel = new javax.swing.JPanel();
        usernameJLabel = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        passwordJLabel = new javax.swing.JLabel();
        userJPasswordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        donorSignUpJButton = new javax.swing.JButton();
        loginJLabel = new javax.swing.JLabel();
        imageJLabel = new javax.swing.JLabel();
        thankYouJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainJSplitPane.setMinimumSize(new java.awt.Dimension(1600, 950));
        mainJSplitPane.setPreferredSize(new java.awt.Dimension(1600, 950));

        loginJPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginJPanel.setMinimumSize(new java.awt.Dimension(250, 950));
        loginJPanel.setPreferredSize(new java.awt.Dimension(250, 950));

        usernameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        usernameJLabel.setText("User Name:");

        usernameJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });

        passwordJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passwordJLabel.setText("Password");

        userJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        loginJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        donorSignUpJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        donorSignUpJButton.setText("New Donor Sign Up");
        donorSignUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorSignUpJButtonActionPerformed(evt);
            }
        });

        loginJLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        loginJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginJLabel.setText("Login");

        imageJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donate1.jpg"))); // NOI18N
        imageJLabel.setMaximumSize(new java.awt.Dimension(200, 150));
        imageJLabel.setMinimumSize(new java.awt.Dimension(200, 150));
        imageJLabel.setPreferredSize(new java.awt.Dimension(200, 150));

        thankYouJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thank you.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("AED - Final Project - 12-07-2014");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Smit Vijay Shah");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NUID - 001748537");

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(donorSignUpJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameJTextField)
                            .addComponent(userJPasswordField)
                            .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addComponent(thankYouJLabel)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(loginJLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameJLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(passwordJLabel)
                .addGap(18, 18, 18)
                .addComponent(userJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(loginJButton)
                .addGap(18, 18, 18)
                .addComponent(logoutJButton)
                .addGap(39, 39, 39)
                .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(donorSignUpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(thankYouJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );

        mainJSplitPane.setLeftComponent(loginJPanel);

        userProcessContainer.setMinimumSize(new java.awt.Dimension(700, 950));
        userProcessContainer.setPreferredSize(new java.awt.Dimension(700, 950));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        mainJSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(mainJSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        //Validation
        boolean validationSuccess;
        validationSuccess = validation();

        if (validationSuccess) {

            CountryEnterprise inObjCountryEnterprise = null;
            RegisteredSiteEnterprise inObjRegisteredSiteEnterprise = null;
            Organization inObjOrganization = null;
            UserAccount objUserAccount = null;

            //UserAccount objUserAccount = AuthenticateUser.authenticateUser(userName, password);
            //Step 1 - Check in World Enterprise
            labelWorld:
            for (Organization objOrganization : objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                objUserAccount = objOrganization.getObjUserAccountDirectory().validateUser(userName, password);

                if (objUserAccount != null) {
                    inObjOrganization = objOrganization;
                    break labelWorld;
                }
            }

            //Step 2 - Check in Country Enterprise
            labelCountry:
            if (objUserAccount == null) {

                for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

                    for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                        objUserAccount = objOrganization.getObjUserAccountDirectory().validateUser(userName, password);

                        if (objUserAccount != null) {
                            inObjCountryEnterprise = objCountryEnterprise;
                            inObjOrganization = objOrganization;
                            break labelCountry;
                        }
                    }
                }
            }

            //Step - 3 Registered Site Enterprise
            labelSite:
            if (objUserAccount == null) {

                for (CountryEnterprise objCountryEnterprise : objWorldEnterprise.getObjCountryEnterpriseDirectory().getCountryEnterpriseList()) {

                    for (RegisteredSiteEnterprise objRegisteredSiteEnterprise : objCountryEnterprise.getObjRegisteredSiteDirectory().getRegisteredSiteList()) {

                        for (Organization objOrganization : objRegisteredSiteEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                            objUserAccount = objOrganization.getObjUserAccountDirectory().validateUser(userName, password);

                            if (objUserAccount != null) {
                                inObjCountryEnterprise = objCountryEnterprise;
                                inObjRegisteredSiteEnterprise = objRegisteredSiteEnterprise;
                                inObjOrganization = objOrganization;
                                break labelSite;
                            }
                        }
                    }
                }
            }

            if (objUserAccount == null) {
                JOptionPane.showMessageDialog(null, "Please enter valid credentials!");
            } //If exists then open the WorkArea
            else {

                if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Acitve.getValue())) {
                    CardLayout objCardLayout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("WorkArea", objUserAccount.getObjRole().createWorkArea(userProcessContainer, objUserAccount, objWorldEnterprise, inObjCountryEnterprise, inObjRegisteredSiteEnterprise, inObjOrganization));
                    objCardLayout.next(userProcessContainer);

                    usernameJTextField.setText(null);
                    userJPasswordField.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Your account is not active. Please contact Administration or Support team!");
                }
            }
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private boolean validation() {

        userName = usernameJTextField.getText().trim();
        password = String.valueOf(userJPasswordField.getPassword());

        if (Validation.checkForNull(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter a UserName");
            usernameJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(password)) {
            JOptionPane.showMessageDialog(null, "Please enter a Password");
            userJPasswordField.requestFocus();
            return false;
        }

        return true;
    }


    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        usernameJTextField.setText(null);
        userJPasswordField.setText(null);

        objDB4OUtil.storeSystem(objWorldEnterprise);

        userProcessContainer.removeAll();

        HomeScreenJPanel objHomeScreenJPanel = new HomeScreenJPanel();
        CardLayoutContainer.addNewCardLayout(userProcessContainer, "HomeScreenJPanel", objHomeScreenJPanel);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void donorSignUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorSignUpJButtonActionPerformed

        DonorSignUpJPanel objDonorSignUpJPanel = new DonorSignUpJPanel(userProcessContainer, objWorldEnterprise);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "DonorSignUpJPanel", objDonorSignUpJPanel);
    }//GEN-LAST:event_donorSignUpJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donorSignUpJButton;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JSplitPane mainJSplitPane;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JLabel thankYouJLabel;
    private javax.swing.JPasswordField userJPasswordField;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}