package com.pps.Proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
* jdk动态代理
* */
public class DynaProxy implements InvocationHandler {

    private Object target;

    public DynaProxy (Object target){
        this.target = target;
    }

    public Object createProxyObject(){

        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("先增强");

        Object result = method.invoke(this.target, args);

        System.out.println("后增强");

        return result;
    }
}
