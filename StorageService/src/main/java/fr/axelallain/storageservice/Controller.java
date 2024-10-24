package fr.axelallain.storageservice;

import fr.axelallain.storageservice.entities.Book;
import fr.axelallain.storageservice.repositories.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = service.save(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }
}
