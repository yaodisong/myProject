package com.pps.factorydemo;

public class FactoryTest{
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProduct.getFactory("shap");
        Shap point = abstractFactory.getShapFactory("point");
        Shap line = abstractFactory.getShapFactory("line");
        Shap circle = abstractFactory.getShapFactory("circle");
        point.draw();
        line.draw();
        circle.draw();
        AbstractFactory abstractFactory1 = FactoryProduct.getFactory("color");
        Color red = abstractFactory1.getColorFactory("red");
        Color yellow = abstractFactory1.getColorFactory("yellow");
        Color blue = abstractFactory1.getColorFactory("blue");
        red.fill();
        yellow.fill();
        blue.fill();


    }
}
