package com.pps.Decoratordemo;

public abstract class ShapDecorator implements Shap{

    protected Shap ShapDecorator;

    public ShapDecorator(Shap shapDecorator){
        this.ShapDecorator = shapDecorator;
    }

    @Override
    public void draw() {
        ShapDecorator.draw();
    }
}
