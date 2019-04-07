package com.wenting.study.Threading;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/8/12 下午11:53
 */
public class Main {

    public static void SimpleThread()
    {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();
        simpleThread1.start();
        simpleThread2.start();

    }

    public static void SimpleTreadRun() {
        SimpleThreadRun simpleThreadRun = new SimpleThreadRun();
        Thread t = new Thread(simpleThreadRun);
        t.start();
    }

    public static void main(String[] args) {
        SimpleThread();

        SimpleTreadRun();
    }
}