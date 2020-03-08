package com.pps.Proxydemo;

public class Line implements Shap {
    @Override
    public void draw() {
        System.out.println("draw line");
    }

    @Override
    public void descrip() {
        System.out.println("line");
    }
}
