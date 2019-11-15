package com.java.doop.aop_spring_2_aspectj;

import com.java.doop.service.OrderService;
import com.java.doop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //@AspectJ 方式
        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:spring_2_0_aspectj.xml");
        UserService userService = container.getBean(UserService.class);
        OrderService orderService = container.getBean(OrderService.class);
        userService.createUser("Tom", "Jack", 23);
        userService.queryUser();
        orderService.createOrder("xieyingge", "iphone xs max");
        orderService.queryOrder("iphone");
    }
}
