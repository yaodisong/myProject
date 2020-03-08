package com.pps.test;

import java.util.concurrent.FutureTask;

public class ThreadTest {
    public static void main(String[] args) {
//        Thread t = new Thread(() -> System.out.println("Runnable线程启动"));
//        Thread t1 = new Thread();
//        t.start();
//        t1.start();
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
    }
}
