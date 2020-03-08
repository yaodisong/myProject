package com.pps.test;

public class Ooptest {
    public static void main(String[] args) {
        Human hm = new Man();//向上转型
        Man m = (Man) hm;//向下转型
        hm.talk();
        System.out.println(calTotal(99));
        System.out.println(sum(5));
    }
    public static int calTotal(int count){
        if(count <= 0){
            return 0;
        }else {
            return count+calTotal(count-1);
        }
    }
    public static int sum(int n){
        if(n==0) {
            return 1;//数学规定0的阶乘为1
        }else {
            return n*sum(n-1);//自己调用自己的方法
        }

    }
}
