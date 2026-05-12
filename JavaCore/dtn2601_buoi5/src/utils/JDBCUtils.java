package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/testingsystem";
        String username = "root";
        String password = "123456";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }  catch (Exception ex) {
            System.out.println("Kết nối DB ko thành công");
        }
        return connection;
    }
}
