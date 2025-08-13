
package Model;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.sql.ResultSet;


public class MySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/healthcare"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException { 
        return DriverManager.getConnection(URL, USER, PASSWORD); 
    }
    
    public static void execute(String query) throws SQLException { 
        try (Connection conn = getConnection(); 
            Statement stmt = conn.createStatement()) { 
            stmt.execute(query);
        } 
    }
    
     public static ResultSet executeQuery(String query) throws SQLException { 
        Connection conn = getConnection();
     Statement stmt = conn.createStatement(); 
     return stmt.executeQuery(query);
    }
}
