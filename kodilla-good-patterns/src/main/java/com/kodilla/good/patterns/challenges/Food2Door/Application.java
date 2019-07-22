package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String []arg){
        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();

        OrderRequest orderRequest1= orderRequestRetrieve.retrieve1();
        OrderRequest orderRequest2= orderRequestRetrieve.retrieve2();
        OrderRequest orderRequest3= orderRequestRetrieve.retrieve3();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderService());

        orderProcessor.processing(orderRequest1);
        System.out.println(orderRequest1.getCustomer() + "\n Ordered: " + orderRequest1.getProduct() + "\n Supplier: " + orderRequest1.getSupplier());

        orderProcessor.processing(orderRequest2);
        System.out.println("Customer: " + orderRequest2.getCustomer() + "\n Ordered: " + orderRequest2.getProduct() + "\n Supplier: " + orderRequest2.getSupplier());

        orderProcessor.processing(orderRequest3);
        System.out.println("Customer: " + orderRequest3.getCustomer() + "\n Ordered: " + orderRequest3.getProduct() + "\n Supplier: " + orderRequest3.getSupplier());

    }
    }