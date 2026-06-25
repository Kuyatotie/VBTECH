package vbtech;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/account",
                    "root",
                    "1123");
        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }
}