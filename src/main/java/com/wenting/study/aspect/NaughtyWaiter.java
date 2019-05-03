package com.wenting.study.aspect;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2019/5/1 9:51 PM
 */
public class NaughtyWaiter implements Waiter {

    public void greetTo(String clientName) {
        System.out.println("NaughtyWaiter:greet to " + clientName + "...");
    }

    public void serveTo(String clientName) {
        System.out.println("NaughtyWaiter:serving " + clientName + "...");
    }

    public void joke(String clientName, int times) {
        System.out.println("NaughtyWaiter:play " + times + " jokes to " + clientName + "...");
    }
}