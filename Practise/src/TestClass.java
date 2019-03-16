import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestClass {
    public static void main(String[] args) {
        Connection connection = ConnectionSingleton.getConnection();
        Product product = new Product(12,"Glass",123);
         String query =String.format("INSERT INTO product VALUES(%d,'%s',%d);",
                 product.getproductId(),product.getproductName(),product.getunitPrice());
        try {
            Statement statement = connection.createStatement();
             statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
