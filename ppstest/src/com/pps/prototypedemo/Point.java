package com.pps.prototypedemo;

public class Point extends Shap {

    public Point(){
        type = "point";
    }
    @Override
    void draw() {
        System.out.println("point");
    }
}
