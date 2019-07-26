package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Book list 1");
        Book book1 = new Book("1", "author1", LocalDate.of(2011, 10, 05));
        Book book2 = new Book("2", "author2", LocalDate.of(2009, 02, 05));
        Book book3 = new Book("3", "author3", LocalDate.of(2010, 05, 05));


        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        System.out.println(library);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Book list 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Book list 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When
        library.getBooks().remove(book2);
        // Than
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}

