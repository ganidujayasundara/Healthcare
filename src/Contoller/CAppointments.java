/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoller;

import Model.MAppointments;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ganidu
 */
public class CAppointments {
    public boolean validateInput(String patientName, String date, String time, String notes, Object doctorObj, Object statusObj) {
        if (patientName.isEmpty() || date.isEmpty() || time.isEmpty() || notes.isEmpty() || doctorObj == null || statusObj == null) {
            showError("Please enter All Data!");
            return false;
        }

        if (!date.matches("\\d{4}/\\d{2}/\\d{2}")) {
            showError("Please enter a valid date in the format YYYY/MM/DD!");
            return false;
        }

        if (!time.matches("(1[0-2]|0[1-9]):([0-5][0-9]) (AM|PM)")) {
            showError("Please enter a valid time in the format HH:MM AM/PM!");
            return false;
        }

        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    public void addAppointmentToTable(DefaultTableModel model, MAppointments appointment) {
        String[] data = {
            appointment.getPatientName(),
            appointment.getDoctorName(),
            appointment.getAppointmentDate(),
            appointment.getTimeSlot(),
            appointment.getNotes(),
            appointment.getStatus()
        };
        model.addRow(data);
    }

}
