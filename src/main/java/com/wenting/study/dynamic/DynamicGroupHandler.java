package com.wenting.study.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author wangwenting
 * @Date 2017/6/23 下午10:53
 */
public class DynamicGroupHandler implements InvocationHandler{

    public Object bind(ClassLoader classLoader, Class<?> serviceClass) {
        return Proxy.newProxyInstance(classLoader, new Class[] { serviceClass }, this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("just DynamicGroupHandler");

        return "group";

    }
}
