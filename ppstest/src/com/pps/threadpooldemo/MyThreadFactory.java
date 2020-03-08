package com.pps.threadpooldemo;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        System.out.println("创建线程"+Thread.currentThread().getName());
//        t.setDaemon(true);
        return t;
    }
}
