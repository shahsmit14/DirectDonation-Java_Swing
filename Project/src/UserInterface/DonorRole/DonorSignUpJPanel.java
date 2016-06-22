/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonorRole;

import Business.Helper.CardLayoutContainer;
import Business.Helper.UserNameExists;
import Business.Helper.Validation;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.DonorRole;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import UserInterface.HomeScreenJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class DonorSignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorSignUpJPanel
     */
    private JPanel userProcessContainer;
    private WorldEnterprise objWorldEnterprise;
    private Person objPerson;
    private String firstName, lastName, dob, sex, add1, add2, country, state, city,
            pinCode, contactNumber, emailID, userName, mainPassword, confirmPassword;
    private int age;

    
    public DonorSignUpJPanel(JPanel userProcessContainerPassed, WorldEnterprise objWorldEnterprisePassed) {
        initComponents();
        this.userProcessContainer = userProcessContainerPassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;

        populateSexComboBox();
    }

    private void populateSexComboBox() {

        sexJComboBox.removeAllItems();

        for (Person.SexType sexType : Person.SexType.values()) {

            sexJComboBox.addItem(sexType);
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

        titleJLabel = new javax.swing.JLabel();
        firstNameJLabel = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        lastNameJLabel = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        sexJLabel = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        dataOfBirthJTextField = new javax.swing.JTextField();
        add1JLabel = new javax.swing.JLabel();
        address1JTextField = new javax.swing.JTextField();
        addJLabel = new javax.swing.JLabel();
        address2JTextField = new javax.swing.JTextField();
        cityJLabel = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        sexJComboBox = new javax.swing.JComboBox();
        stateJLabel = new javax.swing.JLabel();
        stateJTextField = new javax.swing.JTextField();
        countryJLabel = new javax.swing.JLabel();
        countryJTextField = new javax.swing.JTextField();
        pinJLabel = new javax.swing.JLabel();
        pinCodeJTextField = new javax.swing.JTextField();
        numberJLabel = new javax.swing.JLabel();
        contactNumberJTextField = new javax.swing.JTextField();
        emailJLabel = new javax.swing.JLabel();
        emailIdJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        mainJPasswordField = new javax.swing.JPasswordField();
        confirmJPasswordField = new javax.swing.JPasswordField();
        userNameJLabel = new javax.swing.JLabel();
        passJLabel = new javax.swing.JLabel();
        conPassJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        ppDobJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setText("Donor Sign Up Page");

        firstNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        firstNameJLabel.setText("First Name");

        firstNameJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        lastNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lastNameJLabel.setText("Last Name");

        lastNameJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        sexJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sexJLabel.setText("Sex");

        dobJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dobJLabel.setText("Date of Birth");

        dataOfBirthJTextField.setEditable(false);
        dataOfBirthJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        add1JLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add1JLabel.setText("Address 1");

        address1JTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        addJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addJLabel.setText("Address 2");

        address2JTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        cityJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cityJLabel.setText("City");

        cityJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        sexJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        stateJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        stateJLabel.setText("State");

        stateJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        countryJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        countryJLabel.setText("Country");

        countryJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        pinJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pinJLabel.setText("Pin Code");

        pinCodeJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        numberJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        numberJLabel.setText("Contact Number");

        contactNumberJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        emailJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        emailJLabel.setText("Email ID");

        emailIdJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        mainJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        confirmJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        userNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userNameJLabel.setText("User Name");

        passJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passJLabel.setText("Password");

        conPassJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        conPassJLabel.setText("Confirm Password");

        userNameJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        ppDobJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ppDobJButton.setText("Select");
        ppDobJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppDobJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(titleJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numberJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(contactNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pinJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pinCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stateJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cityJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(addJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(address2JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add1JLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(address1JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dobJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dataOfBirthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(firstNameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameJLabel)
                                    .addComponent(sexJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(countryJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailJLabel)
                                    .addComponent(userNameJLabel)
                                    .addComponent(passJLabel)
                                    .addComponent(conPassJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(submitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(confirmJPasswordField)
                                        .addComponent(userNameJTextField)
                                        .addComponent(emailIdJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(mainJPasswordField)))))
                        .addGap(18, 18, 18)
                        .addComponent(ppDobJButton)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleJLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameJLabel)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameJLabel)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexJLabel)
                    .addComponent(sexJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobJLabel)
                    .addComponent(dataOfBirthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppDobJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1JLabel)
                    .addComponent(address1JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJLabel)
                    .addComponent(address2JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJLabel)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateJLabel)
                    .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryJLabel)
                    .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinJLabel)
                    .addComponent(pinCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberJLabel)
                    .addComponent(contactNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailJLabel)
                    .addComponent(emailIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conPassJLabel))
                .addGap(18, 18, 18)
                .addComponent(submitJButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        //Validation
        boolean validationSuccess;
        validationSuccess = validation();

        if (validationSuccess) {

            DonorOrganization objDonorOrganization = null;

            for (Organization objOrganization : objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                if (objOrganization instanceof DonorOrganization) {

                    objDonorOrganization = (DonorOrganization) objOrganization;
                    break;
                }
            }

            if (objDonorOrganization != null) {

                objPerson = new Person(objDonorOrganization.getClass().getSimpleName());
                objPerson.setPersonFirstName(firstName);
                objPerson.setPersonLastName(lastName);
                objPerson.setPersonSex(sex);

                objPerson.setPersonDateOfBirth(dob);
                objPerson.setPersonAddress1(add1);
                objPerson.setPersonAddress2(add2);
                objPerson.setPersonCity(city);
                objPerson.setPersonState(state);
                objPerson.setPersonCountry(country);
                objPerson.setPersonPinCode(pinCode);
                objPerson.setPersonContactNumber(contactNumber);
                objPerson.setPersonEmailID(emailID);

                objDonorOrganization.getObjPersonDirectory().getPersonList().add(objPerson);

                UserAccount objUserAccount = UserNameExists.userNameCheck(objWorldEnterprise, userName);

                if (objUserAccount != null) {

                    JOptionPane.showMessageDialog(null, "User Name already exists. Please use some other username");
                } else {
                    if (mainPassword.equals(confirmPassword)) {

                        objDonorOrganization.getObjUserAccountDirectory().createNewUserAccount(userName, mainPassword, objPerson, new DonorRole(), UserAccount.StatusType.Acitve.getValue());

                        JOptionPane.showMessageDialog(null, "Your account has been created. Please login");

                        userProcessContainer.removeAll();

                        HomeScreenJPanel objHomeScreenJPanel = new HomeScreenJPanel();
                        CardLayoutContainer.addNewCardLayout(userProcessContainer, "HomeScreenJPanel", objHomeScreenJPanel);

                    } else {
                        JOptionPane.showMessageDialog(null, "Password does not matches");
                    }
                }
            }
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private boolean validation() {

        firstName = firstNameJTextField.getText().trim();
        lastName = lastNameJTextField.getText().trim();
        add1 = address1JTextField.getText().trim();
        add2 = address2JTextField.getText().trim();
        city = cityJTextField.getText().trim();
        state = stateJTextField.getText().trim();
        country = countryJTextField.getText().trim();
        pinCode = pinCodeJTextField.getText().trim();
        contactNumber = contactNumberJTextField.getText().trim();
        emailID = emailIdJTextField.getText().trim();
        userName = userNameJTextField.getText().trim();
        mainPassword = String.valueOf(mainJPasswordField.getPassword());
        confirmPassword = String.valueOf(confirmJPasswordField.getPassword());

        if (Validation.checkForNull(firstName)) {
            JOptionPane.showMessageDialog(null, "Please enter first name");
            firstNameJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyAlphabets(firstName)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper first name. It should contain only alphabets");
            firstNameJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(lastName)) {
            JOptionPane.showMessageDialog(null, "Please enter last name");
            lastNameJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyAlphabets(lastName)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper last name. It should contain only alphabets");
            lastNameJTextField.requestFocus();
            return false;
        }

        if (sexJComboBox.getSelectedItem() != null) {
            sex = sexJComboBox.getSelectedItem().toString();
        } else {
            JOptionPane.showMessageDialog(null, "Please select sex");
            sexJComboBox.requestFocus();
            return false;
        }

        if (Validation.checkForNull(dob)) {
            JOptionPane.showMessageDialog(null, "Please select date of birth");
            address1JTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(add1)) {
            JOptionPane.showMessageDialog(null, "Please enter Address 1");
            address1JTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumAlphabets(add1)) {
            JOptionPane.showMessageDialog(null, "Please enter proper Address 1. It should only contain alphabets and numbers");
            address1JTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(add2)) {
            JOptionPane.showMessageDialog(null, "Please enter Address 2");
            address2JTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumAlphabets(add2)) {
            JOptionPane.showMessageDialog(null, "Please enter proper Address 2. It should only contain alphabets and numbers");
            address2JTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(city)) {
            JOptionPane.showMessageDialog(null, "Please enter city");
            cityJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyAlphabets(city)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper city. It should contain only alphabets");
            cityJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(state)) {
            JOptionPane.showMessageDialog(null, "Please enter state");
            stateJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyAlphabets(state)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper state. It should contain only alphabets");
            stateJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(country)) {
            JOptionPane.showMessageDialog(null, "Please enter country");
            countryJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyAlphabets(country)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper country. It should contain only alphabets");
            countryJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(pinCode)) {
            JOptionPane.showMessageDialog(null, "Please enter pin code");
            pinCodeJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumbers(pinCode)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper pin code. It should contain only numbers");
            pinCodeJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(contactNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter contact number");
            contactNumberJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumbers(contactNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter a proper contact number. It should contain only numbers");
            contactNumberJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(emailID)) {
            JOptionPane.showMessageDialog(null, "Please enter email id");
            emailIdJTextField.requestFocus();
            return false;
        }

        //Apache Email Validator
        boolean isValid = org.apache.commons.validator.routines.EmailValidator.getInstance().isValid(emailID);
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter a proper email Id");
            emailIdJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter username");
            userNameJTextField.requestFocus();
            return false;
        }

        if (Validation.checkForOnlyNumAlphabets(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter proper username. It should contain only alphabets and numbers");
            userNameJTextField.requestFocus();
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


    private void ppDobJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppDobJButtonActionPerformed

        JFrame frame = new JFrame("Select Date");
        JPanel panel = new JPanel();

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 400, 250, 100);

        JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        picker.setFormats(objSimpleDateFormat);

        panel.add(picker);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        picker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Date selectedDate = picker.getDate();

                //create calendar object for birth day
                Calendar birthDay = Calendar.getInstance();
                birthDay.setTimeInMillis(selectedDate.getTime());

                //create calendar object for current day
                long currentTime = System.currentTimeMillis();
                Calendar now = Calendar.getInstance();
                now.setTimeInMillis(currentTime);

                //Get difference between years
                int years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
                int currMonth = now.get(Calendar.MONTH) + 1;
                int birthMonth = birthDay.get(Calendar.MONTH) + 1;
                //Get difference between months
                int months = currMonth - birthMonth;
                //if month difference is in negative then reduce years by one and calculate the number of months.
                if (months < 0) {
                    years--;
                    months = 12 - birthMonth + currMonth;
                    if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE)) {
                        months--;
                    }
                } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE)) {
                    years--;
                    months = 11;
                }

                System.out.println("Age == " + years);

                if (years < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter valid date of birth");
                } else if (years < 18) {
                    JOptionPane.showMessageDialog(null, "Person with age 18 or more can only be registered");
                } else {

                    dob = objSimpleDateFormat.format(picker.getDate());
                    age = years;
                    dataOfBirthJTextField.setText(dob);
                }
            }
        });

    }//GEN-LAST:event_ppDobJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1JLabel;
    private javax.swing.JLabel addJLabel;
    private javax.swing.JTextField address1JTextField;
    private javax.swing.JTextField address2JTextField;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JLabel conPassJLabel;
    private javax.swing.JPasswordField confirmJPasswordField;
    private javax.swing.JTextField contactNumberJTextField;
    private javax.swing.JLabel countryJLabel;
    private javax.swing.JTextField countryJTextField;
    private javax.swing.JTextField dataOfBirthJTextField;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JPasswordField mainJPasswordField;
    private javax.swing.JLabel numberJLabel;
    private javax.swing.JLabel passJLabel;
    private javax.swing.JTextField pinCodeJTextField;
    private javax.swing.JLabel pinJLabel;
    private javax.swing.JButton ppDobJButton;
    private javax.swing.JComboBox sexJComboBox;
    private javax.swing.JLabel sexJLabel;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}