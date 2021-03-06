/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CountryAdminRole;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import UserInterface.ChangePasswordJPanel;
import UserInterface.WorldAdminRole.ManageCountryEnterpriseJPanel;
import UserInterface.WorldAdminRole.ManageWorldOrganizationJPanel;
import UserInterface.WorldAdminRole.ManageWorldUserAccountJPanel;
import UserInterface.WorldAdminRole.ManageWorldUserJPanel;
import javax.swing.JPanel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class CountryAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CountryAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount objUserAccount;
    private CountryEnterprise objCountryEnterprise;
    private Organization objOrganization;
    private WorldEnterprise objWorldEnterprise;

    public CountryAdminWorkAreaJPanel(JPanel userProcessContainerPassed, UserAccount objUserAccountPassed,
            WorldEnterprise objWorldEnterprisePassed, CountryEnterprise objCountryEnterprisePassed,
            Organization objOrganizationPassed) {
        initComponents();
        this.userProcessContainer = userProcessContainerPassed;
        this.objUserAccount = objUserAccountPassed;
        this.objCountryEnterprise = objCountryEnterprisePassed;
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
        mngRegSiteEntJButton = new javax.swing.JButton();
        mngOrganizationJButton = new javax.swing.JButton();
        mngUserJButton = new javax.swing.JButton();
        mngUserAcountJButton = new javax.swing.JButton();
        nameJLabel = new javax.swing.JLabel();
        nameDisplayJLabel = new javax.swing.JLabel();
        roleJLabel = new javax.swing.JLabel();
        roleDisplayJLabel = new javax.swing.JLabel();
        changePasswordJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Country Admin Work Area");

        mngRegSiteEntJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mngRegSiteEntJButton.setText("Manage Registered Site Enterprise");
        mngRegSiteEntJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngRegSiteEntJButtonActionPerformed(evt);
            }
        });

        mngOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mngOrganizationJButton.setText("Manage Country Organization");
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

        nameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nameJLabel.setText("Welcome:");

        nameDisplayJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        roleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        roleJLabel.setText("Role:");

        roleDisplayJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        changePasswordJButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        changePasswordJButton1.setText("Change Password >>");
        changePasswordJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordJButton1ActionPerformed(evt);
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changePasswordJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mngOrganizationJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mngRegSiteEntJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(mngUserJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mngUserAcountJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameJLabel)
                        .addComponent(nameDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changePasswordJButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJLabel)
                    .addComponent(roleDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titleJLabel)
                .addGap(30, 30, 30)
                .addComponent(mngOrganizationJButton)
                .addGap(18, 18, 18)
                .addComponent(mngRegSiteEntJButton)
                .addGap(18, 18, 18)
                .addComponent(mngUserJButton)
                .addGap(18, 18, 18)
                .addComponent(mngUserAcountJButton)
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mngRegSiteEntJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngRegSiteEntJButtonActionPerformed

        ManageRegSiteEntJPanel objManageRegSiteEntJPanel = new ManageRegSiteEntJPanel(userProcessContainer, objWorldEnterprise, objCountryEnterprise);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageRegSiteEntJPanel", objManageRegSiteEntJPanel);
    }//GEN-LAST:event_mngRegSiteEntJButtonActionPerformed

    private void mngOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrganizationJButtonActionPerformed

        ManageCountryOrganizationJPanel objManageCountryOrganizationJPanel = new ManageCountryOrganizationJPanel(userProcessContainer, objCountryEnterprise);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageCountryOrganizationJPanel", objManageCountryOrganizationJPanel);
    }//GEN-LAST:event_mngOrganizationJButtonActionPerformed

    private void mngUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserJButtonActionPerformed

        ManageCountryUserJPanel objManageCountryUserJPanel = new ManageCountryUserJPanel(userProcessContainer, objCountryEnterprise);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageCountryUserJPanel", objManageCountryUserJPanel);
    }//GEN-LAST:event_mngUserJButtonActionPerformed

    private void mngUserAcountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAcountJButtonActionPerformed

        ManageCountryUserAccountJPanel objManageCountryUserAccountJPanel = new ManageCountryUserAccountJPanel(userProcessContainer, objWorldEnterprise, objCountryEnterprise, objOrganization, objUserAccount);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ManageCountryUserAccountJPanel", objManageCountryUserAccountJPanel);
    }//GEN-LAST:event_mngUserAcountJButtonActionPerformed

    private void changePasswordJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordJButton1ActionPerformed

        ChangePasswordJPanel objChangePasswordJPanel = new ChangePasswordJPanel(userProcessContainer, objUserAccount);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ChangePasswordJPanel", objChangePasswordJPanel);
    }//GEN-LAST:event_changePasswordJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordJButton;
    private javax.swing.JButton changePasswordJButton1;
    private javax.swing.JButton mngOrganizationJButton;
    private javax.swing.JButton mngRegSiteEntJButton;
    private javax.swing.JButton mngUserAcountJButton;
    private javax.swing.JButton mngUserJButton;
    private javax.swing.JLabel nameDisplayJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel roleDisplayJLabel;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
