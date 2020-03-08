package com.pps.threadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5,new MyThreadFactory());
        executorService.submit(new TestThread(0));
        executorService.submit(new TestThread(1));
        executorService.submit(new TestThread(2));
        executorService.submit(new TestThread(3));
        executorService.shutdown();
    }
}
