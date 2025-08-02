/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Contoller.CPatients;
import Model.MPatients;
import java.sql.ResultSet;
import Model.MySQL;
import View.VDashboard;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class VPatients extends javax.swing.JFrame {

    private void loadPatientData() {
    try {
        String query = "SELECT * FROM patients";
        ResultSet rs = MySQL.executeQuery(query); // This uses your custom DB connection method

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing table rows

        while (rs.next()) {
            String fullName = rs.getString("full_name");
            String phone = rs.getString("phone");
            String age = rs.getString("age");
            String address = rs.getString("address");
            String gender = rs.getString("gender");
            String email = rs.getString("email");
            String nic = rs.getString("nic");

            String[] rowData = { fullName, phone, age, address, gender, email, nic };
            model.addRow(rowData);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading patient data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public VPatients() {
        initComponents();
        loadPatientData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_retrive = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        txt_fname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        cmb_gender = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Patient Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 440, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 860, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Full Name  ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 15, -1, -1));

        btn_retrive.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_retrive.setText("Retrive");
        btn_retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retriveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_retrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, 280, -1));
        jPanel2.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 104, 280, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 77, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gender ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number  ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 16));
        jPanel2.add(txt_pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));
        jPanel2.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 280, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("NIC");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));
        jPanel2.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 280, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 280, -1));

        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female", "Other or Non-Binary", "Prefer not to say", " ", " " }));
        jPanel2.add(cmb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 860, 310));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 422, 865, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Phone Number", "Age", "Address", "Gender", "Email", "NIC"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 853, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGround/pa.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 880, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
            String fullName = txt_fname.getText();
    String phone = txt_pno.getText();
    String age = txt_age.getText();
    String address = txt_address.getText();
    Object genderObj = cmb_gender.getSelectedItem();
    String gender = genderObj != null ? genderObj.toString() : "";
    String email = txt_email.getText();
    String nic = txt_nic.getText();

    CPatients controller = new CPatients();

    if (controller.validateInput(fullName, phone, age, address, genderObj, email, nic)) {
        MPatients patient = new MPatients(fullName, phone, age, address, gender, email, nic);

        try {
            patient.saveToDatabase();
            controller.addPatientToTable((DefaultTableModel) jTable1.getModel(), patient);
            JOptionPane.showMessageDialog(this, "Patient added successfully!");

            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving patient: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    }//GEN-LAST:event_btn_saveActionPerformed

    private void clearFields() {
    txt_fname.setText("");
    txt_pno.setText("");
    txt_age.setText("");
    txt_address.setText("");
    cmb_gender.setSelectedIndex(0);
    txt_email.setText("");
    txt_nic.setText("");
}

    
    private void btn_retriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retriveActionPerformed
        VDashboard dashboardFrame = new VDashboard();
        dashboardFrame.setVisible(true);
        dashboardFrame.pack();
        dashboardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_retriveActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_retrive;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_pno;
    // End of variables declaration//GEN-END:variables
}
