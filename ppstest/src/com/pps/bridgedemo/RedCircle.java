package com.pps.bridgedemo;

public class RedCircle implements DrawAPI {


    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("画出位置在("+x+","+y+")"+radius+"px的红色圆");
    }
}
