package fr.axelallain.storageservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

    @ManyToOne
    @JoinColumn(name = "loaner_id")
    private Loaner loaner;

    public Book() {}
}
