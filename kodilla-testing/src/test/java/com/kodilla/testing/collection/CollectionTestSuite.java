package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    public List<Integer> actualList = new ArrayList<>();
    public List<Integer> checkList = new ArrayList<>();
    public List<Integer> expectedList = new ArrayList<>();

    @Before
    public void before(){
        System.out.println("Test:...START...");
    }
    @After
    public void after(){
        System.out.println("Test:...END...");
    }

    //test sprawdza czy klasa jest pusta
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminatorEmptyList = new OddNumbersExterminator();
        //When
        checkList = exterminatorEmptyList.exterminate(actualList);
        System.out.println("Testing empty list: " + checkList);
        //Then
        Assert.assertEquals(expectedList, actualList);
    }
    //sprawdza czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminatorNormalList = new OddNumbersExterminator();
        actualList.add(1);
        actualList.add(10);
        actualList.add(36);
        actualList.add(23);
        actualList.add(16);
        actualList.add(124);
        actualList.add(90);
        expectedList.add(10);
        expectedList.add(124);
        //When
        checkList = exterminatorNormalList.exterminate(actualList);
        System.out.println("List: " + checkList);
        //Then
        Assert.assertEquals(expectedList, checkList);
    }
}
