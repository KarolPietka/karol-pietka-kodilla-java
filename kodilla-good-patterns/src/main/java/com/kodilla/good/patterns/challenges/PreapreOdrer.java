package com.kodilla.good.patterns.challenges;


public class PreapreOdrer implements OrderService {
    @Override
    public boolean createOrder(final User user, final Product product){
        System.out.println( "Client: "+ user.getName() + " " + user.getSurname() + "\n" +
                            "Product Ordered: " + product.getProduct() +";" + "\n" +
                            "Quantity ordered: " + product.getQuantity());

        return true;
    }
}
