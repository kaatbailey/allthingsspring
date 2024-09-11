package kaat.datastructure.practice.allthingsspring.starterdata;

import kaat.datastructure.practice.allthingsspring.domain.Author;
import kaat.datastructure.practice.allthingsspring.domain.Book;
import kaat.datastructure.practice.allthingsspring.repositories.AuthorRepository;
import kaat.datastructure.practice.allthingsspring.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoad implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataLoad.class);
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public DataLoad(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Adding authors
        Author author1 = new Author();
        author1.setFirstName("George");
        author1.setLastName("Orwell");
        authorRepository.save(author1);

        Author author2 = new Author();
        author2.setFirstName("Jane");
        author2.setLastName("Austen");
        authorRepository.save(author2);

        // Adding books with associated authors
        Book book1 = new Book();
        book1.setTitle("1984");
        book1.setAuthor(author1.getFirstName() + " " + author1.getLastName());
        book1.setIsbn("9780451524935");
        bookRepository.save(book1);

        Book book2 = new Book();
        book2.setTitle("Pride and Prejudice");
        book2.setAuthor(author2.getFirstName() + " " + author2.getLastName());
        book2.setIsbn("9780141439518");
         bookRepository.save(book2);



        log.info("In LoadData");
        log.info("Author Count: {}, Book Count: {}", authorRepository.count(), bookRepository.count());











    }
}
