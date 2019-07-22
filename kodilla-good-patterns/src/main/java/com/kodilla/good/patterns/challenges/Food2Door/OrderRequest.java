package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class OrderRequest {
    private  Customer customer;
    private Supplier supplier;
    private Product product;

    public OrderRequest(Customer customer, Product product, Supplier supplier) {
        this.customer = customer;
        this.product = product;
        this.supplier = supplier;
    }

    public Customer getCustomer() {
        return customer;
    }
    public Product getProduct() {
        return product;
    }
    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRequest)) return false;
        OrderRequest that = (OrderRequest) o;
        return Objects.equals(customer, that.customer) &&
                Objects.equals(supplier, that.supplier) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, supplier, product);
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", supplier=" + supplier +
                ", product=" + product +
                '}';
    }
}
