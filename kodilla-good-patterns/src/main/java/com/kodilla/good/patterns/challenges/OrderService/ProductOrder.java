package com.kodilla.good.patterns.challenges.OrderService;

public class ProductOrder implements ProductService {
    @Override
    public boolean isOrdered(User user, Product product, int orderQuantity) {
        return true;
    }
}
