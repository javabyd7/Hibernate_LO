package pl.sda.hibernate.dao;

import java.util.List;

public interface DaoInterface<T> {

//    T- typ
//    K - Klucz
//    V - Wartosc
    T save(T entity);
    void update(T entity);
    T findById(int id);
    void delete(T entity);
    List<T> findAll();
    void deleteAll();
}
