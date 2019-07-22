package com.kodilla.good.patterns.challenges.OrderService;


public class Main {

    public static void main(String[] args) {
       OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
       Order orderRequest = orderRequestRetrieve.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MessageService(), new ProductOrder(), new PreapreOdrer());
        productOrderService.process(orderRequest);
    }
}

        /* 13.1
        MovieStore movieStores = new MovieStore();
        String result = movieStores.getMovies().values().stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.joining(" ! "));


        System.out.println(result);

    }*/

