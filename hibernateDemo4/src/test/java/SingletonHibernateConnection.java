
import org.hibernate.SessionFactory;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class SingletonHibernateConnection {

    private static SingletonHibernateConnection hibernateConnection = null;
    private static SingletonHibernateConnection ourInstance = new SingletonHibernateConnection();

    private SingletonHibernateConnection() {
        SessionFactory sessionFactory = new Configuration() {
            @Override
            public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
                return new AppConfigurationEntry[0];
            }
        }.configure("hibernate.cfg.xml").buildSessionFactory();
        public static SingletonHibernateConnection getInstance () {
            return hibernateConnection;
        }
    }
