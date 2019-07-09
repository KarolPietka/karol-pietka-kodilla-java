package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStores = new MovieStore();
        String result = movieStores.getMovies().values().stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.joining(" ! "));


        System.out.println(result);

    }
}
