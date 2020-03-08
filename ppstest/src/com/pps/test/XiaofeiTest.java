package com.pps.test;


public class XiaofeiTest {
    static class Resource{  //生产者和消费者都要操作的资源
        private String name;
        private int count=1;
        private boolean flag=false;

        public void set(String name){
            synchronized(Resource.class){
                try {
                    while (flag)
                        Resource.class.wait();
                    this.name=name+"---"+count++;
                    System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
                    flag=true;
                    Resource.class.notifyAll();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                }
            }

        }
        public void out(){
            synchronized (Resource.class){
                try {
                    while (!flag)
                        Resource.class.wait();
                    System.out.println(Thread.currentThread().getName()+"...消费者..."+this.name);
                    flag=false;
                    Resource.class.notifyAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                }
            }


        }
    }
    static class Producer implements Runnable{
        private Resource res;
        Producer(Resource res){
            this.res=res;
        }
        public void run(){
            while(true){
                res.set("商品");
            }
        }
    }
    static class Consumer implements Runnable{
        private Resource res;
        Consumer(Resource res){
            this.res=res;
        }
        public void run(){
            while(true){
                res.out();
            }
        }
    }
    public static void main(String[] args){
            Resource r=new Resource();
            Producer pro=new Producer(r);
            Consumer con=new Consumer(r);
            Thread t1=new Thread(pro);
            Thread t2=new Thread(con);
            t1.start();
            t2.start();
    }//运行结果正常，生产者生产一个商品，紧接着消费者消费一个商品。
}
