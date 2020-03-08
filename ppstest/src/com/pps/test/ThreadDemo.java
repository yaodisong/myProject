package com.pps.test;

public class ThreadDemo{

    public static void main(String[] args) {
        MyThread t1 = new MyThread("窗口一");
        MyThread t2 = new MyThread("窗口二");
        MyThread t3 = new MyThread("窗口三");
//        MyThread t4 = new MyThread("窗口三");
        //MyThread t5 = new MyThread("窗口三");

        t1.start();
        t2.start();
        t3.start();
//        t4.start();
        //t5.start();

        try {
            t1.join();
//            t2.join();
//            t3.join();
//            t4.join();
//            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyThread extends Thread{

        private static volatile int count = 10;

        public MyThread(String name) {
            super(name);
        }

        public static synchronized void increase() {
            if (count>0)
            System.out.println(Thread.currentThread().getName()+"售出："+(count) +" 票");
            count--;
        }

        @Override
        public void run() {
                while(count>0) {
                    //静态代码块锁，定义同一个对象
                    increase();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }

        }
    }





}
