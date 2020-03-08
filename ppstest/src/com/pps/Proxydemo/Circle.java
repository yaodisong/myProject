package com.pps.Proxydemo;

public class Circle implements Shap {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void descrip() {
        System.out.println("circle");
    }
}
