/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - BookTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testInvalidPagesBook() {
        Book book = new Book("", "", "", -10);
        assertEquals(10, book.getPages());
    }

    @Test
    void testShortBook() {
        Book book = new Book("", "", "", 50);
        assertEquals(50, book.getPages());
        assertFalse(book.isLong());
    }

    @Test
    void testLongBook() {
        Book book = new Book("", "", "", 500);
        assertEquals(500, book.getPages());
        assertTrue(book.isLong());
    }

    @Test
    void testFictionBook() {
        Book book = new Book("", "", "fiction", 0);
        assertEquals("fiction", book.getGenre());
    }

    @Test
    void testNonFictionBook() {
        Book book = new Book("", "", "non-fiction", 0);
        assertEquals("non-fiction", book.getGenre());
    }

    @Test
    void testTechnicalBook() {
        Book book = new Book("", "", "technical", 0);
        assertEquals("technical", book.getGenre());
    }

    @Test
    void testBiographyBook() {
        Book book = new Book("", "", "biography", 0);
        assertEquals("biography", book.getGenre());
    }

    @Test
    void testInvalidGenreBook() {
        Book book = new Book("", "", "teen-fiction", 0);
        assertEquals("fiction", book.getGenre());
    }

    @Test
    void testTitleIsSet() {
        Book book = new Book("a title", "", "", 0);
        assertEquals("a title", book.getTitle());
    }

    @Test
    void testAuthorIsSet() {
        Book book = new Book("", "an author", "", 0);
        assertEquals("an author", book.getAuthor());
    }

    @Test
    void testToStringIsDefined() {
        Book book = new Book("a title", "an author", "", 0);
        assertNotEquals("", book.toString());
    }
}