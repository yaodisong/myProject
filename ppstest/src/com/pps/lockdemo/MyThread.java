package com.pps.lockdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyMission implements Runnable{
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"获得锁");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName() + "释放了锁");
            lock.unlock();
        }
    }
}
