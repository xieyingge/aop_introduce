package com.java.doop.aop_spring_2_schema_based;

import com.java.doop.service.OrderService;
import com.java.doop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:spring_2_0_schema_based.xml");
        UserService userService = container.getBean(UserService.class);
        OrderService orderService = container.getBean(OrderService.class);
        userService.createUser("Tom", "Jack", 23);
        userService.queryUser();
        orderService.createOrder("xieyingge", "iphone xs max");
        orderService.queryOrder("iphone");
    }
}
