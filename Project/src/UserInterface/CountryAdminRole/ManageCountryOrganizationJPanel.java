/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CountryAdminRole;

import Business.CountryEnterprise.CountryEnterprise;
import Business.Helper.CardLayoutContainer;
import Business.Organization.Organization;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class ManageCountryOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCountryOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private CountryEnterprise objCountryEnterprise;

    public ManageCountryOrganizationJPanel(JPanel userProcessContainerPassed,
            CountryEnterprise objCountryEnterprisePassed) {

        initComponents();
        this.userProcessContainer = userProcessContainerPassed;
        this.objCountryEnterprise = objCountryEnterprisePassed;

        populateCountryOrgTable();
        populateCountryOrgComboBox();
    }

    private void populateCountryOrgTable() {

        DefaultTableModel dtm = (DefaultTableModel) countryOrgJTable.getModel();
        dtm.setRowCount(0);

        for (Organization objOrganization : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

            Object row[] = new Object[2];
            row[0] = objOrganization.getOrganizationID();
            row[1] = objOrganization;

            dtm.addRow(row);
        }
    }

    private void populateCountryOrgComboBox() {

        countryOrgJComboBox.removeAllItems();

        for (Organization.OrganizationType orgType : Organization.OrganizationType.values()) {

            if (orgType.getValue().equals(Organization.OrganizationType.FieldAgent.getValue())
                    || orgType.getValue().equals(Organization.OrganizationType.FieldExpert.getValue())) {

                countryOrgJComboBox.addItem(orgType);
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

        titleJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        countryOrgJTable = new javax.swing.JTable();
        title1JLabel = new javax.swing.JLabel();
        orgJLabel = new javax.swing.JLabel();
        countryOrgJComboBox = new javax.swing.JComboBox();
        addCountryOrgJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Manage Organization");

        countryOrgJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        countryOrgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization ID", "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(countryOrgJTable);
        if (countryOrgJTable.getColumnModel().getColumnCount() > 0) {
            countryOrgJTable.getColumnModel().getColumn(0).setResizable(false);
            countryOrgJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        title1JLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        title1JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1JLabel.setText("Add Organization");

        orgJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        orgJLabel.setText("Organization Type:");

        countryOrgJComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        countryOrgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryOrgJComboBoxActionPerformed(evt);
            }
        });

        addCountryOrgJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addCountryOrgJButton.setText("Add Organization");
        addCountryOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCountryOrgJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backJButton)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(245, 245, 245)
                            .addComponent(title1JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(orgJLabel)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addCountryOrgJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(countryOrgJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(title1JLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryOrgJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgJLabel))
                .addGap(18, 18, 18)
                .addComponent(addCountryOrgJButton)
                .addGap(68, 68, 68)
                .addComponent(backJButton)
                .addGap(155, 155, 155))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void countryOrgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryOrgJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryOrgJComboBoxActionPerformed

    private void addCountryOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCountryOrgJButtonActionPerformed

        boolean isOrgPresent = false;

        if (countryOrgJComboBox.getItemCount() != 0) {

            Organization.OrganizationType orgTypeSelected = (Organization.OrganizationType) countryOrgJComboBox.getSelectedItem();

            for (Organization objOrgPresent : objCountryEnterprise.getObjOrganizationDirectory().getOrganizationList()) {

                if (objOrgPresent.getClass().getSimpleName().equals(orgTypeSelected.getValue())) {

                    JOptionPane.showMessageDialog(null, "Organization already exists");
                    isOrgPresent = true;
                    return;
                }
            }

            if (!isOrgPresent) {

                objCountryEnterprise.getObjOrganizationDirectory().addOrganization(orgTypeSelected);
                JOptionPane.showMessageDialog(null, "Organization added successfully");
                populateCountryOrgTable();
            }
        }
    }//GEN-LAST:event_addCountryOrgJButtonActionPerformed


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        CardLayoutContainer.removeCurrentCardLayout(userProcessContainer, this);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCountryOrgJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox countryOrgJComboBox;
    private javax.swing.JTable countryOrgJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgJLabel;
    private javax.swing.JLabel title1JLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
