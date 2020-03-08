package com.pps.threadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=1;i<=10;i++){
            executorService.execute(new TestThread(i));
        }
    }
}
