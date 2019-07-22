package com.kodilla.good.patterns.challenges.Food2Door;



public class OrderProcessor {

    public OrderService orderService;

    public OrderProcessor(OrderService orderService){
        this.orderService = orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public OrderDto processing(final OrderRequest orderRequest){

        boolean isOrdered =orderService.createOrder(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getSupplier());

        if (isOrdered){
            orderService.createOrder(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getSupplier());
            return new OrderDto(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getSupplier(),true);
        }else{
            return new OrderDto(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getSupplier(),false);
        }
    }

}
