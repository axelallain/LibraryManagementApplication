package fr.axelallain.storageservice;

import fr.axelallain.storageservice.entities.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StorageServiceApplicationTests {

    @Mock
    private Service service;

    @Test
    void contextLoads() {
    }

    @Test
    public void bookShouldBeFindableByIdWhenAddedToStock() {
        // Create test book
        Book newBook = new Book();
        newBook.setId(55L);
        newBook.setTitle("Test Book");

        // Add book to stock
        Mockito.when(service.save(newBook)).thenReturn(newBook);

        // Get book by id
        Optional<Book> book = service.findById(newBook.getId());

        // Assert this title match the test book title previously created
        if (book.isPresent()) {
            Assertions.assertEquals(book.get().getTitle(), "Test Book");
        } else {
            Assertions.fail("Book not found");
        }
    }

}
