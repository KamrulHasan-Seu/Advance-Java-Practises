import model.product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public Main() {
        Session session = SingleToneSessionFactory.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            product p = new product(34, "shamim", 34.00);
            session.save(p);
            transaction.commit();
            System.out.println("Connected");
        } catch (HibernateException hibernateException) {

            transaction.rollback();
            hibernateException.printStackTrace();

        } finally {
            session.close();

        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
