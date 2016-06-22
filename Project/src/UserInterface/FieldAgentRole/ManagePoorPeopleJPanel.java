/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FieldAgentRole;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Helper.UserNameExists;
import Business.Helper.Validation;
import Business.Organization.Organization;
import Business.Organization.PoorPeopleOrganization;
import Business.Person.Person;
import Business.Role.PoorPeopleRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PPVerificationWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorldEnterprise;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class ManagePoorPeopleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePoorPeopleJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount objUserAccount;
    private CountryEnterprise objCountryEnterprise;
    private Organization objOrganization;
    private Person objPerson;
    private WorldEnterprise objWorldEnterprise;
    String contactNumber, simNumber, mainPassword, confirmPassword;

    public ManagePoorPeopleJPanel(JPanel userProcessContainerPassed, UserAccount objUserAccountPassed,
            WorldEnterprise objWorldEnterprisePassed, CountryEnterprise objCountryEnterprisePassed, Organization objOrganizationPassed) {

        initComponents();

        this.userProcessContainer = userProcessContainerPassed;
        this.objUserAccount = objUserAccountPassed;
        this.objCountryEnterprise = objCountryEnterprisePassed;
        this.objOrganization = objOrganizationPassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;

        populatePoorPeopleTable();
    }

    private void populatePoorPeopleTable() {

        DefaultTableModel dtm = (DefaultTableModel) poorPeopleJTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest objWorkRequest : objUserAccount.getObjWorkQueue().getWorkRequestList()) {

            if (objWorkRequest instanceof PPVerificationWorkRequest) {

                PPVerificationWorkRequest objPPVerificationWorkRequest = (PPVerificationWorkRequest) objWorkRequest;
                Object row[] = new Object[7];
                row[0] = objWorkRequest.getWorkRequestID();
                row[1] = objPPVerificationWorkRequest.getObjPerson().getPersonFirstName();
                row[2] = objPPVerificationWorkRequest.getObjPerson().getPersonStatus();
                row[3] = objWorkRequest.getSender();
                row[4] = (objWorkRequest.getReceiver() == null) ? ("N/A") : (objWorkRequest.getReceiver());
                row[5] = objWorkRequest.getMessage();
                row[6] = objWorkRequest;

                dtm.addRow(row);
            }
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

        addNewPPJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        poorPeopleJTable = new javax.swing.JTable();
        assignNumberJButton = new javax.swing.JButton();
        userNameJLabel = new javax.swing.JLabel();
        mobileNumberJTextField = new javax.swing.JTextField();
        simJLabel = new javax.swing.JLabel();
        simNumberJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        personNameJTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        passJLabel = new javax.swing.JLabel();
        conPassJLabel = new javax.swing.JLabel();
        mainJPasswordField = new javax.swing.JPasswordField();
        confirmJPasswordField = new javax.swing.JPasswordField();
        ppJProgressBar = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(255, 255, 255));

        addNewPPJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addNewPPJButton.setText("Add New Poor People");
        addNewPPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPPJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setText("Manage Poor People");

        poorPeopleJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        poorPeopleJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Poor People Name", "Person Status", "Field Agent Name", "Filed Expert Name", "Message", "Work Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        poorPeopleJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poorPeopleJTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(poorPeopleJTable);
        if (poorPeopleJTable.getColumnModel().getColumnCount() > 0) {
            poorPeopleJTable.getColumnModel().getColumn(0).setResizable(false);
            poorPeopleJTable.getColumnModel().getColumn(1).setResizable(false);
            poorPeopleJTable.getColumnModel().getColumn(2).setResizable(false);
            poorPeopleJTable.getColumnModel().getColumn(3).setResizable(false);
            poorPeopleJTable.getColumnModel().getColumn(4).setResizable(false);
            poorPeopleJTable.getColumnModel().getColumn(5).setResizable(false);
            poorPeopleJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        assignNumberJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        assignNumberJButton.setText("Create Account & Assign Mobile");
        assignNumberJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignNumberJButtonActionPerformed(evt);
            }
        });

        userNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userNameJLabel.setText("Mobile Number(UserName)");

        mobileNumberJTextField.setEditable(false);
        mobileNumberJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        simJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        simJLabel.setText("SIM Card Number");

        simNumberJTextField.setEditable(false);
        simNumberJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        addJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addJButton.setText("Update");
        addJButton.setEnabled(false);
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        personNameJTextField.setEditable(false);
        personNameJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        nameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nameJLabel.setText("Person Name");

        passJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passJLabel.setText("Password");

        conPassJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        conPassJLabel.setText("Confirm Password");

        mainJPasswordField.setEditable(false);
        mainJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        confirmJPasswordField.setEditable(false);
        confirmJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        ppJProgressBar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(personNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mobileNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(simJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conPassJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mainJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(confirmJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(simNumberJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(assignNumberJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addNewPPJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                                .addComponent(ppJProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(titleJLabel)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ppJProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewPPJButton)
                .addGap(43, 43, 43)
                .addComponent(assignNumberJButton)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(personNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJLabel)
                    .addComponent(mobileNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simJLabel)
                    .addComponent(simNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passJLabel)
                    .addComponent(mainJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conPassJLabel)
                    .addComponent(confirmJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        CardLayoutContainer.removeCurrentCardLayout(userProcessContainer, this);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addNewPPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPPJButtonActionPerformed

        RegisterPoorPeopleJPanel objRegisterPoorPeopleJPanel = new RegisterPoorPeopleJPanel(userProcessContainer,
                objUserAccount, objWorldEnterprise, objCountryEnterprise, objOrganization);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "RegisterPoorPeopleJPanel", objRegisterPoorPeopleJPanel);
    }//GEN-LAST:event_addNewPPJButtonActionPerformed

    private void assignNumberJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignNumberJButtonActionPerformed

        mobileNumberJTextField.setEditable(false);
        simNumberJTextField.setEditable(false);
        mainJPasswordField.setEditable(false);
        confirmJPasswordField.setEditable(false);

        mobileNumberJTextField.setText(null);
        simNumberJTextField.setText(null);
        mainJPasswordField.setText(null);
        confirmJPasswordField.setText(null);

        addJButton.setEnabled(false);
        objPerson = null;

        WorkRequest objWorkRequest = null;

        int selectedRequest = poorPeopleJTable.getSelectedRow();

        if (selectedRequest < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Person");
            return;
        }

        objWorkRequest = (WorkRequest) poorPeopleJTable.getValueAt(selectedRequest, 6);
        PPVerificationWorkRequest objPPVerificationWorkRequest = (PPVerificationWorkRequest) objWorkRequest;
        if (objWorkRequest != null) {
            if (objWorkRequest.getStatus().equals(WorkRequest.WorkRequestStatus.COMPLETED.getValue())) {
                if (objPPVerificationWorkRequest.getObjPerson().getPersonStatus().equals(Person.PersonRegStatusType.Active.getValue())) {
                    JOptionPane.showMessageDialog(null, "Person information are already updated and is Active");
                    return;
                }
                if (objPPVerificationWorkRequest.getObjPerson().getPersonStatus().equals(Person.PersonRegStatusType.Approved.getValue())) {

                    objPerson = objPPVerificationWorkRequest.getObjPerson();

                    personNameJTextField.setText(objPerson.getPersonFirstName() + " " + objPerson.getPersonLastName());

                    mobileNumberJTextField.setEditable(true);
                    mobileNumberJTextField.setText(objPerson.getPersonContactNumber());

                    simNumberJTextField.setEditable(true);
                    simNumberJTextField.setText(objPerson.getPersonSIMNumber());

                    mainJPasswordField.setEditable(true);
                    confirmJPasswordField.setEditable(true);

                    addJButton.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Person is not approved");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Work is still not completed");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select again");
        }
    }//GEN-LAST:event_assignNumberJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        //Validation
        boolean validationSuccess;
        validationSuccess = validation();

        if (validationSuccess) {

            UserAccount objUserAccount = UserNameExists.userNameCheck(objWorldEnterprise, contactNumber);

            if (objUserAccount != null) {

                JOptionPane.showMessageDialog(null, "Mobile numbers already exist. Please use unique phone number (UserName)");
            } else {

                if (mainPassword.equals(confirmPassword)) {
                    for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                        if (objOrganization instanceof PoorPeopleOrganization) {

                            if (objPerson != null) {

                                objPerson.setPersonContactNumber(contactNumber);
                                objPerson.setPersonSIMNumber(simNumber);
                                objPerson.setPersonStatus(Person.PersonRegStatusType.Active.getValue());

                                UserAccount objNewUserAccount = objOrganization.getObjUserAccountDirectory().createNewUserAccount(contactNumber, mainPassword, objPerson, new PoorPeopleRole(), UserAccount.StatusType.Acitve.getValue());
                                objNewUserAccount.setObjPerson(objPerson);

                                JOptionPane.showMessageDialog(null, "Person Information updated successfully. Now user can use the system.");

                                personNameJTextField.setText(null);
                                mobileNumberJTextField.setText(null);
                                simNumberJTextField.setText(null);
                                mainJPasswordField.setText(null);
                                confirmJPasswordField.setText(null);

                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password does not matches");
                }
            }

            populatePoorPeopleTable();
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void poorPeopleJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poorPeopleJTableMouseClicked

        //PPVerificationWorkRequest objPPVerificationWorkRequest = null;
        WorkRequest objWorkRequest = null;

        int selectedRequest = poorPeopleJTable.getSelectedRow();

        if (selectedRequest < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Person");
            return;
        } else {

            objWorkRequest = (WorkRequest) poorPeopleJTable.getValueAt(selectedRequest, 6);
            PPVerificationWorkRequest objPPVerificationWorkRequest = (PPVerificationWorkRequest) objWorkRequest;
            if (objWorkRequest != null) {
                if (objWorkRequest.getStatus().equals(WorkRequest.WorkRequestStatus.ASSIGNED.getValue())) {
                    ppJProgressBar.setValue(33);
                }
                if (objWorkRequest.getStatus().equals(WorkRequest.WorkRequestStatus.PROCESSING.getValue())) {
                    ppJProgressBar.setValue(67);
                }
                if (objWorkRequest.getStatus().equals(WorkRequest.WorkRequestStatus.COMPLETED.getValue())) {
                    ppJProgressBar.setValue(100);
                }
            }
        }
    }//GEN-LAST:event_poorPeopleJTableMouseClicked

    private boolean validation() {

        contactNumber = mobileNumberJTextField.getText();
        simNumber = simNumberJTextField.getText();
        mainPassword = String.valueOf(mainJPasswordField.getPassword());
        confirmPassword = String.valueOf(confirmJPasswordField.getPassword());

        if (Validation.checkForNull(contactNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter mobile number");
            mobileNumberJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumbers(contactNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter proper mobile number. It should only contain number");
            mobileNumberJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(simNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter SIM number");
            simNumberJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumbers(simNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter proper SIM number. It should only contain number");
            simNumberJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(mainPassword)) {
            JOptionPane.showMessageDialog(null, "Please enter password");
            mainJPasswordField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Please enter confirm password");
            confirmJPasswordField.requestFocus();
            return false;
        }

        return true;
    }

    //TO call the method to populate table when uses comes back to this screen
    @Override
    public void setVisible(boolean aFlag) {

        super.setVisible(aFlag);

        this.populatePoorPeopleTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton addNewPPJButton;
    private javax.swing.JButton assignNumberJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel conPassJLabel;
    private javax.swing.JPasswordField confirmJPasswordField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField mainJPasswordField;
    private javax.swing.JTextField mobileNumberJTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel passJLabel;
    private javax.swing.JTextField personNameJTextField;
    private javax.swing.JTable poorPeopleJTable;
    private javax.swing.JProgressBar ppJProgressBar;
    private javax.swing.JLabel simJLabel;
    private javax.swing.JTextField simNumberJTextField;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel userNameJLabel;
    // End of variables declaration//GEN-END:variables
}