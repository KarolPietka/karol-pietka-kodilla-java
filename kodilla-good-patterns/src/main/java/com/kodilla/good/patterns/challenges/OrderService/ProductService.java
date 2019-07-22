package com.kodilla.good.patterns.challenges.OrderService;

public interface ProductService {
    boolean isOrdered(User user, Product product, int orderQuantity);
}