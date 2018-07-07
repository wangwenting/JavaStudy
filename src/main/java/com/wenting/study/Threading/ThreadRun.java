package com.wenting.study.Threading;

import java.util.concurrent.TimeUnit;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/4/1 下午7:32
 */
public class ThreadRun  implements  Runnable{

    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
