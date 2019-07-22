package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Supplier {
    public boolean process (OrderRequest orderRequest){
        System.out.println("Thank You " + orderRequest.getCustomer() + ". You bought " + orderRequest.getProduct() + "Your order is prepare by " + orderRequest.getSupplier());

        return true;
    }
}
