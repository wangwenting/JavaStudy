package com.wenting.study.data.structure;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2017/8/20 下午11:52
 */
public class Template {

    public static Comparable findMax(Comparable [] arr) {
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }

    public static <AnyType> boolean contains(AnyType [] arr, AnyType x) {
        for(AnyType anyType: arr) {
            if(anyType.equals(x)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String []args) {
        String [] strings = {"aaa", "bbb", "ccc", "ddd"};
        System.out.println(Template.findMax(strings));
        System.out.println(Template.contains(strings, "aaa"));
    }
}
