package pl.sda.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private int id;
    private String lastname;
    private String name;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> bookSet;

    public Author(String lastname, String name) {
        this.lastname = lastname;
        this.name = name;
    }
}
