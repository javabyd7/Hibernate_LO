package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.hibernate.entity.Book;

public class BookDAO {

    public Book insertBook(Book book){
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        HibernateUtils.closeSession();
        return book;
    }


}
