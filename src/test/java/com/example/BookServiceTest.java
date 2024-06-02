package com.example;

import org.example.Book;
import org.example.BookService;
import org.example.IBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        IBookRepository bookRepository = new FakeRepositoryForTest();
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetBooksByAuthor() {
        List<Book> books = bookService.getBooksByAuthor("Kent Beck");
        Assertions.assertEquals(1, books.size());
        Assertions.assertEquals("Test Driven Development", books.get(0).getTitle());
    }

    @Test
    public void testGetBooksByAuthor_NoBooksFound() {
        List<Book> books = bookService.getBooksByAuthor("Unknown Author");
        Assertions.assertEquals(0, books.size());
    }

    @Test
    public void testGetBooksByTitle() {
        List<Book> books = bookService.getBooksByTitle("Clean Code");
        Assertions.assertEquals(1, books.size());
        Assertions.assertEquals("Robert C. Martin", books.get(0).getAuthor());
    }

    @Test
    public void testGetBooksByTitle_NoBooksFound() {
        List<Book> books = bookService.getBooksByTitle("Unknown Title");
        Assertions.assertEquals(0, books.size());
    }

    @Test
    public void testGetBooksByAuthorAndTitle() {
        List<Book> books = bookService.getBooksByAuthorAndTitle("Kent Beck", "Test Driven Development");
        Assertions.assertEquals(1, books.size());
        Assertions.assertEquals("Kent Beck", books.get(0).getAuthor());
    }

    @Test
    public void testGetBooksByAuthorAndTitle_NoBooksFound() {
        List<Book> books = bookService.getBooksByAuthorAndTitle("Kent Beck", "Unknown Title");
        Assertions.assertEquals(0, books.size());
    }

    @Test
    public void testGetBooksByAuthorAndTitle_NoAuthorFound() {
        List<Book> books = bookService.getBooksByAuthorAndTitle("Unknown Author", "Test Driven Development");
        Assertions.assertEquals(0, books.size());
    }

    @Test
    public void testGetBooksByAuthorAndTitle_MultipleBooksFound() {
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("5", "Test Driven Development", "Kent Beck")
        );
        List<Book> books = bookService.getBooksByAuthorAndTitle("Kent Beck", "Test Driven Development");
        Assertions.assertEquals(2, books.size());
    }
}
