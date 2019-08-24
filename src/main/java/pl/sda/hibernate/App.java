package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.sda.hibernate.entity.Author;
import pl.sda.hibernate.entity.Book;
import pl.sda.hibernate.entity.Category;
import pl.sda.hibernate.entity.User;
import pl.sda.hibernate.service.CategoryService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        CategoryService categoryService = new CategoryService();
//        Category category = new Category();
//        category.setName("Kategoria");
//
//        categoryService.save(category);
//
//        Category category1 = new Category();
//        category1.setName("Kategoria druga");
//        categoryService.save(category1);

        // n + 1 problem

        Session session = HibernateUtils.getSession();
//    List<Book> bookList = session.createQuery("SELECT b FROM Book b", Book.class).getResultList();
        List<Book> bookList = session.getNamedQuery("selectBooks").getResultList();
        for(Book b: bookList){
            System.out.println(b);
        }


//     \   SessionFactory sf = new Configuration()
//                .configure()
//                .buildSessionFactory();

//        try {
//            Thread.sleep(50000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Session session = HibernateUtils.getSession();
//
//        User user = new User("Jan", "Kowalski");
//
//        Transaction transaction = null;
//        try {
//            transaction = session.beginTransaction();
//            session.save(user);
//            transaction.commit();
//        }catch (Exception e){
//            if(transaction != null){
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }finally {
//            if(session != null){
//               HibernateUtils.closeSession();
//            }
//        }
//        session = HibernateUtils.getSession();
//        transaction = session.beginTransaction();
//        session.save(new User("jan", "kowalski"));
//        transaction.commit();
//        HibernateUtils.closeSession();
//
//        Category category = new Category();
//        category.setName("Fantastyka");
//        Set<Author> authors = new HashSet<>(Arrays.asList(
//                new Author("Jan", "Kowalski")
//        ));
//        Book book = new Book();
//        book.setCategory(category);
//        book.setAuthors(authors);
//        book.setTitle("Tytul ksiazki");
//
//        BookDAO bookDAO = new BookDAO();
//        bookDAO.insertBook(book);
//
//
//
//        for(Book b: bookDAO.findAllBooks()){
//            System.out.println("Ksiazka: " + b.getTitle());
//            System.out.println("Kategoria: " + b.getCategory().getName());
//
//            for(Author author: b.getAuthors()){
//                System.out.println("Autor: " + author.getName());
//            }
//
//            System.out.println("=========");
//        }

    }
}
