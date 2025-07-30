/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.SQLException;

public class MAppointments {
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    private String timeSlot;
    private String notes;
    private String status;

    // Constructor
    public MAppointments(String patientName, String doctorName, String appointmentDate, String timeSlot, String notes, String status) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.timeSlot = timeSlot;
        this.notes = notes;
        this.status = status;
    }

    // Getters
    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public String getAppointmentDate() { return appointmentDate; }
    public String getTimeSlot() { return timeSlot; }
    public String getNotes() { return notes; }
    public String getStatus() { return status; }

    // Save to database
    public void saveToDatabase() throws SQLException {
        String insertSQL = "INSERT INTO appointments (patient_name, doctor_name, date, time_slot, notes, status) " +
                           "VALUES ('" + patientName + "', '" + doctorName + "', '" + appointmentDate + "', '" +
                           timeSlot + "', '" + notes + "', '" + status + "')";
        MySQL.execute(insertSQL);
    }

}
