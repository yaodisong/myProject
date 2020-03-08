package com.pps.test;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        while (true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
