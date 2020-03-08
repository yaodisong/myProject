package com.pps.Proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 代理模式
* */
public class ProxyTest {

    public static void main(String[] args) {
//        ProxyTest proxyTest = new ProxyTest();
//        proxyTest.test();
        Shap line = new Line();
        DynaProxy dynaProxy = new DynaProxy(line);
        Object proxyObject = dynaProxy.createProxyObject();
        Shap shap = (Shap) proxyObject;
        shap.draw();
        shap.descrip();
    }

    public void test(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            System.out.println("你好！！！！");//注意这里添加了一点小逻辑
            return "Hello";
        };
        Object o = Proxy.newProxyInstance(classLoader,new Class[]{A.class,B.class},invocationHandler);
        A a = (A) o;
        B b = (B) o;
        a.toString();//注意这里调用了toString()方法
        b.getClass();//注意这里调用了getClass()方法
        //这里在A接口中添加了一个方法public Object aaa(String s1, int i);
        Object hello = a.aaa("Hello", 100);
        System.out.println(o.getClass());//这里看一下代理对象是什么
        System.out.println(hello);//这里看一下返回值是什么
    }


}
