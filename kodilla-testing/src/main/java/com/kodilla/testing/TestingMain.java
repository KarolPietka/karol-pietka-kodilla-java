package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();

        int addResult = calculator1.add(10, 30);
        System.out.println("Add result = " + addResult);
        if (addResult == 40) {
            System.out.println("RESULT OK");
        } else {
            System.out.println("ERROR");
        }
        int subtractResult = calculator1.subtract(30, 3);
        System.out.println("subtract result = " + subtractResult);

        if (subtractResult == 27) {
            System.out.println("RESULT OK");
        } else {
            System.out.println("ERROR");
        }
    }
}