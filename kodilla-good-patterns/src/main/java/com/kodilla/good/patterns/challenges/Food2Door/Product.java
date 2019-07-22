package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Product {
    private String productName;
    private int quantity;
    private double price;

    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "product ='" + productName + '\'' +
                ", quantity =" + quantity +
                ", price =" + price + "eur" +
                '}';
    }
}
