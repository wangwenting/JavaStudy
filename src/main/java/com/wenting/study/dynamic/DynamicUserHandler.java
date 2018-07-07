package com.wenting.study.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author wangwenting
 * @Date 2017/6/23 下午10:34
 */
public class DynamicUserHandler implements InvocationHandler {

    public Object target;

    public Object bind(ClassLoader classLoader, Class<?> serviceClass, Object target) {
        this.target = target;
        return Proxy.newProxyInstance(classLoader, new Class[] { serviceClass }, this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);

        System.out.println(result);
        System.out.println("DynamicUserHandler");

        return result;
    }

}
