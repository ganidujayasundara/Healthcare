/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Contoller.CDoctors;
import Model.MDoctors;
import java.sql.ResultSet;
import Model.MySQL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class VDoctors extends javax.swing.JFrame {

    private void loadDoctorData() {
    try {
        String query = "SELECT * FROM doctors";
        ResultSet rs = MySQL.executeQuery(query); // Use your custom DB utility

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing table rows

        while (rs.next()) {
            String fullName = rs.getString("full_name");
            String specialization = rs.getString("specialization");
            String regNo = rs.getString("reg_no");
            String phone = rs.getString("phone");
            String email = rs.getString("email");

            String[] rowData = { fullName, specialization, regNo, phone, email };
            model.addRow(rowData);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading doctor data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
        
   
    public VDoctors() {
        initComponents();
        loadDoctorData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_pno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_regno = new javax.swing.JTextField();
        btn_Retrive = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        cmb_spec = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 32, 267, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Full Name  ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Specialization ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number  ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, -1, -1));
        jPanel3.add(txt_pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 140, 267, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 168, -1, -1));

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 194, 267, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Registration Number  ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 222, -1, -1));
        jPanel3.add(txt_regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 255, 264, -1));

        btn_Retrive.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Retrive.setText("Retrive");
        btn_Retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetriveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Retrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 222, -1, -1));

        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 222, -1, -1));

        cmb_spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Physician – Primary care and general health issues", "Pediatrician – Specializes in children’s health", "Gynecologist – Women’s reproductive health", "Cardiologist – Heart and blood vessel diseases", "Dermatologist – Skin, hair, and nail conditions", "Orthopedic Surgeon – Bones, joints, muscles", "ENT Specialist – Ear, Nose, and Throat", "Neurologist – Brain, spine, and nerves", "Psychiatrist – Mental health and behavioral disorders", "Ophthalmologist – Eye diseases and vision care" }));
        cmb_spec.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cmb_specComponentHidden(evt);
            }
        });
        jPanel3.add(cmb_spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 86, 266, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 828, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Registration Number", "Specialization", "Phone Number", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 799, 118));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 295, 830, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Doctor Registration Form");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 6, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 840, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGround/doc.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 860, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void cmb_specComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmb_specComponentHidden
       
    }//GEN-LAST:event_cmb_specComponentHidden

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed

         String fullName = txt_fname.getText();
    Object specializationObj = cmb_spec.getSelectedItem();
    String specialization = specializationObj != null ? specializationObj.toString() : "";
    String regNo = txt_regno.getText();
    String phone = txt_pno.getText();
    String email = txt_email.getText();

    CDoctors controller = new CDoctors();

    if (controller.validateInput(fullName, specializationObj, regNo, phone, email)) {
        MDoctors doctor = new MDoctors(fullName, specialization, regNo, phone, email);

        try {
            doctor.saveToDatabase();
            controller.addDoctorToTable((DefaultTableModel) jTable1.getModel(), doctor);
            JOptionPane.showMessageDialog(this, "Doctor added successfully!");

            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving doctor: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_btn_SaveActionPerformed

    private void clearFields() {
    txt_fname.setText("");
    cmb_spec.setSelectedIndex(0);
    txt_regno.setText("");
    txt_pno.setText("");
    txt_email.setText("");
}

    private void btn_RetriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetriveActionPerformed
        VDashboard dashboardFrame = new VDashboard();
        dashboardFrame.setVisible(true);
        dashboardFrame.pack();
        dashboardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_RetriveActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

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
            java.util.logging.Logger.getLogger(VDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDoctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Retrive;
    private javax.swing.JButton btn_Save;
    private javax.swing.JComboBox<String> cmb_spec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_pno;
    private javax.swing.JTextField txt_regno;
    // End of variables declaration//GEN-END:variables
}
