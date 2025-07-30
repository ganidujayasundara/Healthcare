/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoller;

import Model.MDoctors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ganidu
 */
public class CDoctors {
     public boolean validateInput(String fullName, Object specializationObj, String regNo, String phone, String email) {
        if (fullName.isEmpty() || specializationObj == null || regNo.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            showError("Please enter all data!");
            return false;
        }

        if (!phone.matches("\\d{10}")) {
            showError("Phone number must be 10 digits!");
            return false;
        }

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
            showError("Please enter a valid email address!");
            return false;
        }

        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    public void addDoctorToTable(DefaultTableModel model, MDoctors doctor) {
        String[] data = {
            doctor.getFullName(),
            doctor.getSpecialization(),
            doctor.getRegNo(),
            doctor.getPhone(),
            doctor.getEmail()
        };
        model.addRow(data);
    }

}
