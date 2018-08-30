import org.hibernate.Session;

public class Main {
    public  Main(){
        Session session = SingletonSessionFactory.getSessionFactory().op
    }
    public static void main(String[] args) {
        new Main();
    }
}
