package com.pps.enumdemo;

public class EnumTest {
    public static void main(String[] args) {
        //遍历枚举类
        for (EnumDemo e : EnumDemo.values()){
            System.out.println(e.toString());
        }
        System.out.println(EnumDemo.FRI);
        System.out.println(EnumDemo.FRI.compareTo(EnumDemo.MON));
        System.out.println(EnumDemo.FRI.ordinal());
        EnumDemo.doit(EnumDemo.FRI);
        EnumDemo e = EnumDemo.valueOf("TUS");
        System.out.println(e);
    }
}
