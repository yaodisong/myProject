package com.pps.threadlocaldemo;

public class ThreadLocalDemo {

    private static ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(() -> 0);

    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0;i<3;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int value = integerThreadLocal.get();
                System.out.println(Thread.currentThread().getName() + ":" + value);
                integerThreadLocal.set(value + 1);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
    }
}
