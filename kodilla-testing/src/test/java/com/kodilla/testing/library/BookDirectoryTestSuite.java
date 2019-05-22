package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //System.out.println(theListOfBooks);
        // Then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test // user do not have any borrow books
    public void testListBooksInHandsOfZero(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "83120514971");

        List<Book> borrowedBooksList = new ArrayList<>();

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(borrowedBooksList);

        //When
        List<Book> listOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        //System.out.println(listOfBooks.size());

        //Then
        assertEquals(0, listOfBooks.size());
    }

    @Test // #borrow 1 books#
    public void testListBooksInHandsOfOne(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "83120514971");

        List<Book> borrowedBooksList = new ArrayList<>();
        borrowedBooksList.add(new Book("Gra o tron", "George R.R. Martin", 1998));

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(borrowedBooksList);

        //When
        List<Book> listOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        //System.out.println(listOfBooks.size());

        //Then
        assertEquals(1, listOfBooks.size());
    }

    @Test // #borrow 5 books#
    public void testListBooksInHandsOfFive(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "83120514971");

        List<Book> borrowedBooksList = new ArrayList<>();
        borrowedBooksList.add(new Book("Gra o tron", "George R.R. Martin", 1998));
        borrowedBooksList.add(new Book("Starcie królów", "George R.R. Martin", 2000));
        borrowedBooksList.add(new Book("Nawalnica mieczy", "George R.R. Martin", 2002));
        borrowedBooksList.add(new Book("Uczta dla wron", "George R.R. Martin", 2002));
        borrowedBooksList.add(new Book("Taniec ze smokami", "George R.R. Martin", 2011));

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(borrowedBooksList);

        //When
        List<Book> listOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        //System.out.println(listOfBooks.size());

        //Then
        assertEquals(5, listOfBooks.size());
    }
}