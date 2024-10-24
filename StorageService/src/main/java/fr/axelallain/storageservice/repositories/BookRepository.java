package fr.axelallain.storageservice.repositories;

import fr.axelallain.storageservice.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
