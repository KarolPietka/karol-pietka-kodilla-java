package com.kodilla.good.patterns.challenges.OrderService;

public class OrderRequestRetrieve {

    public Order retrieve () {
        User user = new User("Karol", "Piętka");
        Product product = new Product("Bike", 2000,5);

        return new Order(user, product, 3);
    }
}
