package com.kodilla.stream.array;

import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {


    static double getAverage(int[] numbers) throws NoSuchElementException {


        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));

        OptionalDouble average = IntStream.of(numbers)
                .average();

        if (average.isPresent()) {
            return average.getAsDouble();
        }else {
            return 0;
        }
    }
}



