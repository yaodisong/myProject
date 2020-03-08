package com.pps.prototypedemo;

public class Circle extends Shap {

    public Circle(){
        type = "circle";
    }
    @Override
    void draw() {
        System.out.println("circle");
    }
}
