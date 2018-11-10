import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    String USER = "root";
    String URL = "jdbc:mysql://127.0.0.1/productdb";
    String PASS = "";
    //Class.forName("com.mysql.jdbc.Driver");

    private static Connection connection = null;
    private static final ConnectionSingleton INSTANCE = new ConnectionSingleton();

    public ConnectionSingleton() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected to the Database");
        } catch (SQLException sqle) {
            System.err.println("Connection failed");
            sqle.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}