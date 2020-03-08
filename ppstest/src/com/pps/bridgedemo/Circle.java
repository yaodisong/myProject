package com.pps.bridgedemo;

public class Circle extends Shap{

    private int x,y,radius;
    public Circle(int radius,int x,int y,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius,x,y);
    }
}
