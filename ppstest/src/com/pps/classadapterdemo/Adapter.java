package com.pps.classadapterdemo;
/*
* 类适配器设计模式
*
* */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is the targetable method...");
    }
}
