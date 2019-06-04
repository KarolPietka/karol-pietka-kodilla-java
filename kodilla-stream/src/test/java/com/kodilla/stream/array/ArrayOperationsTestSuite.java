package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int[] numbers = {2,2,7,5,5,3,4,5,6,6,10,8,1};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(4.923076923076923, average, 0);
    }
}
