package com.java.doop.aop_spring_2_aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class LogArgsAspect {
    // 这里可以设置一些自己想要的属性，到时候在配置的时候注入进来
    private boolean trace = true;

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    @Before("com.java.doop.aop_spring_2_aspectj.SystemArchitecture.inServiceLayer()")
    public void logArgs(JoinPoint joinPoint) {
        if (trace) {
            System.out.println("[@AspectJ]方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
        }
    }

}
