package com.example.testRolando.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/getOrderDetails")
public class OrderController {
private final OrderService orderService;
@Autowired
    public OrderController(OrderService orderService){this.orderService = orderService;}
@GetMapping
    public List<Object> getOrders() {return orderService.getOrders();}
}
