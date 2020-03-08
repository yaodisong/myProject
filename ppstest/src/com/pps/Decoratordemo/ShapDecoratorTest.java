package com.pps.Decoratordemo;

/*
* 装饰者模式
* */
public class ShapDecoratorTest {

    public static void main(String[] args) {
        RedShapDecorator redShapDecorator = new RedShapDecorator(new Line());
        RedShapDecorator redShapDecorator1 = new RedShapDecorator(new Circle());
        redShapDecorator.draw();
        redShapDecorator1.draw();
    }
}
