package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Supplier {
   public boolean process (OrderRequest orderRequest){

       System.out.println("Customer: " + orderRequest.getCustomer() + "\n Ordered: " + orderRequest.getProduct() + "\n Supplier: " + orderRequest.getSupplier());

       return true;
    }

}
