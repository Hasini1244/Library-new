/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.view;

import edu.ijse.controller.BookCategoryController;
import edu.ijse.dto.BookCategoryDto;
import edu.ijse.homePage.homePage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class BookCategoryView extends javax.swing.JFrame {
private final BookCategoryController BOOKCATEGORY_CONTROLLER;
    /**
     * Creates new form BookCategoryView
     */
    public BookCategoryView() {
         BOOKCATEGORY_CONTROLLER = new BookCategoryController();
        initComponents();
               setExtendedState(JFrame.MAXIMIZED_BOTH);

           loadTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBookCategories = new javax.swing.JLabel();
        lblBookId = new javax.swing.JLabel();
        lblBookCategory = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtBookId = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookCategory = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblBookCategories.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        lblBookCategories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookCategories.setText("Manage Book Categories");
        getContentPane().add(lblBookCategories);
        lblBookCategories.setBounds(0, 25, 925, 77);

        lblBookId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBookId.setText("Book ID");
        getContentPane().add(lblBookId);
        lblBookId.setBounds(17, 156, 87, 25);

        lblBookCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBookCategory.setText("Book Category");
        getContentPane().add(lblBookCategory);
        lblBookCategory.setBounds(17, 330, 127, 25);

        lblLanguage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLanguage.setText("Language");
        getContentPane().add(lblLanguage);
        lblLanguage.setBounds(17, 241, 83, 25);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 0, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Literary Fiction", "Horror", "Fantasy", "Historical Fiction", "Memoir", "Mystery", "Science Fiction", "Thriller", "Children's literature", "Novel", "Contemporary Fantasy", "Biography", "Crime Fiction", "History", "Short Story", " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(203, 327, 271, 31);
        getContentPane().add(txtBookId);
        txtBookId.setBounds(203, 159, 271, 25);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 51, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Sinhala", "Tamil" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(203, 238, 271, 30);

        btnSave.setFont(new java.awt.Font("Script MT Bold", 2, 24)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/view/save new.jpg"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(930, 130, 156, 40);

        btnUpdate.setFont(new java.awt.Font("Script MT Bold", 2, 24)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/view/update.jpg"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(930, 220, 158, 47);

        btnDelete.setFont(new java.awt.Font("Script MT Bold", 2, 24)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/view/dlt image.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(940, 306, 156, 40);

        tblBookCategory.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBookCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBookCategory);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 388, 900, 174);

        btnBack.setFont(new java.awt.Font("Script MT Bold", 2, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/view/back image.jpg"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(950, 570, 148, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/view/background image.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1320, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
 saveBookCategory();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
   updateBookCategory();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      deleteBookCategory();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblBookCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookCategoryMouseClicked
         searchBookCategory();
    }//GEN-LAST:event_tblBookCategoryMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       setVisible(false);
        new homePage().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBookCategories;
    private javax.swing.JLabel lblBookCategory;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JTable tblBookCategory;
    private javax.swing.JTextField txtBookId;
    // End of variables declaration//GEN-END:variables
public void clearForm(){
        txtBookId.setText("");
        jComboBox1.setSelectedItem("");
               jComboBox2.setSelectedItem("");
 
        
   }

    private void saveBookCategory() {
        try {
            BookCategoryDto dto = new BookCategoryDto(txtBookId.getText(),(String)jComboBox1.getSelectedItem(),(String) jComboBox2.getSelectedItem());
            String resp = BOOKCATEGORY_CONTROLLER.save(dto);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
              loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void updateBookCategory() {
        try {
            BookCategoryDto dto = new BookCategoryDto(txtBookId.getText(),(String)jComboBox1.getSelectedItem(), (String)jComboBox2.getSelectedItem());
            String resp = BOOKCATEGORY_CONTROLLER.update(dto);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void deleteBookCategory() {
        try {
            String resp = BOOKCATEGORY_CONTROLLER.delete(txtBookId.getText());
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
  }

    private void loadTable() {
    try {
            String[] columns = {"BookId", "Language", "BookCategory"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblBookCategory.setModel(dtm);

            ArrayList<BookCategoryDto> bookCategoryDtos = BOOKCATEGORY_CONTROLLER.getAll();
            for (BookCategoryDto bookCategoryDto : bookCategoryDtos) {
                Object[] rowData = {bookCategoryDto.getBookId(), bookCategoryDto.getLanguage(), bookCategoryDto.getBookCategory()};
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
 private void searchBookCategory() {
        try {
            String code = (String) tblBookCategory.getValueAt(tblBookCategory.getSelectedRow(), 0).toString();
            BookCategoryDto dto = BOOKCATEGORY_CONTROLLER.get(code);
            if(dto != null){
                txtBookId.setText(dto.getBookId());
                jComboBox1.setSelectedItem(dto.getLanguage());
               jComboBox2.setSelectedItem(dto.getBookCategory());
            } else {
                JOptionPane.showMessageDialog(this, "Book not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    

}