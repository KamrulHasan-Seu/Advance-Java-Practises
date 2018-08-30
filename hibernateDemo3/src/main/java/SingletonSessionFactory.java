import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class SingleToneSessionFactory {

    private static SessionFactory sessionFactory = null;
    private static SingleToneSessionFactory instance = new SingleToneSessionFactory();

    private SingleToneSessionFactory() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
