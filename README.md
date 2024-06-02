# LibrarySystem

This project demonstrates the implementation of test-driven development (TDD) principles for a simple LibrarySystem using Java. The key focus is on three main methods: `getBooksByAuthor`, `getBooksByTitle`, and `getBooksByAuthorAndTitle`.

## Table of Contents
- [Classes Overview](#classes-overview)
- [Test Cases](#test-cases)
  - [getBooksByAuthor Method](#getbooksbyauthor-method)
  - [getBooksByTitle Method](#getbooksbytitle-method)
  - [getBooksByAuthorAndTitle Method](#getbooksbyauthorandtitle-method)
- [Running the Tests](#running-the-tests)

## Classes Overview

1. **Book.java**: Represents a book with `id`, `title`, and `author`.
2. **BookService.java**: Provides methods to retrieve books by author, title, or both.
3. **IBookRepository.java**: Interface for book repository.
4. **BookRepository.java**: Implementation of `IBookRepository`.
5. **FakeRepositoryForTest.java**: Mock repository for testing purposes.
6. **BookServiceTest.java**: Contains test cases for `BookService` methods.

## Test Cases

### `getBooksByAuthor` Method

1. **Test with an author that has books:**

2. **Test with an author that has no books:**

3. **Test with null or empty author string:**

4. **Test with an author that has multiple books:**

5. **Test with special characters in the author's name:**

### `getBooksByTitle` Method

1. **Test with a title that has books:**

2. **Test with a title that has no books:**

3. **Test with null or empty title string:**

4. **Test with a title that has multiple books:**

5. **Test with special characters in the title:**

### `getBooksByAuthorAndTitle` Method

1. **Test with a valid author and title combination:**

2. **Test with a valid author but invalid title:**

3. **Test with an invalid author but valid title:**

4. **Test with both invalid author and title:**

5. **Test with an author and title combination that appears multiple times:**.

## Running the Tests

To run the tests, follow these steps:

1. **Set Up JUnit 5 Dependency:**
    - Ensure JUnit 5 is added to your project dependencies (Maven or Gradle).

2. **Run Tests in IntelliJ IDEA:**
    - Right-click on the `BookServiceTest` class and select `Run 'BookServiceTest'`.

3. **Verify Test Results:**
    - Ensure all tests pass and verify the output for any failures.

