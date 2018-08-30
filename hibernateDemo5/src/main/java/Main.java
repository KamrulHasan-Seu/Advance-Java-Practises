import model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public Main() {
        Session session = SingleToneSessionFactory.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            Product p = new Product(6834,














                    "Rajon", 0.150);
            session.save(p);
            transaction.commit();
        } catch(HibernateException e)
        {
            System.out.println("Exception is: " + e);
            transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

    }

    public static void main(String[] args) {
        new Main();
        SingleToneSessionFactory.getSessionFactory().close();
    }
}
