package com.pps.Decoratordemo;

public class RedShapDecorator extends ShapDecorator {

    public RedShapDecorator(Shap shapDecorator) {
        super(shapDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setShapDecorator();
    }

    public void setShapDecorator(){
        System.out.println("draw RedShap");
    }
}
