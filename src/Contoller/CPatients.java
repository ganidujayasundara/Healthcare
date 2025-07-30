/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoller;

import Model.MPatients;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ganidu
 */
public class CPatients {
   public boolean validateInput(String fullName, String phone, String age, String address, Object genderObj, String email, String nic) {
        if (fullName.isEmpty() || phone.isEmpty() || age.isEmpty() || address.isEmpty() ||
            genderObj == null || email.isEmpty() || nic.isEmpty()) {
            showError("Please enter all data!");
            return false;
        }

        if (!phone.matches("\\d{10}")) {
            showError("Phone number must be 10 digits!");
            return false;
        }

        if (!age.matches("\\d+")) {
            showError("Age must be a valid number!");
            return false;
        }

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
            showError("Please enter a valid email address!");
            return false;
        }

        if (!nic.matches("^\\d{9}[Vv]$|^\\d{12}$")) {
            showError("NIC must be 9 digits + 'V' or 12 digits!");
            return false;
        }

        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    public void addPatientToTable(DefaultTableModel model, MPatients patient) {
        String[] data = {
            patient.getFullName(),
            patient.getPhone(),
            patient.getAge(),
            patient.getAddress(),
            patient.getGender(),
            patient.getEmail(),
            patient.getNic()
        };
        model.addRow(data);
    }
 
}
