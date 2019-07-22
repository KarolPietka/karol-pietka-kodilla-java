package com.kodilla.spring.com.kodilla.spring.library;


import com.kodilla.spring.library.Library;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Test
    public void testLoadFromDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }
    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }
}