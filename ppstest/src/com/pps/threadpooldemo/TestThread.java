package com.pps.threadpooldemo;

public class TestThread implements Runnable {

    private final int i;
    public TestThread(int i){
        this.i = i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
