package com.lee.spring.test;

import com.lee.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiJing
 * @version 1.0
 */
public class AOPByAnnotationTest {

    @Test
    public void testAOPByAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.mul(2, 4);
    }
}
