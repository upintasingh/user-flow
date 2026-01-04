package org.com.userwithjpa.service;

import jakarta.transaction.Transactional;
import org.com.userwithjpa.model.Author;
import org.com.userwithjpa.model.Book;
import org.com.userwithjpa.repository.AuthorRepository;
import org.com.userwithjpa.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class FetchModeTest {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    @Transactional
    public void testFetchType() {
        Author author = new Author();
        author.setName("upinta");

        Book book = new Book();
        book.setTitle("Think like a MONK");
        book.setAuthor(author);

        Book book2 = new Book();
        book2.setTitle("GEN Z");
        book2.setAuthor(author);

        author.setBooks(List.of(book, book2));
        authorRepository.save(author);

        Optional<Author> authorResponse =  authorRepository.findById(author.getId());
        assertThat(authorResponse).isPresent();
        Author authorRes = authorResponse.get();
    }

    /*@Test
    public void testFetchBooks() {
        Optional<Author> authorResponse =  authorRepository.findById(1L);
        assertThat(authorResponse).isPresent();

        Author authorRes = authorResponse.get();
        for(Book books : authorRes.getBooks()) {
            System.out.println(books.getTitle());
        }
    }*/


}
