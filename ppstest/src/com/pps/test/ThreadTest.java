package com.pps.test;

import java.util.concurrent.FutureTask;

public class ThreadTest {
    public static void main(String[] args) throws Exception {
//        Thread t = new Thread(() -> System.out.println("Runnable线程启动"));
//        Thread t1 = new Thread();
//        t.start();
//        t1.start();
        MyCallable myCallable = new MyCallable();
//        myCallable.call();//和thread.run()类似只是跑一遍方法，不是真正意义的并发
        FutureTask futureTask = new FutureTask(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
    }
}
