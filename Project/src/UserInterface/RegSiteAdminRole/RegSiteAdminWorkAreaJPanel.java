/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RegSiteAdminRole;

import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import UserInterface.ChangePasswordJPanel;
import UserInterface.FinanceRole.OverallTransactionJPanel;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class RegSiteAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegSiteAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount objUserAccount;
    private RegisteredSiteEnterprise objRegisteredSiteEnterprise;
    private Organization objOrganization;
    private WorldEnterprise objWorldEnterprise;

    public RegSiteAdminWorkAreaJPanel(JPanel userProcessContainerPassed, UserAccount objUserAccountPassed,
            WorldEnterprise objWorldEnterprisePassed, RegisteredSiteEnterprise objRegisteredSiteEnterprisePassed, Organization objOrganizationPassed) {
        initComponents();
        this.userProcessContainer = userProcessContainerPassed;
        this.objUserAccount = objUserAccountPassed;
        this.objRegisteredSiteEnterprise = objRegisteredSiteEnterprisePassed;
        this.objOrganization = objOrganizationPassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;

        loadForm();
    }

    private void loadForm() {

        nameDisplayJLabel.setText(objUserAccount.getObjPerson().toString());
        roleDisplayJLabel.setText(objUserAccount.getObjRole().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        mngOrganizationJButton = new javax.swing.JButton();
        mngUserJButton = new javax.swing.JButton();
        mngUserAcountJButton = new javax.swing.JButton();
        overallTransactionJButton = new javax.swing.JButton();
        nameJLabel = new javax.swing.JLabel();
        roleJLabel = new javax.swing.JLabel();
        roleDisplayJLabel = new javax.swing.JLabel();
        nameDisplayJLabel = new javax.swing.JLabel();
        changePasswordJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Registered Site Admin Work Area");

        mngOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mngOrganizationJButton.setText("Manage Registered Site Organization");
        mngOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrganizationJButtonActionPerformed(evt);
            }
        });

        mngUserJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mngUserJButton.setText("Manage User");
        mngUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserJButtonActionPerformed(evt);
            }
        });

        mngUserAcountJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mngUserAcountJButton.setText("Manage  User Account");
        mngUserAcountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAcountJButtonActionPerformed(evt);
            }
        });

        overallTransactionJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        overallTransactionJButton.setText("View Overall Transaction");
        overallTransactionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallTransactionJButtonActionPerformed(evt);
            }
        });

        nameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nameJLabel.setText("Welcome:");

        roleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        roleJLabel.setText("Role:");

        roleDisplayJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        nameDisplayJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        changePasswordJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        changePasswordJButton.setText("Change Password >>");
        changePasswordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roleDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                                .addComponent(changePasswordJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(overallTransactionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mngUserAcountJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mngUserJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mngOrganizationJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                            .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameJLabel)
                        .addComponent(nameDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changePasswordJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJLabel)
                    .addComponent(roleDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titleJLabel)
                .addGap(31, 31, 31)
                .addComponent(mngOrganizationJButton)
                .addGap(18, 18, 18)
                .addComponent(mngUserJButton)
                .addGap(18, 18, 18)
                .addComponent(mngUserAcountJButton)
                .addGap(18, 18, 18)
                .addComponent(overallTransactionJButton)
                .addContainerGap(363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mngOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrganizationJButtonActionPerformed

        ManageRegSiteOrganizationJPanel objManageRegSiteOrganizationJPanel = new ManageRegSiteOrganizationJPanel(userProcessContainer, objRegisteredSiteEnterprise);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageRegSiteOrganizationJPanel", objManageRegSiteOrganizationJPanel);
    }//GEN-LAST:event_mngOrganizationJButtonActionPerformed

    private void mngUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserJButtonActionPerformed

        ManageRegSiteUserJPanel objManageRegSiteUserJPanel = new ManageRegSiteUserJPanel(userProcessContainer, objRegisteredSiteEnterprise);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageRegSiteUserJPanel", objManageRegSiteUserJPanel);
    }//GEN-LAST:event_mngUserJButtonActionPerformed

    private void mngUserAcountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAcountJButtonActionPerformed

        ManageRegSiteUserAccountJPanel objManageRegSiteUserAccountJPanel = new ManageRegSiteUserAccountJPanel(userProcessContainer, objWorldEnterprise, objRegisteredSiteEnterprise, objOrganization, objUserAccount);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageRegSiteUserAccountJPanel", objManageRegSiteUserAccountJPanel);
    }//GEN-LAST:event_mngUserAcountJButtonActionPerformed

    private void overallTransactionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallTransactionJButtonActionPerformed

        OverallTransactionJPanel objOverallTransactionJPanel = new OverallTransactionJPanel(userProcessContainer, objUserAccount, objWorldEnterprise, objRegisteredSiteEnterprise, objOrganization);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "OverallTransactionJPanel", objOverallTransactionJPanel);
    }//GEN-LAST:event_overallTransactionJButtonActionPerformed

    private void changePasswordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordJButtonActionPerformed

        ChangePasswordJPanel objChangePasswordJPanel = new ChangePasswordJPanel(userProcessContainer, objUserAccount);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ChangePasswordJPanel", objChangePasswordJPanel);
    }//GEN-LAST:event_changePasswordJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordJButton;
    private javax.swing.JButton mngOrganizationJButton;
    private javax.swing.JButton mngUserAcountJButton;
    private javax.swing.JButton mngUserJButton;
    private javax.swing.JLabel nameDisplayJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JButton overallTransactionJButton;
    private javax.swing.JLabel roleDisplayJLabel;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
