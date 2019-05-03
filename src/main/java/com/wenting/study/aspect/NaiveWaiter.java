package com.wenting.study.aspect;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2019/5/1 9:50 PM
 */
public class NaiveWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("NaiveWaiter：greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("NaiveWaiter：serving to " + name + "...");
    }

    public void smile(String clientName,int times){
        System.out.println("NaiveWaiter:smile to  "+clientName+ times+"times...");
    }
}
