package com.example.testRolando.Order;

import com.example.testRolando.Shipment.Shipment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class OrderService {
    public List<Object> getOrders() {
        return List.of(
                new Order(
                        "Order1",
                        "Prod1",
                        2.0
                ),
                new Shipment(
                        "Order1",
                        "Ship1",
                        "Prod1",
                        LocalDate.of(2021, Month.FEBRUARY, 19),
                        2.0
                )
        );
    }
}
