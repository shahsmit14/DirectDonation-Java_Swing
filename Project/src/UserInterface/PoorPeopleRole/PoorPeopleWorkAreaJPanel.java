/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PoorPeopleRole;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Helper.Validation;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Transaction.Transaction;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import UserInterface.ChangePasswordJPanel;
import java.awt.BorderLayout;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class PoorPeopleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoorPeopleWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount objUserAccount;
    private WorldEnterprise objWorldEnterprise;
    private CountryEnterprise objCountryEnterprise;
    private Organization objOrganization;
    private Person objPerson;
    String mainPin, confirmPin;

    public PoorPeopleWorkAreaJPanel(JPanel userProcessContainerPassed, UserAccount objUserAccountPassed,
            WorldEnterprise objWorldEnterprisePassed, CountryEnterprise objCountryEnterprisePassed, Organization objOrganizationPassed) {
        initComponents();
        this.userProcessContainer = userProcessContainerPassed;
        this.objUserAccount = objUserAccountPassed;
        this.objCountryEnterprise = objCountryEnterprisePassed;
        this.objOrganization = objOrganizationPassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;
        this.objPerson = objUserAccount.getObjPerson();

        mainJPasswordField.setEnabled(false);
        confirmJPasswordField.setEnabled(false);
        updatePinJButton.setEnabled(false);

        populateTransactionTable();
        populateBalance();

        System.out.println(objUserAccount.getObjPerson().getPersonPINNumber());
        System.out.println(objUserAccount.getObjPerson().getPersonFirstName());

        generateCreditAnalysis();
        loadForm();
    }

    private void loadForm() {

        nameDisplayJLabel.setText(objUserAccount.getObjPerson().toString());
        roleDisplayJLabel.setText(objUserAccount.getObjRole().toString());
    }

    private void populateTransactionTable() {

        DefaultTableModel dtm = (DefaultTableModel) transactionJTable.getModel();
        dtm.setRowCount(0);

        for (Transaction objTransaction : objUserAccount.getObjPerson().getObjPoorPeopleTransactionDirectory().getTransactionList()) {

            Object row[] = new Object[9];
            row[0] = objTransaction;
            row[1] = objTransaction.getTransactionSource();
            row[2] = (objTransaction.getObjUserAccountSource() == null) ? ("N/A") : (objTransaction.getObjUserAccountSource().getObjPerson());
            row[3] = objTransaction.getTransactionDestination();
            row[4] = (objTransaction.getObjUserAccountDestination() == null) ? ("N/A") : (objTransaction.getObjUserAccountDestination().getObjPerson());
            row[5] = objTransaction.getTransactionType();
            row[6] = objTransaction.getTransactionMode();
            row[7] = "$ " + String.valueOf(objTransaction.getTransactionBDAmount());
            row[8] = objTransaction.getTransactionDateToDisplay();

            dtm.addRow(row);
        }
    }

    private void populateBalance() {

        objUserAccount.getObjPerson().getObjPoorPeopleTransactionDirectory().updateTransactionAccount();
        BigDecimal balance = objUserAccount.getObjPerson().getObjPoorPeopleTransactionDirectory().getAvailableVirtualBalance();
        balanceJTextField.setText("$ " + String.valueOf(balance));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionJTable = new javax.swing.JTable();
        balanceJLabel = new javax.swing.JLabel();
        balanceJTextField = new javax.swing.JTextField();
        transferMoneyPPJButton = new javax.swing.JButton();
        changPinJButton = new javax.swing.JButton();
        newPinJLabel = new javax.swing.JLabel();
        mainJPasswordField = new javax.swing.JPasswordField();
        conPinJLabel = new javax.swing.JLabel();
        confirmJPasswordField = new javax.swing.JPasswordField();
        updatePinJButton = new javax.swing.JButton();
        transferMoneyRSJButton = new javax.swing.JButton();
        transactionJPanel = new javax.swing.JPanel();
        moneyReceivedJButton = new javax.swing.JButton();
        maoneyTransferedJButton = new javax.swing.JButton();
        nameJLabel = new javax.swing.JLabel();
        nameDisplayJLabel = new javax.swing.JLabel();
        roleJLabel = new javax.swing.JLabel();
        roleDisplayJLabel = new javax.swing.JLabel();
        changePasswordJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setText("Transaction History");

        transactionJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transactionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Source", "Source User Account", "Destination User Account", "Destination", "Type", "Mode", "Amount", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transactionJTable);

        balanceJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        balanceJLabel.setText("Balance:");

        balanceJTextField.setEditable(false);
        balanceJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        transferMoneyPPJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        transferMoneyPPJButton.setText("Transfer Money to Person >>");
        transferMoneyPPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyPPJButtonActionPerformed(evt);
            }
        });

        changPinJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        changPinJButton.setText("Update PIN");
        changPinJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changPinJButtonActionPerformed(evt);
            }
        });

        newPinJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        newPinJLabel.setText("New PIN");

        mainJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mainJPasswordField.setEnabled(false);

        conPinJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        conPinJLabel.setText("Confirm PIN");

        confirmJPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        confirmJPasswordField.setEnabled(false);

        updatePinJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updatePinJButton.setText("Update");
        updatePinJButton.setEnabled(false);
        updatePinJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePinJButtonActionPerformed(evt);
            }
        });

        transferMoneyRSJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        transferMoneyRSJButton.setText("Purchase goods from Registered Site >>");
        transferMoneyRSJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyRSJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transactionJPanelLayout = new javax.swing.GroupLayout(transactionJPanel);
        transactionJPanel.setLayout(transactionJPanelLayout);
        transactionJPanelLayout.setHorizontalGroup(
            transactionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        transactionJPanelLayout.setVerticalGroup(
            transactionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        moneyReceivedJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        moneyReceivedJButton.setText("Money Received");
        moneyReceivedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyReceivedJButtonActionPerformed(evt);
            }
        });

        maoneyTransferedJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        maoneyTransferedJButton.setText("Money Transfered");
        maoneyTransferedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maoneyTransferedJButtonActionPerformed(evt);
            }
        });

        nameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nameJLabel.setText("Welcome:");

        nameDisplayJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        roleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        roleJLabel.setText("Role:");

        roleDisplayJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roleDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(titleJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changePasswordJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moneyReceivedJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maoneyTransferedJButton))
                            .addComponent(transactionJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newPinJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conPinJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mainJPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmJPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(changPinJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updatePinJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(balanceJLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(balanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(transferMoneyRSJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(transferMoneyPPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJLabel)
                            .addComponent(nameDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roleJLabel)
                            .addComponent(roleDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(changePasswordJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleJLabel)
                        .addGap(2, 2, 2)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(transferMoneyPPJButton)
                        .addGap(26, 26, 26)
                        .addComponent(transferMoneyRSJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changPinJButton)
                            .addComponent(balanceJLabel)
                            .addComponent(balanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPinJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conPinJLabel))
                        .addGap(18, 18, 18)
                        .addComponent(updatePinJButton)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyReceivedJButton)
                    .addComponent(maoneyTransferedJButton))
                .addGap(18, 18, 18)
                .addComponent(transactionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changPinJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changPinJButtonActionPerformed

        mainJPasswordField.setEnabled(true);
        confirmJPasswordField.setEnabled(true);
        updatePinJButton.setEnabled(true);

    }//GEN-LAST:event_changPinJButtonActionPerformed

    private void updatePinJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePinJButtonActionPerformed

        //Validation
        boolean validationSuccess;
        validationSuccess = validation();

        if (validationSuccess) {

            objUserAccount.getObjPerson().setPersonPINNumber(mainPin);

            JOptionPane.showMessageDialog(null, "PIN updated successfully");

            mainJPasswordField.setText(null);
            confirmJPasswordField.setText(null);
            mainJPasswordField.setEnabled(false);
            confirmJPasswordField.setEnabled(false);
            updatePinJButton.setEnabled(false);

        }
    }//GEN-LAST:event_updatePinJButtonActionPerformed

    private boolean validation() {

        mainPin = String.valueOf(mainJPasswordField.getPassword());
        confirmPin = String.valueOf(confirmJPasswordField.getPassword());

        if (Validation.checkForNull(mainPin)) {
            JOptionPane.showMessageDialog(null, "Please enter PIN");
            mainJPasswordField.requestFocus();
            return false;
        }

        if (Validation.checkForNull(confirmPin)) {
            JOptionPane.showMessageDialog(null, "Please enter confirm PIN");
            confirmJPasswordField.requestFocus();
            return false;
        }

        if (!mainPin.equals(confirmPin)) {
            JOptionPane.showMessageDialog(null, "PIN does not match");
            mainJPasswordField.requestFocus();
            return false;
        }

        return true;
    }


    private void transferMoneyPPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyPPJButtonActionPerformed

        String pin = objPerson.getPersonPINNumber();

        if (pin == null || pin.equals("")) {
            JOptionPane.showMessageDialog(null, "Please update your PIN. It is one time activity");
        } else {

            MoneyTransferJPanel objMoneyTransferJPanel = new MoneyTransferJPanel(userProcessContainer, objUserAccount, objWorldEnterprise, objCountryEnterprise, Transaction.TransactionSourceType.ToPoorPeople.getValue());

            CardLayoutContainer.addNewCardLayout(userProcessContainer, "MoneyTransferJPanel", objMoneyTransferJPanel);
        }
    }//GEN-LAST:event_transferMoneyPPJButtonActionPerformed

    private void transferMoneyRSJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyRSJButtonActionPerformed

        String pin = objPerson.getPersonPINNumber();

        if (pin == null || pin.equals("")) {

            JOptionPane.showMessageDialog(null, "Please update your PIN. It is one time activity");
        } else {

            MoneyTransferJPanel objMoneyTransferJPanel = new MoneyTransferJPanel(userProcessContainer, objUserAccount, objWorldEnterprise, objCountryEnterprise, Transaction.TransactionSourceType.ToRegSiteEnterprise.getValue());

            CardLayoutContainer.addNewCardLayout(userProcessContainer, "MoneyTransferJPanel", objMoneyTransferJPanel);
        }
    }//GEN-LAST:event_transferMoneyRSJButtonActionPerformed

    private void moneyReceivedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyReceivedJButtonActionPerformed

        generateCreditAnalysis();
    }//GEN-LAST:event_moneyReceivedJButtonActionPerformed

    private void generateCreditAnalysis() {

        DefaultCategoryDataset lineChartDataset = new DefaultCategoryDataset();

        for (Transaction objTransaction : objPerson.getObjPoorPeopleTransactionDirectory().getTransactionList()) {

            if (objTransaction.getTransactionType().equals(Transaction.TransactionType.Credit.getValue())) {
                BigDecimal amount = objTransaction.getTransactionBDAmount();
                String date = objTransaction.getTransactionDateToDisplay();

                lineChartDataset.addValue(amount, "Donation Amount", date);
            }
        }

        JFreeChart lineChartObject = ChartFactory.createLineChart3D("Money Received", "Date", "Amount in USD $", lineChartDataset, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel myChart = new ChartPanel(lineChartObject);
        transactionJPanel.setLayout(new java.awt.BorderLayout());
        transactionJPanel.add(myChart, BorderLayout.CENTER);
        transactionJPanel.validate();
    }

    private void maoneyTransferedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maoneyTransferedJButtonActionPerformed

        generateDebitAnalysis();
    }//GEN-LAST:event_maoneyTransferedJButtonActionPerformed

    private void changePasswordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordJButtonActionPerformed

        ChangePasswordJPanel objChangePasswordJPanel = new ChangePasswordJPanel(userProcessContainer, objUserAccount);

        CardLayoutContainer.addNewCardLayout(userProcessContainer, "ChangePasswordJPanel", objChangePasswordJPanel);
    }//GEN-LAST:event_changePasswordJButtonActionPerformed

    private void generateDebitAnalysis() {

        DefaultCategoryDataset lineChartDataset = new DefaultCategoryDataset();

        for (Transaction objTransaction : objPerson.getObjPoorPeopleTransactionDirectory().getTransactionList()) {

            if (objTransaction.getTransactionType().equals(Transaction.TransactionType.Debit.getValue())) {
                BigDecimal amount = objTransaction.getTransactionBDAmount();
                String date = objTransaction.getTransactionDateToDisplay();

                lineChartDataset.addValue(amount, "Transfer Amount", date);
            }
        }

        JFreeChart lineChartObject = ChartFactory.createLineChart3D("Money Transfered", "Date", "Amount in USD $", lineChartDataset, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel myChart = new ChartPanel(lineChartObject);
        transactionJPanel.setLayout(new java.awt.BorderLayout());
        transactionJPanel.add(myChart, BorderLayout.CENTER);
        transactionJPanel.validate();
    }

    //TO call the method to populate table when uses comes back to this screen
    @Override
    public void setVisible(boolean aFlag) {

        super.setVisible(aFlag);

        this.populateTransactionTable();
        this.populateBalance();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceJLabel;
    private javax.swing.JTextField balanceJTextField;
    private javax.swing.JButton changPinJButton;
    private javax.swing.JButton changePasswordJButton;
    private javax.swing.JLabel conPinJLabel;
    private javax.swing.JPasswordField confirmJPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField mainJPasswordField;
    private javax.swing.JButton maoneyTransferedJButton;
    private javax.swing.JButton moneyReceivedJButton;
    private javax.swing.JLabel nameDisplayJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel newPinJLabel;
    private javax.swing.JLabel roleDisplayJLabel;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel transactionJPanel;
    private javax.swing.JTable transactionJTable;
    private javax.swing.JButton transferMoneyPPJButton;
    private javax.swing.JButton transferMoneyRSJButton;
    private javax.swing.JButton updatePinJButton;
    // End of variables declaration//GEN-END:variables
}
