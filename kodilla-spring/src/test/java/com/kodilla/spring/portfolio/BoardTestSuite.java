package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
       //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Task 6 to do");


        board.getInProgressList().getTasks().add("Task 4 in progress");
        board.getInProgressList().getTasks().add("Task 5 in progress");

        board.getDoneList().getTasks().add("Done task 1");
        board.getDoneList().getTasks().add("Done task 2");
        board.getDoneList().getTasks().add("Done task 3");

       //Than
        System.out.println("----------- TASKS TO DO ---------------");
        board.getToDoList().getTasks().stream()
                .forEach(System.out::println);
        System.out.println("----------- TASKS IN PROGRESS ---------------");
        board.getInProgressList().getTasks().stream()
                .forEach(System.out::println);
        System.out.println("------------DONE-TASKS---------------");
        board.getDoneList().getTasks().stream()
                .forEach(System.out::println);

    }
}
