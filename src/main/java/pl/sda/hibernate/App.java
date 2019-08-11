package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.sda.hibernate.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        User user = new User("Jan", "Kowalski");

        Transaction transaction = null;
        transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();

        session.close();
    }
}
