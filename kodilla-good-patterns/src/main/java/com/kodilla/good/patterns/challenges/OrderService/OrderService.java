package com.kodilla.good.patterns.challenges.OrderService;

public interface OrderService {
    boolean createOrder(User user, Product product, int orderQuantity);
}
