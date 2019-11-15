package com.java.doop.aop_spring_2_aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class LogResultAspect {

    // 这里可以设置一些自己想要的属性，到时候在配置的时候注入进来
    private boolean trace = true;

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    @AfterReturning(pointcut = "com.java.doop.aop_spring_2_aspectj.SystemArchitecture.inServiceLayer()",returning = "result")
    public void logResult(Object result){
        if (trace) {
            System.out.println("[@AspectJ]返回值：" + result);
        }
    }

//    @After("com.java.doop.aop_spring_2_aspectj.SystemArchitecture.inServiceLayer()")
//    public void logResultAfter(JoinPoint result){
//        if (trace) {
//
//            System.out.println("[@AspectJ]canshu：" + Arrays.toString(result.getArgs()));
//        }
//    }
}
