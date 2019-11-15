package com.java.doop.aop_spring_2_schema_based;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class LogArgsAspect {
    // 这里可以设置一些自己想要的属性，到时候在配置的时候注入进来

    public void logArgs(JoinPoint joinPoint) {
        System.out.println("[schema-based]方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
    }
}
