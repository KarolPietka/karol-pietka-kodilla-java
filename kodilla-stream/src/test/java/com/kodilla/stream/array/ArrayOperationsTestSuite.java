package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int[] numbers = {1,2,3,3,4,4,5,6,6};

        //When
        double average = ArrayOperations.getAverage(numbers);
        System.out.println("Average: " + average);

        //Then
        Assert.assertEquals(3.7777777777777777, average, 0);
    }
    @Test
    public void testGetAverageEmptyList(){

        //Given
        int[] numbers = {};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(0, average, 0);
    }
}
