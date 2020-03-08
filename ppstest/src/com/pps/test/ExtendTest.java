package com.pps.test;

public class ExtendTest {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        f.eat();
        s.eat();
        Father fs = new Son();
        fs.eat();
        s.method();
    }
}
