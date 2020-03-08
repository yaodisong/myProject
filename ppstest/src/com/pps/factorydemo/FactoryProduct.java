package com.pps.factorydemo;

public class FactoryProduct {
    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("shap")){
            return new ShapFactory();
        }else if(type.equalsIgnoreCase("color")){
            return new ColorFactory();
        }else {
            return null;
        }
    }
}
