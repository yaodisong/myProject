package com.pps.singledemo;
/*
* 饿汉式：类加载就初始化,线程安全，容易产生垃圾对象浪费内存
* */
public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance(){
        return singleObject;
    }

    public void showMessage(){
        System.out.println("单例");
    }
}
