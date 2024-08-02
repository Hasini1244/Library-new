/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.welcome;

import edu.ijse.login.Login;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLibrary = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblLibrary.setFont(new java.awt.Font("Script MT Bold", 2, 80)); // NOI18N
        lblLibrary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibrary.setText("Library Management System");
        getContentPane().add(lblLibrary);
        lblLibrary.setBounds(6, 112, 1040, 250);

        btnNext.setBackground(new java.awt.Color(249, 249, 249));
        btnNext.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/welcome/next.jpg"))); // NOI18N
        btnNext.setText("Next>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(1040, 550, 170, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/welcome/welcome image.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -20, 1360, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
         setVisible(false);
         new Login().setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLibrary;
    // End of variables declaration//GEN-END:variables
}