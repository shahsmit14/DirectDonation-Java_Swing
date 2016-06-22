/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RegSiteAdminRole;

import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Helper.GenerateReports;
import Business.Helper.UserNameExists;
import Business.Helper.Validation;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class ManageRegSiteUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRegSiteUserAccountJPanel
     */
    private JPanel userProcessContainer;
    private RegisteredSiteEnterprise objRegisteredSiteEnterprise;
    private WorldEnterprise objWorldEnterprise;
    private Organization objOrganization;
    private UserAccount objRSAUserAccount;
    private String userName, mainPassword, confirmPassword;

    public ManageRegSiteUserAccountJPanel(JPanel userProcessContainerPassed,
            WorldEnterprise objWorldEnterprisePassed, RegisteredSiteEnterprise objRegisteredSiteEnterprisePassed, 
            Organization objOrganizationPassed, UserAccount objUserAccountPassed) {

        initComponents();
        this.userProcessContainer = userProcessContainerPassed;
        this.objRegisteredSiteEnterprise = objRegisteredSiteEnterprisePassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;
        this.objOrganization = objOrganizationPassed;
        this.objRSAUserAccount = objUserAccountPassed;
        
        populateMainComboBox();
        populateAddUserComboBox();
    }

    private void populateMainComboBox() {

        regSiteOrgPopulateJComboBox.removeAllItems();

        for (Organization objOrganization : objRegisteredSiteEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

            regSiteOrgPopulateJComboBox.addItem(objOrganization);
        }
    }

    private void populateOrgUserTable(Organization objOrganizationPassed) {

        DefaultTableModel dtm = (DefaultTableModel) userAccountJTable.getModel();
        dtm.setRowCount(0);

        for (UserAccount objUserAccount : objOrganizationPassed.getObjUserAccountDirectory().getUserAccountList()) {

            Object row[] = new Object[6];
            row[0] = objUserAccount.getObjPerson().getPersonID();
            row[1] = objUserAccount.getObjPerson();
            row[2] = objUserAccount;
            row[3] = objOrganizationPassed.getClass().getSimpleName();
            row[4] = objUserAccount.getObjRole();
            row[5] = objUserAccount.getUserAccountStatus();

            dtm.addRow(row);
        }
    }

    private void populateAddUserComboBox() {

        regSiteOrgJComboBox.removeAllItems();

        for (Organization objOrganization : objRegisteredSiteEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

            regSiteOrgJComboBox.addItem(objOrganization);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRole1 = new javax.swing.JLabel();
        regSiteOrgJComboBox = new javax.swing.JComboBox();
        userNameJTextFiled = new javax.swing.JTextField();
        userConfirmJPasswordField = new javax.swing.JPasswordField();
        accountStatusJComboBox = new javax.swing.JComboBox();
        userJComboBox = new javax.swing.JComboBox();
        lblUserName = new javax.swing.JLabel();
        conPassJLabel = new javax.swing.JLabel();
        activateJButton = new javax.swing.JButton();
        roleJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userAccountJTable = new javax.swing.JTable();
        createUserAccountJButton = new javax.swing.JButton();
        pendingJButton = new javax.swing.JButton();
        userJPasswordField = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        lblOrganization1 = new javax.swing.JLabel();
        lblOrganization = new javax.swing.JLabel();
        regSiteOrgPopulateJComboBox = new javax.swing.JComboBox();
        lblEmployee = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        passJLabel = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        disableJButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblRole1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRole1.setText("Account Status");

        regSiteOrgJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        regSiteOrgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSiteOrgJComboBoxActionPerformed(evt);
            }
        });

        userNameJTextFiled.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        userConfirmJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        accountStatusJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        accountStatusJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountStatusJComboBoxActionPerformed(evt);
            }
        });

        userJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblUserName.setText("User Name");

        conPassJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        conPassJLabel.setText("Confirm Password");

        activateJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        activateJButton.setText("Activate");
        activateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateJButtonActionPerformed(evt);
            }
        });

        roleJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        userAccountJTable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        userAccountJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person ID", "Person Name", "User Name", "Organization", "Role", "User Accunt Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userAccountJTable);
        if (userAccountJTable.getColumnModel().getColumnCount() > 0) {
            userAccountJTable.getColumnModel().getColumn(0).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(1).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(2).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(3).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(4).setResizable(false);
            userAccountJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        createUserAccountJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        createUserAccountJButton.setText("Create user Account");
        createUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountJButtonActionPerformed(evt);
            }
        });

        pendingJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pendingJButton.setText("Pending");
        pendingJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingJButtonActionPerformed(evt);
            }
        });

        userJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitle.setText("Manage Persons/Users Account");

        lblOrganization1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblOrganization1.setText("Organization");

        lblOrganization.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblOrganization.setText("Organization");

        regSiteOrgPopulateJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        regSiteOrgPopulateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSiteOrgPopulateJComboBoxActionPerformed(evt);
            }
        });

        lblEmployee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEmployee.setText("Employee");

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        passJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passJLabel.setText("Password");

        lblRole.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRole.setText("Role");

        disableJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        disableJButton.setText("Disable");
        disableJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disableJButtonActionPerformed(evt);
            }
        });

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setText("Add New User/Person account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblOrganization1)
                            .addGap(55, 55, 55)
                            .addComponent(regSiteOrgPopulateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activateJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(userJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(userNameJTextFiled))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblRole1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(accountStatusJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(titleJLabel)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pendingJButton)
                                                    .addComponent(regSiteOrgJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passJLabel)
                                            .addComponent(conPassJLabel))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(createUserAccountJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                            .addComponent(userJPasswordField)
                                            .addComponent(userConfirmJPasswordField))))
                                .addGap(49, 49, 49)
                                .addComponent(disableJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regSiteOrgPopulateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganization1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activateJButton)
                    .addComponent(pendingJButton)
                    .addComponent(disableJButton))
                .addGap(29, 29, 29)
                .addComponent(titleJLabel)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganization)
                    .addComponent(regSiteOrgJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(userJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole1)
                    .addComponent(accountStatusJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(userNameJTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userConfirmJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conPassJLabel))
                .addGap(18, 18, 18)
                .addComponent(createUserAccountJButton)
                .addGap(64, 64, 64)
                .addComponent(backJButton)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regSiteOrgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSiteOrgJComboBoxActionPerformed

        Organization objOrganization = (Organization) regSiteOrgJComboBox.getSelectedItem();

        if (objOrganization != null) {
            populateUserJComboBox(objOrganization);
            populateRoleJComboBox(objOrganization);
            populateUserAccountStatusJComboBox();
        }
    }//GEN-LAST:event_regSiteOrgJComboBoxActionPerformed

    private void populateUserJComboBox(Organization objOrganizationPassed) {

        userJComboBox.removeAllItems();

        for (Person objPerson : objOrganizationPassed.getObjPersonDirectory().getPersonList()) {

            userJComboBox.addItem(objPerson);
        }
    }

    private void populateRoleJComboBox(Organization objOrganizationPassed) {

        roleJComboBox.removeAllItems();

        for (Role objRole : objOrganizationPassed.getSupportedRole()) {

            roleJComboBox.addItem(objRole);
        }
    }

    private void populateUserAccountStatusJComboBox() {

        accountStatusJComboBox.removeAllItems();

        for (UserAccount.StatusType accountStatus : UserAccount.StatusType.values()) {

            accountStatusJComboBox.addItem(accountStatus);
        }
    }


    private void accountStatusJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountStatusJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountStatusJComboBoxActionPerformed

    private void activateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateJButtonActionPerformed

        UserAccount objUserAccount = null;

        int selectedUser = userAccountJTable.getSelectedRow();

        if (selectedUser < 0) {
            JOptionPane.showMessageDialog(null, "Please select a User");
            return;
        }

        objUserAccount = (UserAccount) userAccountJTable.getValueAt(selectedUser, 2);

        if (objUserAccount != null) {
            if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Acitve.getValue())) {

                JOptionPane.showMessageDialog(null, "Acccount is already active");
                return;
            }
            if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Disabled.getValue())
                    || objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Pending.getValue())) {

                String previousStatus = objUserAccount.getUserAccountStatus();
                
                objUserAccount.setUserAccountStatus(UserAccount.StatusType.Acitve.getValue());
                JOptionPane.showMessageDialog(null, "Acccount activated");

                populateMainComboBox();
                
                //AccountLogs
                String accountLogs =  objUserAccount.getObjPerson().getPersonID() + ","
                        + objUserAccount.getObjPerson() + ","
                        + objUserAccount + ","
                        + previousStatus + ","
                        + objUserAccount.getUserAccountStatus() + ","
                        + objRSAUserAccount + ","
                        + objOrganization + ","
                        + new Date();
                
                GenerateReports.userAccountLogs(accountLogs);

            }
        }
    }//GEN-LAST:event_activateJButtonActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void createUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountJButtonActionPerformed

        //Validation
        boolean validationSuccess;
        validationSuccess = validation();

        if (validationSuccess) {

            UserAccount objUserAccount = (UserAccount) UserNameExists.userNameCheck(objWorldEnterprise, userNameJTextFiled.getText());

            if (objUserAccount == null) {

                Person objPerson = (Person) userJComboBox.getSelectedItem();
                Role objRole = (Role) roleJComboBox.getSelectedItem();
                Organization objOrganization = (Organization) regSiteOrgJComboBox.getSelectedItem();
                UserAccount.StatusType accountStatus = (UserAccount.StatusType) accountStatusJComboBox.getSelectedItem();

                if (objPerson != null && objRole != null && objOrganization != null && accountStatus != null) {

                    if (mainPassword.equals(confirmPassword)) {
                        objOrganization.getObjUserAccountDirectory().createNewUserAccount(userName, mainPassword, objPerson, objRole, accountStatus.getValue());

                        JOptionPane.showMessageDialog(null, "New user user account added successfully!");

                        regSiteOrgPopulateJComboBox.setSelectedItem(objOrganization);

                        userNameJTextFiled.setText(null);
                        userJPasswordField.setText(null);
                        userConfirmJPasswordField.setText(null);

                    } else {
                        JOptionPane.showMessageDialog(null, "Password does not matches");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select again or some values are missing");
                }

            } else {
                JOptionPane.showMessageDialog(null, "User Name already exists! Please use some other username");
            }
        }
    }//GEN-LAST:event_createUserAccountJButtonActionPerformed

    private boolean validation() {

        userName = userNameJTextFiled.getText().trim();
        mainPassword = String.valueOf(userJPasswordField.getPassword());
        confirmPassword = String.valueOf(userConfirmJPasswordField.getPassword());

        if (Validation.checkForNull(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter username");
            userNameJTextFiled.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumAlphabets(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter proper username. It should contain only alphabets and numbers");
            userNameJTextFiled.requestFocus();
            return false;
        }

        if (Validation.checkForNull(mainPassword)) {
            JOptionPane.showMessageDialog(null, "Please enter password");
            userJPasswordField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Please enter confirm password");
            userConfirmJPasswordField.requestFocus();
            return false;
        }

        return true;
    }


    private void pendingJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingJButtonActionPerformed

        UserAccount objUserAccount = null;

        int selectedUser = userAccountJTable.getSelectedRow();

        if (selectedUser < 0) {
            JOptionPane.showMessageDialog(null, "Please select a User");
            return;
        }

        objUserAccount = (UserAccount) userAccountJTable.getValueAt(selectedUser, 2);

        if (objUserAccount != null) {

            if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Pending.getValue())) {

                JOptionPane.showMessageDialog(null, "Acccount is already Pending");
                return;
            }
            if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Disabled.getValue())
                    || objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Acitve.getValue())) {

                String previousStatus = objUserAccount.getUserAccountStatus();
                
                objUserAccount.setUserAccountStatus(UserAccount.StatusType.Pending.getValue());
                JOptionPane.showMessageDialog(null, "Acccount set to Pending");

                populateMainComboBox();

                //AccountLogs
                String accountLogs =  objUserAccount.getObjPerson().getPersonID() + ","
                        + objUserAccount.getObjPerson() + ","
                        + objUserAccount + ","
                        + previousStatus + ","
                        + objUserAccount.getUserAccountStatus() + ","
                        + objRSAUserAccount + ","
                        + objOrganization + ","
                        + new Date();
                
                GenerateReports.userAccountLogs(accountLogs);

            }
        }
    }//GEN-LAST:event_pendingJButtonActionPerformed

    private void regSiteOrgPopulateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSiteOrgPopulateJComboBoxActionPerformed

        Organization objOrganization = (Organization) regSiteOrgPopulateJComboBox.getSelectedItem();

        if (objOrganization != null) {
            populateOrgUserTable(objOrganization);
        }
    }//GEN-LAST:event_regSiteOrgPopulateJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        CardLayoutContainer.removeCurrentCardLayout(userProcessContainer, this);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void disableJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disableJButtonActionPerformed

        UserAccount objUserAccount = null;

        int selectedUser = userAccountJTable.getSelectedRow();

        if (selectedUser < 0) {
            JOptionPane.showMessageDialog(null, "Please select a User");
            return;
        }

        objUserAccount = (UserAccount) userAccountJTable.getValueAt(selectedUser, 2);

        if (objUserAccount != null) {

            if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Disabled.getValue())) {

                JOptionPane.showMessageDialog(null, "Acccount is already Disabled");
                return;
            }
            if (objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Acitve.getValue())
                    || objUserAccount.getUserAccountStatus().equals(UserAccount.StatusType.Pending.getValue())) {

                String previousStatus = objUserAccount.getUserAccountStatus();
                
                objUserAccount.setUserAccountStatus(UserAccount.StatusType.Disabled.getValue());
                JOptionPane.showMessageDialog(null, "Acccount Disabled");

                populateMainComboBox();
                
                //AccountLogs
                String accountLogs =  objUserAccount.getObjPerson().getPersonID() + ","
                        + objUserAccount.getObjPerson() + ","
                        + objUserAccount + ","
                        + previousStatus + ","
                        + objUserAccount.getUserAccountStatus() + ","
                        + objRSAUserAccount + ","
                        + objOrganization + ","
                        + new Date();
                
                GenerateReports.userAccountLogs(accountLogs);

            }
        }
    }//GEN-LAST:event_disableJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accountStatusJComboBox;
    private javax.swing.JButton activateJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel conPassJLabel;
    private javax.swing.JButton createUserAccountJButton;
    private javax.swing.JButton disableJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblOrganization1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblRole1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel passJLabel;
    private javax.swing.JButton pendingJButton;
    private javax.swing.JComboBox regSiteOrgJComboBox;
    private javax.swing.JComboBox regSiteOrgPopulateJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JTable userAccountJTable;
    private javax.swing.JPasswordField userConfirmJPasswordField;
    private javax.swing.JComboBox userJComboBox;
    private javax.swing.JPasswordField userJPasswordField;
    private javax.swing.JTextField userNameJTextFiled;
    // End of variables declaration//GEN-END:variables
}