/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.SQLException;

public class MDoctors {
    private String fullName;
    private String specialization;
    private String regNo;
    private String phone;
    private String email;

    // Constructor
    public MDoctors(String fullName, String specialization, String regNo, String phone, String email) {
        this.fullName = fullName;
        this.specialization = specialization;
        this.regNo = regNo;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getFullName() { return fullName; }
    public String getSpecialization() { return specialization; }
    public String getRegNo() { return regNo; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    // Save to database
    public void saveToDatabase() throws SQLException {
        String insertSQL = "INSERT INTO doctors (full_name, specialization, registration_number, phone, email) VALUES ('"
                + fullName + "', '" + specialization + "', '" + regNo + "', '" + phone + "', '" + email + "')";
        MySQL.execute(insertSQL);
    }

}
