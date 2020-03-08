package com.pps.threadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i=1;i<=10;i++){
            executorService.execute(new TestThread(i));
        }
        executorService.shutdown();
    }
}
