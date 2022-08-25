import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/rfid";

    String USER = "root";
    String PASS = "";

    public void register(String username, String password) {

        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement sql = conn.createStatement();



            String register = "INSERT INTO tags (username, pasword) VALUES ('"+ username + "','"+ password + "')";
            sql.executeUpdate(register);

            System.out.println("registered");

        } catch (SQLException e){
            e.printStackTrace();

        }

    }


}
