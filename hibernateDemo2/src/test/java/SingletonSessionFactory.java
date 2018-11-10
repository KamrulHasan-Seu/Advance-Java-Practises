import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonSessionFactory {
    private static SingletonSessionFactory ourInstance = new SingletonSessionFactory();

    private static SessionFactory sessionFactory = null;
    private static SingletonSessionFactory singletonSessionFactory = new SingletonSessionFactory();

    private SingletonSessionFactory() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public static SingletonSessionFactory getSessionFactory() {
        return singletonSessionFactory;
    }
}
