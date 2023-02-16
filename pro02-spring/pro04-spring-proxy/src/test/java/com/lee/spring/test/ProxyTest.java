package com.lee.spring.test;

import com.lee.spring.proxy.Calculator;
import com.lee.spring.proxy.CalculatorImpl;
import com.lee.spring.proxy.CalculatorStaticProxy;
import com.lee.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author LiJing
 * @version 1.0
 */
public class ProxyTest {
    @Test
    public void testStaticProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 5);
    }

    /**
     * 动态代理有两种：
     * 1、jdk动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口
     *   在com.sun.proxy包下，类名为$proxy2
     * 2、cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下
     */
    @Test
    public void testDynamicProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.div(3, 2);
    }
}
