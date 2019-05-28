package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //7.3
        Forum forum = new Forum();
        Map<Integer, ForumUser> result = forum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.of(1999, 4, 23)))
                .filter(user -> user.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        result.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().toString())
                .sorted()
                .forEach(System.out::println);
    }
}
        //7,2
        /*
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/
        /*
        //7.1
        PoemBeautifier beautifier1 = new PoemBeautifier();
        String Text1 = beautifier1.beautify("Rób to, co uważasz za stosowne. I tak zawsze znajdzie się ktoś, kto uważa inaczej…", (text) -> "!!! " + text + " !!!");
        String Text2 = beautifier1.beautify("Nigdy nie jest za późno, by stać się tym, kim chcemy być.", (text) -> text.toUpperCase());
        String Text3 = beautifier1.beautify("Determinacja to poniesienie porażki 19 razy i odniesienie sukcesu za 20 razem.", (text) -> text.replaceAll("20 razem", "każdym kolejnym razem"));
        String Text4 = beautifier1.beautify("Fajnie jest, dobrze jest, nie rycz.", (text) -> text.substring(13));

        System.out.println(Text1 + "\n" + Text2 + "\n" + Text3 + "\n" + Text4);
    }*/
        /*//
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }*/