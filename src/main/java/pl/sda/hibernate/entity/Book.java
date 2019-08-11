package pl.sda.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

import static org.hibernate.annotations.CascadeType.SAVE_UPDATE;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;

    @ManyToOne
    @Cascade(SAVE_UPDATE)
    private Category category;

    @ManyToMany
    @Cascade(SAVE_UPDATE)
    private Set<Author> authors;

}
