package com.pps.prototypedemo;

public class Line extends Shap {

    public Line(){
        type = "line";
    }
    @Override
    void draw() {
        System.out.println("line");
    }
}
