package com.kk;

import static org.junit.Assert.assertTrue;

import com.kk.aop.an.HelloWorldImpl1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testAop(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldImpl1 hw1= (HelloWorldImpl1) ctx.getBean("helloWorldImpl1");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();
}
}
