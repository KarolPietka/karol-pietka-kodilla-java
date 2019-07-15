package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {

    private InformationService informationService;
    private ProductService productService;
    private OrderService orderService ;

    public ProductOrderService(final InformationService informationService, final ProductService productService, final OrderService orderService) {
        this.informationService = informationService;
        this.productService = productService;
        this.orderService = orderService;
    }

    public OrderDto process(final Order order) {
        boolean isOrder = productService.isOrdered(order.getUser(), order.getProduct());

        if(isOrder) {
            informationService.sendMessage(order.getUser());
            orderService.createOrder(order.getUser(), order.getProduct());
            return new OrderDto(order.getUser(), true);
            } else {
            return new OrderDto(order.getUser(), false);
            }

    }
}



