package com.kodilla.spring.com.kodilla.spring.calculator;

import com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAddCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
         double addResult = calculator.add(2.2, 5.7);

        //Then
        Assert.assertEquals(7.9, addResult, 0);
        System.out.println("Addition result = " + addResult);
    }
    @Test
    public void testSubCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double subResult = calculator.sub(20.9, 5.7);

        //Then
        Assert.assertEquals(15.2, subResult, 0);
        System.out.println("Subtraction result = " + subResult);
    }
    @Test
    public void testMulCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double mulResult = calculator.mul(2.8, 5.8);

        //Then
        Assert.assertEquals(16.24, mulResult, 0);
        System.out.println("Multiplication result = " + mulResult);
    }
    @Test
    public void testDivCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double divResult = calculator.div(50.2, 25.0);

        //Then
        Assert.assertEquals(2.008, divResult, 0);
        System.out.println("Division result = " + divResult);
    }
}
