import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Start {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=GMT",
                                                          "root","303120");
           PreparedStatement ps =  conn.prepareStatement("INSERT INTO student(s_id,s_name,s_age) VALUES(?,?,?)");
           ps.setInt(1,8);
           ps.setString(2,"kdl");
           ps.setInt(3,28);
           ps.execute();
           ps.close();
           conn.close();
         
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
