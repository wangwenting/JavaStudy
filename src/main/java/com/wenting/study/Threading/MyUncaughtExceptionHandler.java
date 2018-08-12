package com.wenting.study.Threading;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/4/1 下午8:18
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught" + e);
    }
}
