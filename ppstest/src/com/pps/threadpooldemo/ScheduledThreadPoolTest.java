package com.pps.threadpooldemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest{
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        for (int i=1;i<=10;i++){
            scheduledExecutorService.scheduleAtFixedRate(new TestThread(i),0,2, TimeUnit.SECONDS);
        }
    }
}
