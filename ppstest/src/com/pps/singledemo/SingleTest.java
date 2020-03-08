package com.pps.singledemo;

public class SingleTest {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        SingleObject singleObject1 = SingleObject.getInstance();
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(singleObject==singleObject1);
        System.out.println(o==o1);
    }
}
