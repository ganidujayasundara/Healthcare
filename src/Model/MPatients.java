/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.SQLException;

public class MPatients {
    private String fullName;
    private String phone;
    private String age;
    private String address;
    private String gender;
    private String email;
    private String nic;

    // Constructor
    public MPatients(String fullName, String phone, String age, String address, String gender, String email, String nic) {
        this.fullName = fullName;
        this.phone = phone;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.nic = nic;
    }

    // Getters
    public String getFullName() { return fullName; }
    public String getPhone() { return phone; }
    public String getAge() { return age; }
    public String getAddress() { return address; }
    public String getGender() { return gender; }
    public String getEmail() { return email; }
    public String getNic() { return nic; }

    // Save to database
    public void saveToDatabase() throws SQLException {
        String insertSQL = "INSERT INTO patients (full_name, phone_number, age, address, gender, email, nic) VALUES ('"
                + fullName + "', '" + phone + "', '" + age + "', '" + address + "', '"
                + gender + "', '" + email + "', '" + nic + "')";
        MySQL.execute(insertSQL);
    }

}
