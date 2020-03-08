package com.pps.factorydemo;

public class ColorFactory extends AbstractFactory {
    @Override
    Shap getShapFactory(String type) {
        return null;
    }

    @Override
    Color getColorFactory(String type) {
        if(type.equalsIgnoreCase("red")){
            return new Red();
        }else if(type.equalsIgnoreCase("yellow")){
            return new Yellow();
        }else if(type.equalsIgnoreCase("blue")){
            return new Blue();
        }else {
            return null;
        }
    }
}
