package com.kodilla.good.patterns.challenges;

public class OrderRequestRetrieve {

    public Order retrieve () {
        User user = new User("Karol", "Piętka");
        Product product = new Product("Bike", 2000,2);

        return new Order(user, product);
    }
}
