package com.lee.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author LiJing
 * @version 1.0
 */

@Component
@Aspect
@Order(1)
public class ValidateAspect {

    //@Before("execution(* com.lee.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("com.lee.spring.aop.annotation.LogAspect.pointCut()")
    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");
    }
}
