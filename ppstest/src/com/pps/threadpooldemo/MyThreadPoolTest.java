package com.pps.threadpooldemo;

import java.util.concurrent.ExecutorService;

public class MyThreadPoolTest {
    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool();
        myThreadPool.initThreadPool();
        ExecutorService executorService = myThreadPool.getMyThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new TestThread(i));
        }
    }
}
