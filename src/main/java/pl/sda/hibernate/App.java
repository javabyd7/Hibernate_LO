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
//     \   SessionFactory sf = new Configuration()
//                .configure()
//                .buildSessionFactory();

        Session session = HibernateUtils.getSession();

        User user = new User("Jan", "Kowalski");

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            if(session != null){
               HibernateUtils.closeSession();
            }
        }
        session = HibernateUtils.getSession();
        transaction = session.beginTransaction();
        session.save(new User("jan", "kowalski"));
        HibernateUtils.closeSession();
    }
}
