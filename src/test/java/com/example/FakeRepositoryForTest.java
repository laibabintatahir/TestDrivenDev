package com.example;

import org.example.Book;
import org.example.IBookRepository;

import java.util.Arrays;
import java.util.List;

public class FakeRepositoryForTest implements IBookRepository {
    public static List<Book> booksList;

    static {
        booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
    }

    @Override
    public List<Book> findAllBooks() {
        return booksList;
    }
}
