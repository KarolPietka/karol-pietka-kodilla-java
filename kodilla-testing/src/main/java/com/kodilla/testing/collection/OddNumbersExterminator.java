package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List <Integer> exterminate (List<Integer> numbers){

        List<Integer> evensNumbersList = new ArrayList<>();
        for (Integer numberList : numbers) {
            if (numberList % 2 == 0) {
                evensNumbersList.add(numberList);
            }
        }
        return evensNumbersList;
    }
}
