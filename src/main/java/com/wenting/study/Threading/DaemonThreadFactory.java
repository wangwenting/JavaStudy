package com.wenting.study.Threading;

import java.util.concurrent.ThreadFactory;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2018/4/1 下午7:42
 */
public class DaemonThreadFactory implements ThreadFactory {

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }

}
