package com.wenting.study.Threading;

import com.wenting.study.exception.MyUncaughtExceptionHandler;

import java.util.concurrent.ThreadFactory;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/4/1 下午8:23
 */
public class HandlerThreadFactory implements ThreadFactory {

    public Thread newThread(Runnable a) {
        Thread t = new Thread(a);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        return t;
    }
}
