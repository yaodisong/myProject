package com.pps.unsynch;

import java.util.Arrays;

public class Bank {
    private final double[] accounts;

    public Bank(int n,double initialBalance){
        //初始化账户
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
    }

    public void transfer(int from,int to,double amount){
        if(accounts[from] < amount){
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f form %d to %d",amount,from,to);
            accounts[to] += amount;
            System.out.printf("Total Balance:%10.2f%n",getTotalBalance());
        }
    }

    public double getTotalBalance(){
        double sum = 0;
        for (double a:accounts)
            sum += a;
        return sum;
    }

    public int size(){
        return accounts.length;
    }
}































