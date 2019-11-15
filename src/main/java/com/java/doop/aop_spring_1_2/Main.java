package com.java.doop.aop_spring_1_2;

import com.java.doop.service.OrderService;
import com.java.doop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //advice ：建议、忠告、通知
            // 在目标方法执行前后以及异常等时候，执行的逻辑，实现相应的接口，配置好即可
            //  缺点： 只能拦截到类级别 要为每个类定义一个代理，拦截的是每个类的所有方法
//        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:spring_1_2_advice.xml");
//        UserService userService = (UserService) container.getBean("userServiceProxy");
//        userService.createUser("Tom", "Jack", 23);
//        userService.queryUser();


        //advisor ： 导师、指导教授
            // 相当于，给advice 一个指导，在执行那些方法的时候才执行 advice里面的逻辑 配置的时候配置advisor即可，advice配置在advisor里面
            // 缺点： 要为每个类定义代理，获取的时候要 要获取代理类。
//        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:spring_1_2_advisor.xml");
//        UserService userService = (UserService) container.getBean("userServiceProxy");
//        OrderService orderService = (OrderService) container.getBean("orderServiceProxy");
//        userService.createUser("Tom", "Jack", 23);
//        userService.queryUser();
//        orderService.createOrder("xieyingge", "iphone xs max");
//        orderService.queryOrder("iphone");

        //Bean Name auto proxy creator
            //autoproxy：从名字我们也可以看出来，它是实现自动代理，也就是说当 Spring 发现一个 bean 需要被切面织入的时候，
            // Spring 会自动生成这个 bean 的一个代理来拦截方法的执行，确保定义的切面能被执行。
        // 使用的时候不用关心代理，直接使用原来的类型就可以了，支持模式匹配
//        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:spring_1_2_DefaultAdvisorAutoProxy.xml");
//        UserService userService = container.getBean(UserService.class);
//        OrderService orderService = container.getBean(OrderService.class);
//        userService.createUser("Tom", "Jack", 23);
//        userService.queryUser();
//        orderService.createOrder("xieyingge", "iphone xs max");
//        orderService.queryOrder("iphone");


    }

}
