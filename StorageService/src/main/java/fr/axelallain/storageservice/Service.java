package fr.axelallain.storageservice;

import fr.axelallain.storageservice.entities.Book;
import fr.axelallain.storageservice.repositories.BookRepository;

@org.springframework.stereotype.Service
public class Service {

    private final BookRepository bookRepository;

    public Service(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
