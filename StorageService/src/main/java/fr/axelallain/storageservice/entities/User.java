package fr.axelallain.storageservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class User {

    @Id
    private Long id;

    private String name;

    private Date creationDate;

    public User() {}
}
