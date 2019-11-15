package com.java.doop.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitecture {

    @Pointcut("within(com.java.doop.service..*)")
    public void inServiceLayer(){}

//    @Pointcut("within(com.javadoop.springaoplearning.dao..*)")
//    public void inDataAccessLayer() {}



//    @Pointcut("execution(* com.javadoop.springaoplearning.dao.*.*(..))")
//    public void dataAccessOperation() {}
}
