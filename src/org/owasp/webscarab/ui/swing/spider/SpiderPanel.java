/*
 * SpiderPanel.java
 *
 * Created on August 6, 2003, 10:01 PM
 */

package org.owasp.webscarab.ui.swing.spider;

import org.owasp.webscarab.ui.swing.SwingPlugin;
import org.owasp.webscarab.plugin.spider.Spider;

/**
 *
 * @author  rdawes
 */
public class SpiderPanel extends javax.swing.JPanel implements SwingPlugin {

    private Spider _spider;
    
    /** Creates new form SpiderPanel */
    public SpiderPanel(Spider spider) {
        _spider = spider;
        initComponents();
        unseenLinkTable.setModel(_spider.getUnseenLinkTableModel());
        configure();
    }
    
    public javax.swing.JPanel getPanel() {
        return this;
    }
    
    public String getPluginName() {
        return new String("Spider");
    }    
    
    private void configure() {
        recursiveCheckBox.setSelected(_spider.getRecursive());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        unseenLinkTable = new javax.swing.JTable();
        fetchButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        domainRegexTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pathRegexTextField = new javax.swing.JTextField();
        recursiveCheckBox = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        unseenLinkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(unseenLinkTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);

        fetchButton.setText("Fetch");
        fetchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(fetchButton, gridBagConstraints);

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(stopButton, gridBagConstraints);

        jLabel1.setText("Include Domains");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(jLabel1, gridBagConstraints);

        domainRegexTextField.setToolTipText("A regular expression describing which domains to include");
        domainRegexTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domainRegexTextFieldActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(domainRegexTextField, gridBagConstraints);

        jLabel2.setText("Exclude Paths");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        add(jLabel2, gridBagConstraints);

        pathRegexTextField.setToolTipText("A regular expression describing which paths to exclude");
        pathRegexTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathRegexTextFieldActionPerformed(evt);
            }
        });
        pathRegexTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pathRegexTextFieldFocusLost(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(pathRegexTextField, gridBagConstraints);

        recursiveCheckBox.setText("Recursive");
        recursiveCheckBox.setToolTipText("Enables recursive fetching of Links");
        recursiveCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursiveCheckBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(recursiveCheckBox, gridBagConstraints);

    }//GEN-END:initComponents

    private void pathRegexTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pathRegexTextFieldFocusLost
        System.out.println("pathRegex focus lost");
    }//GEN-LAST:event_pathRegexTextFieldFocusLost

    private void pathRegexTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathRegexTextFieldActionPerformed
        System.out.println("path regex actionPerformed");
    }//GEN-LAST:event_pathRegexTextFieldActionPerformed

    private void domainRegexTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domainRegexTextFieldActionPerformed
        System.out.println("domain regex actionPerformed");
    }//GEN-LAST:event_domainRegexTextFieldActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        _spider.resetRequestQueue();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void fetchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchButtonActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_fetchButtonActionPerformed

    private void recursiveCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursiveCheckBoxActionPerformed
        _spider.setRecursive(recursiveCheckBox.isSelected());
    }//GEN-LAST:event_recursiveCheckBoxActionPerformed
    
    public void newSession(String dir) {
    }
    
    public void openSession(String dir) {
    }
    
    public void saveSession(String dir) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField domainRegexTextField;
    private javax.swing.JButton fetchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pathRegexTextField;
    private javax.swing.JCheckBox recursiveCheckBox;
    private javax.swing.JButton stopButton;
    private javax.swing.JTable unseenLinkTable;
    // End of variables declaration//GEN-END:variables
    
}
