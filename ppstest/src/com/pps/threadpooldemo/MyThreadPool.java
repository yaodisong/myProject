package com.pps.threadpooldemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    ThreadPoolExecutor pool = null;
    public void initThreadPool(){
        pool = new ThreadPoolExecutor(
                10,
                30,
                30,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10),
                new MyThreadFactory(),
                new CustomRejectedExecutionHandler());
    }
    public ThreadPoolExecutor getMyThreadPool(){
        return this.pool;
    }
    public void destory() {
        if(pool != null) {
            pool.shutdownNow();
        }
    }

}
