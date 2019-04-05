package com.kk.aop.an;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class TimeHandler
{
    public static final String EDP="execution(* com.kk.aop.an.HelloWorldImpl1.*(..))";
    @Before(EDP)
    public void printTime()
    {
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }
}
