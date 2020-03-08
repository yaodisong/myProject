package com.pps.singledemo;


/*
* 懒汉式:调用后才实例化，线程不安全，无法在多线程内使用（加上同步锁后可以，但效率很低）
* */
public class SingleLazyObject {
    private static SingleLazyObject singleLazyObject;

    private SingleLazyObject(){}

    public static SingleLazyObject getInstance(){
        if(singleLazyObject==null){
            new SingleLazyObject();
        }
        return singleLazyObject;
    }

}
