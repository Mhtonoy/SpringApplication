package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev1 = (Dev) context.getBean("dev1");
//        Dev dev2 = (Dev) context.getBean("dev2");
        dev1.build();
    }
}
