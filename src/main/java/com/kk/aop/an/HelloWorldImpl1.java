package com.kk.aop.an;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl1  {
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
        return ;
    }
}
