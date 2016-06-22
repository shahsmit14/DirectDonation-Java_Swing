/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FinanceRole;

import Business.CountryEnterprise.RegSiteEnterprise.RegisteredSiteEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.Organization.RegisteredSiteAdminOrganization;
import Business.Organization.WorldAdminOrganization;
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
public class OverallTransactionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OverallTransactionJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount objUserAccount;
    private WorldEnterprise objWorldEnterprise;
    private RegisteredSiteEnterprise objRegisteredSiteEnterprise;
    private Organization objOrganization;

    public OverallTransactionJPanel(JPanel userProcessContainerPassed, UserAccount objUserAccountPassed,
            WorldEnterprise objWorldEnterprisePassed, RegisteredSiteEnterprise objRegisteredSiteEnterprisePassed, Organization objOrganizationPassed) {
        initComponents();

        this.userProcessContainer = userProcessContainerPassed;
        this.objUserAccount = objUserAccountPassed;
        this.objWorldEnterprise = objWorldEnterprisePassed;
        this.objOrganization = objOrganizationPassed;
        this.objRegisteredSiteEnterprise = objRegisteredSiteEnterprisePassed;

        populateTransactionTable();
        generateOverviewAnalysis();
    }

    private void populateTransactionTable() {

        DefaultTableModel dtm = (DefaultTableModel) transactionJTable.getModel();
        dtm.setRowCount(0);

        if ((objOrganization instanceof WorldAdminOrganization) || (objOrganization instanceof FinanceOrganization)) {

            objWorldEnterprise.getObjTransactionDirectory().updateTransactionAccount();
            virBalJTextField.setText("$ " + objWorldEnterprise.getObjTransactionDirectory().getAvailableVirtualBalance().toString());
            virSpentJTextField1.setText("$ " + objWorldEnterprise.getObjTransactionDirectory().getTotalVirtualDebitAmount().toString());
            realBalJTextField.setText("$ " + objWorldEnterprise.getObjTransactionDirectory().getAvailableRealBalance().toString());
            realSpentJTextField.setText("$ " + objWorldEnterprise.getObjTransactionDirectory().getTotalRealDebitAmount().toString());

            for (Transaction objTransaction : objWorldEnterprise.getObjTransactionDirectory().getTransactionList()) {

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

        if (objOrganization instanceof RegisteredSiteAdminOrganization) {

            objRegisteredSiteEnterprise.getObjTransactionDirectory().updateTransactionAccount();
            virBalJTextField.setText("$ " + objRegisteredSiteEnterprise.getObjTransactionDirectory().getAvailableVirtualBalance().toString());
            virSpentJTextField1.setText("$ " + objRegisteredSiteEnterprise.getObjTransactionDirectory().getTotalVirtualDebitAmount().toString());
            realBalJTextField.setText("$ " + objRegisteredSiteEnterprise.getObjTransactionDirectory().getAvailableRealBalance().toString());
            realSpentJTextField.setText("$ " + objRegisteredSiteEnterprise.getObjTransactionDirectory().getTotalRealDebitAmount().toString());

            for (Transaction objTransaction : objRegisteredSiteEnterprise.getObjTransactionDirectory().getTransactionList()) {

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
    }

    private void generateOverviewAnalysis() {

        if ((objOrganization instanceof WorldAdminOrganization) || (objOrganization instanceof FinanceOrganization)) {

            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

            objWorldEnterprise.getObjTransactionDirectory().updateTransactionAccount();

            BigDecimal virtualBalance = objWorldEnterprise.getObjTransactionDirectory().getAvailableVirtualBalance();
            BigDecimal virtualAmoutSpent = objWorldEnterprise.getObjTransactionDirectory().getTotalVirtualDebitAmount();
            BigDecimal realBalance = objWorldEnterprise.getObjTransactionDirectory().getAvailableRealBalance();
            BigDecimal realAmountSpent = objWorldEnterprise.getObjTransactionDirectory().getTotalRealDebitAmount();

            dataSet.setValue(virtualBalance, "Amount", "Virtual Balance");
            dataSet.setValue(virtualAmoutSpent, "Amount", "Virtual Amount Donated");
            dataSet.setValue(realBalance, "Amount", "Real Balance");
            dataSet.setValue(realAmountSpent, "Amount", "Real Amount Donated");

            JFreeChart chart = ChartFactory.createBarChart3D("Overview of entire Transaction", "Donation type", "Amount in USD $",
                    dataSet, PlotOrientation.VERTICAL, false, true, false);

            CategoryPlot plot = chart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.black);

            ChartPanel myChart = new ChartPanel(chart);
            overviewJPanel.setLayout(new java.awt.BorderLayout());
            overviewJPanel.add(myChart, BorderLayout.CENTER);
            overviewJPanel.validate();
        }

        if (objOrganization instanceof RegisteredSiteAdminOrganization) {

            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

            objRegisteredSiteEnterprise.getObjTransactionDirectory().updateTransactionAccount();

            BigDecimal virtualBalance = objRegisteredSiteEnterprise.getObjTransactionDirectory().getAvailableVirtualBalance();
            BigDecimal virtualAmoutSpent = objRegisteredSiteEnterprise.getObjTransactionDirectory().getTotalVirtualDebitAmount();
            BigDecimal realBalance = objRegisteredSiteEnterprise.getObjTransactionDirectory().getAvailableRealBalance();
            BigDecimal realAmountSpent = objRegisteredSiteEnterprise.getObjTransactionDirectory().getTotalRealDebitAmount();

            dataSet.setValue(virtualBalance, "Amount", "Virtual Balance");
            dataSet.setValue(virtualAmoutSpent, "Amount", "Virtual Amount Donated");
            dataSet.setValue(realBalance, "Amount", "Real Balance");
            dataSet.setValue(realAmountSpent, "Amount", "Real Amount Donated");

            JFreeChart chart = ChartFactory.createBarChart3D("Overview of entire Transaction", "Donation type", "Amount in USD $",
                    dataSet, PlotOrientation.VERTICAL, false, true, false);

            CategoryPlot plot = chart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.black);

            ChartPanel myChart = new ChartPanel(chart);
            overviewJPanel.setLayout(new java.awt.BorderLayout());
            overviewJPanel.add(myChart, BorderLayout.CENTER);
            overviewJPanel.validate();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        transactionJTable = new javax.swing.JTable();
        titleJLabel = new javax.swing.JLabel();
        backJButton4 = new javax.swing.JButton();
        vAmtAvJLabel = new javax.swing.JLabel();
        virBalJTextField = new javax.swing.JTextField();
        vAmtSpJLabel = new javax.swing.JLabel();
        virSpentJTextField1 = new javax.swing.JTextField();
        rAmtAvJLabel = new javax.swing.JLabel();
        realBalJTextField = new javax.swing.JTextField();
        rAmtSpJLabel = new javax.swing.JLabel();
        realSpentJTextField = new javax.swing.JTextField();
        overviewJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

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
        if (transactionJTable.getColumnModel().getColumnCount() > 0) {
            transactionJTable.getColumnModel().getColumn(0).setResizable(false);
            transactionJTable.getColumnModel().getColumn(1).setResizable(false);
            transactionJTable.getColumnModel().getColumn(2).setResizable(false);
            transactionJTable.getColumnModel().getColumn(3).setResizable(false);
            transactionJTable.getColumnModel().getColumn(4).setResizable(false);
            transactionJTable.getColumnModel().getColumn(5).setResizable(false);
            transactionJTable.getColumnModel().getColumn(6).setResizable(false);
            transactionJTable.getColumnModel().getColumn(7).setResizable(false);
            transactionJTable.getColumnModel().getColumn(8).setResizable(false);
        }

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setText("Transaction History");

        backJButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton4.setText("<< Back");
        backJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton4ActionPerformed(evt);
            }
        });

        vAmtAvJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vAmtAvJLabel.setText("Virtual Amount Available:");

        virBalJTextField.setEditable(false);
        virBalJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        vAmtSpJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vAmtSpJLabel.setText("Virtual Amount Spent:");

        virSpentJTextField1.setEditable(false);
        virSpentJTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        rAmtAvJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rAmtAvJLabel.setText("Real Amount Available:");

        realBalJTextField.setEditable(false);
        realBalJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        rAmtSpJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rAmtSpJLabel.setText("Real Amount Spent:");

        realSpentJTextField.setEditable(false);
        realSpentJTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout overviewJPanelLayout = new javax.swing.GroupLayout(overviewJPanel);
        overviewJPanel.setLayout(overviewJPanelLayout);
        overviewJPanelLayout.setHorizontalGroup(
            overviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        overviewJPanelLayout.setVerticalGroup(
            overviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vAmtAvJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vAmtSpJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(virSpentJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(virBalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(rAmtAvJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34)
                                            .addComponent(realBalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(rAmtSpJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(realSpentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(overviewJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backJButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(titleJLabel)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vAmtAvJLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(virBalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rAmtAvJLabel)
                            .addComponent(realBalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(virSpentJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vAmtSpJLabel)
                            .addComponent(realSpentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rAmtSpJLabel))))
                .addGap(18, 18, 18)
                .addComponent(overviewJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(backJButton4)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton4ActionPerformed

        CardLayoutContainer.removeCurrentCardLayout(userProcessContainer, this);
    }//GEN-LAST:event_backJButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel overviewJPanel;
    private javax.swing.JLabel rAmtAvJLabel;
    private javax.swing.JLabel rAmtSpJLabel;
    private javax.swing.JTextField realBalJTextField;
    private javax.swing.JTextField realSpentJTextField;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JTable transactionJTable;
    private javax.swing.JLabel vAmtAvJLabel;
    private javax.swing.JLabel vAmtSpJLabel;
    private javax.swing.JTextField virBalJTextField;
    private javax.swing.JTextField virSpentJTextField1;
    // End of variables declaration//GEN-END:variables
}
