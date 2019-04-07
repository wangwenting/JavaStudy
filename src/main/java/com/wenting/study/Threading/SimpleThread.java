package com.wenting.study.Threading;

import java.util.concurrent.TimeUnit;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/8/12 下午11:51
 */
public class SimpleThread extends Thread{

    private static final Integer NUM = 5;
    @Override
    public void run() {
        for(int i = 0; i < NUM ;i++) {
            String msg = String.format("Thread ID: %s; Thread Name: %s",Thread.currentThread().getId(),
            Thread.currentThread().getName());
            System.out.println(msg);
            System.out.println(i);
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Throw InterruptedException!");
            }
        }
    }
}
