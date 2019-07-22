package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private final Display display;

    @Autowired
    public Calculator(final Display display){
        this.display = display;
    }
    public double add (double a, double b){
        double result = display.displayValue(a + b);
        return result;
    }
    public double sub (double a, double b) {
        double result = display.displayValue(a - b);
        return result;
    }
    public double mul (double a, double b) {
        double result = display.displayValue(a * b);
        return result;
    }
    public double div (double a, double b) {
        double result = display.displayValue(a / b);
        return result;
    }
}
