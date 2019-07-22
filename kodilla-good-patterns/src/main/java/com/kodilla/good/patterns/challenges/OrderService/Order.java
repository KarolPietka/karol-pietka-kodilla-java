package com.kodilla.good.patterns.challenges.OrderService;

public class Order {
    private User user;
    private Product product;
    private int orderQuantity;

    public Order(User user, Product product, int orderQuantity) {
        this.user = user;
        this.product = product;
        this.orderQuantity = orderQuantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }
}
