package com.kodilla.good.patterns.challenges.OrderService;


public class PreapreOdrer implements OrderService {
    @Override
    public boolean createOrder(final User user, final Product product, int orderQuantity){
        System.out.println( "Client: "+ user.getName() + " " + user.getSurname() + "\n" +
                            "Product Ordered: " + product.getProduct() +";" + "\n" +
                            "Quantity ordered: " + orderQuantity);

        return true;
    }
}
