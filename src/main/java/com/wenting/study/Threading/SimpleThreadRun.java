package com.wenting.study.Threading;

import java.util.concurrent.TimeUnit;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/4/1 下午7:32
 */
public class SimpleThreadRun implements  Runnable{

    public void run() {
        try {
            String msg = String.format("Thread ID: %s; Thread Name: %s",Thread.currentThread().getId(),
                    Thread.currentThread().getName());
            System.out.println(msg);
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
