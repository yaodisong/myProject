package com.pps.bridgedemo;

public abstract class Shap{
    protected DrawAPI drawAPI;
    protected Shap(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
