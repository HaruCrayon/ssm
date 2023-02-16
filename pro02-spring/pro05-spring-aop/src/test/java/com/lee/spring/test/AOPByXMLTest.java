package com.lee.spring.test;

import com.lee.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiJing
 * @version 1.0
 */
public class AOPByXMLTest {
    @Test
    public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(9,17);
    }
}
