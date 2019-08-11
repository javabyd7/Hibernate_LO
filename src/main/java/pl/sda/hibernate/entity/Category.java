package pl.sda.hibernate.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Book> bookSet;
}
