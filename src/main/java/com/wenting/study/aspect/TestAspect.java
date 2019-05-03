package com.wenting.study.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2019/5/1 9:53 PM
 */
@Aspect
public class TestAspect {
    //与非运算
    @Before("!target(com.wenting.study.aspect.NaiveWaiter) && execution(* serveTo(..))")
    public void notServeInNaiveWaiter(){
        System.out.println("--notServeInNaiveWaiter() executed!--");
    }
    //与运算
    @After("within(com.wenting.study.aspect.*) && execution(* greetTo(..))")
    public void greetToFun(){
        System.out.println("--greetToFun() executed!--");
    }
    //或运算
    @AfterReturning("target(com.wenting.study.aspect.Waiter)")
    public void waiterOrSeller(){
        System.out.println("--waiterOrSeller() executed!--");
    }

    public static void main(String[] args) {
        String configPath = "classpath:/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("John");
        naiveWaiter.serveTo("John");
        naughtyWaiter.greetTo("Tom");
        naughtyWaiter.serveTo("Tom");

        naiveWaiter.serveTo("wenting");
    }
}