package com.wenting.study.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2019/5/3 8:18 PM
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject>  list = new ArrayList<OOMObject>();
        while (true) {

            list.add(new OOMObject());
            System.out.println("------");
        }
    }
}
