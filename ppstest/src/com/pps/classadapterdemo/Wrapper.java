package com.pps.classadapterdemo;

/*
* 对象适配器设计模式(通过持有需要解决兼容性的类)
* */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source){
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method...");
    }
}
