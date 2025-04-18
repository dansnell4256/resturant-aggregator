package com.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.orders", "com.common"})
@EntityScan({"com.orders.model", "com.common.model"})
public final class OrdersApplication {

    private OrdersApplication() {
        // Private constructor to prevent instantiation
    }

    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }
}
