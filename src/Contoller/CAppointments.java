
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
