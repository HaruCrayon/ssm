package com.lee.spring.test;

import com.lee.spring.pojo.Clazz;
import com.lee.spring.pojo.Person;
import com.lee.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiJing
 * @version 1.0
 */
public class IOCByXMLTest {
    /**
     * 获取bean的三种方式：
     * 1、根据bean的id获取
     * 2、根据bean的类型获取
     * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
     * 若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
     * 若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
     * 3、根据bean的id和类型获取
     * 结论：
     * 根据类型来获取bean时，在满足bean唯一性的前提下
     * 其实只是看：『对象 instanceof 指定的类型』的返回结果
     * 只要返回的是true就可以认定为和类型匹配，能够获取到。
     * 即通过bean的类型、bean所继承的类的类型、bean所实现的接口的类型都可以获取bean
     */
    @Test
    public void testIOC() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
//        Student student = (Student) ioc.getBean("studentOne");
//        Student student = ioc.getBean(Student.class);
//        Student student = ioc.getBean("studentOne", Student.class);
        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }

    /**
     * 依赖注入（为属性赋值）
     */
    @Test
    public void testDI() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
//        Student student = ioc.getBean("studentTwo", Student.class);
//        Student student = ioc.getBean("studentThree", Student.class);
//        Student student = ioc.getBean("studentFour", Student.class);
//        Student student = ioc.getBean("studentFive", Student.class);
        Student student = ioc.getBean("studentSix", Student.class);
        System.out.println(student);
//        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
//        System.out.println(clazzOne);
    }
}
