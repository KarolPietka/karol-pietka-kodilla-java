package com.kodilla.good.patterns.challenges.Food2Door;


public class OrderRequestRetrieve {

    public OrderRequest retrieve1() {
        Customer customer1 = new Customer("Karol", "Piętka");
        Supplier supplier1 = new ExtraFoodShop();
        Product product1 = new Product("Rise", 2, 2);

        return new OrderRequest(customer1, product1, supplier1);
    }

    public OrderRequest retrieve2() {
        Customer customer2 = new Customer("Karol", "Piętka");
        Supplier supplier2 = new GlutenFreeShop();
        Product product2 = new Product("Milk", 6, 4);

        return new OrderRequest(customer2, product2, supplier2);
    }

    public OrderRequest retrieve3() {
        Customer customer3 = new Customer("Karol", "Piętka");
        Supplier supplier3 = new HealthyShop();
        Product product3 = new Product("Carrot", 5, 5);

        return new OrderRequest(customer3, product3, supplier3);
    }
}