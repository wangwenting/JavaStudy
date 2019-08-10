package com.wenting.study.gc;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2019/5/4 5:57 PM
 */
public class TestAllocation {

    private static  final int _1MB = 1024 * 1024;

    public static void main(String []args)  throws InterruptedException {
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte [2 * _1MB];

        allocation2 = new byte [2 * _1MB];

        allocation3 = new byte [2 * _1MB];

        allocation4 = new byte [6 * _1MB];

        allocation1 = new byte [2 * _1MB];
    }
}
