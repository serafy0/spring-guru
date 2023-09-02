package com.spring.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.spring6webapp.domain.Author;
import com.spring.spring6webapp.domain.Book;
import com.spring.spring6webapp.repositories.AuthorRepository;
import com.spring.spring6webapp.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("domin driven design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");
        Book noEJP = new Book();
        noEJP.setTitle("J2EE Development without EJP");
        noEJP.setIsbn("5534353");

        Author rodSaved = authorRepository.save(rod);
        Book noEJPSaved = bookRepository.save(noEJP);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJPSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + authorRepository.count());

    }
}
