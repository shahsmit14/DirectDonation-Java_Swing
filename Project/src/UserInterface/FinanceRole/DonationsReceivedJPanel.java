/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FinanceRole;

import Business.Helper.CardLayoutContainer;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Transaction.Transaction;
import Business.UserAccount.UserAccount;
import Business.WorldEnterprise;
import java.awt.BorderLayout;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class DonationsReceivedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationsReceivedJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount objUserAccount;
    private WorldEnterprise objWorldEnterprise;
    private Organization objOrganization;

    public DonationsReceivedJPanel(JPanel userProcessContainerPassed, UserAccount objUserAccountPassed,
            WorldEnterprise objWorldEnterprisePassed, Organization objOrganizationPassed) {
        initComponents();

        this.userProcessContainer = userProcessContainerPassed;
        this.objUserAccount = objUserAccountPassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;
        this.objOrganization = objOrganizationPassed;

        objWorldEnterprise.getObjTransactionDirectory().updateTransactionAccount();
        this.totalDonationJTextField.setText("$ " +objWorldEnterprise.getObjTransactionDirectory().getTotalDonationReceived().toString());
        populateDonationTable();
        generateDonationAnalysis();
    }

    private void populateDonationTable() {

        DefaultTableModel dtm = (DefaultTableModel) donationsJTable.getModel();
        dtm.setRowCount(0);
        for (Transaction objTransaction : objWorldEnterprise.getObjTransactionDirectory().getTransactionList()) {

            if (objTransaction.getTransactionSource().equals(Transaction.TransactionSourceType.FromDonor.getValue())) {

                if (objTransaction.getTransactionMode().equals(Transaction.TransactionModeType.Real.getValue())) {
                    Object row[] = new Object[5];
                    row[0] = objTransaction;
                    row[1] = objTransaction.getObjUserAccountSource().getObjPerson();
                    row[2] = objTransaction.getObjUserAccountSource();
                    row[3] = "$ " + String.valueOf(objTransaction.getTransactionBDAmount());
                    row[4] = objTransaction.getTransactionDateToDisplay();

                    dtm.addRow(row);
                }
            }
        }
    }

    private void generateDonationAnalysis() {

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (Organization objDonorOrganization : objWorldEnterprise.getObjOrganizationDirectory().getOrganizationList()) {
            if (objDonorOrganization instanceof DonorOrganization) {
                for (Person objPerson : objDonorOrganization.getObjPersonDirectory().getPersonList()) {
                    BigDecimal totalAmount = new BigDecimal(0);
                    for (Transaction objTransaction : objPerson.getObjDonorTransactionDirectory().getTransactionList()) {
                        totalAmount = totalAmount.add(objTransaction.getTransactionBDAmount());
                    }                    
                    dataSet.setValue(totalAmount, "Donation", objPerson.getPersonFirstName());
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart3D("Overview of entire donation", "Donor Name", "Total donation in USD $",
                dataSet, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);

        ChartPanel myChart = new ChartPanel(chart);
        donationJPanel.setLayout(new java.awt.BorderLayout());
        donationJPanel.add(myChart, BorderLayout.CENTER);
        donationJPanel.validate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        donationsJTable = new javax.swing.JTable();
        backJButton4 = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        totalDonationJTextField = new javax.swing.JTextField();
        title2JLabel = new javax.swing.JLabel();
        donationJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        donationsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Donor Name", "Donor UserName", "Donation Amount", "Transaction Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationsJTable);
        if (donationsJTable.getColumnModel().getColumnCount() > 0) {
            donationsJTable.getColumnModel().getColumn(0).setResizable(false);
            donationsJTable.getColumnModel().getColumn(1).setResizable(false);
            donationsJTable.getColumnModel().getColumn(2).setResizable(false);
            donationsJTable.getColumnModel().getColumn(3).setResizable(false);
            donationsJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        backJButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton4.setText("<< Back");
        backJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton4ActionPerformed(evt);
            }
        });

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setText("Donation Details");

        totalDonationJTextField.setEditable(false);
        totalDonationJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        title2JLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        title2JLabel.setText("Total Donations Received:");

        javax.swing.GroupLayout donationJPanelLayout = new javax.swing.GroupLayout(donationJPanel);
        donationJPanel.setLayout(donationJPanelLayout);
        donationJPanelLayout.setHorizontalGroup(
            donationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        donationJPanelLayout.setVerticalGroup(
            donationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(titleJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(title2JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(totalDonationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(donationJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(9, 9, 9))))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleJLabel)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title2JLabel)
                    .addComponent(totalDonationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(donationJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton4)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton4ActionPerformed

        CardLayoutContainer.removeCurrentCardLayout(userProcessContainer, this);
    }//GEN-LAST:event_backJButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton4;
    private javax.swing.JPanel donationJPanel;
    private javax.swing.JTable donationsJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title2JLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JTextField totalDonationJTextField;
    // End of variables declaration//GEN-END:variables
}
