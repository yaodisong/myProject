package com.pps.factorydemo;

public abstract class AbstractFactory {
    abstract Shap getShapFactory(String type);
    abstract Color getColorFactory(String type);
}
