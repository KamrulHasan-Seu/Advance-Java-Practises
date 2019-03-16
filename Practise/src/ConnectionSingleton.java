import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionSingleton {
    private static Connection connection = null;
    private static final ConnectionSingleton ins = new ConnectionSingleton();

private  ConnectionSingleton (){
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Properties properties =new Properties();
        InputStream inputStream = new FileInputStream("Properties.properties");
        properties.load(inputStream);

        String user = properties.get("user").toString();
        String pass = properties.get("pass").toString();
        String url  = properties.get("url").toString();


        connection = DriverManager.getConnection(url,user,pass);
        System.out.println("Connected");

    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Not conneted");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

    public static java.sql.Connection getConnection() {
        return connection;
    }
}
