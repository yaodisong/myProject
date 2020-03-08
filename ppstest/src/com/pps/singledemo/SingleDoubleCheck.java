package com.pps.singledemo;

public class SingleDoubleCheck {

    private volatile static SingleDoubleCheck singleDoubleCheck;

    private SingleDoubleCheck(){}

    public static SingleDoubleCheck getInstance(){
        if(singleDoubleCheck==null){
            synchronized (SingleDoubleCheck.class){
                if(singleDoubleCheck==null){
                    singleDoubleCheck = new SingleDoubleCheck();
                }
            }
        }
        return singleDoubleCheck;
    }
}
