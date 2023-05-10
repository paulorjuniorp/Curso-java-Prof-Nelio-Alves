package org.example.exercicio10enum;

import org.example.exercicio10enum.entities.Order;
import org.example.exercicio10enum.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
