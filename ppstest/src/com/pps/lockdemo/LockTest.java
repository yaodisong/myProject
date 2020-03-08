package com.pps.lockdemo;

public class LockTest{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyMission());
        Thread t2 = new Thread(new MyMission());
        t1.start();
        t2.start();
    }
}
