package ca.gbc.comp3905.comp3905petclinic.domain;
import javax.persistence.*;
import java.util.Set;

@Entity

public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO);
    private Long id;
    private String isbn;
    private String title;

    @ManyToMany()


}
