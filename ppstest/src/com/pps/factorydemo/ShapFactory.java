package com.pps.factorydemo;

public class ShapFactory extends AbstractFactory{
    public ShapFactory(){

    }
//    public Shap getProduct(String type){
//        if(type.equalsIgnoreCase("point")){
//            return new Point();
//        }else if(type.equalsIgnoreCase("line")){
//            return new Line();
//        }else if(type.equalsIgnoreCase("circle")){
//            return new Circle();
//        }else {
//            throw new NullPointerException("空指针");
//        }
//    }

    @Override
    Shap getShapFactory(String type) {
        if(type.equalsIgnoreCase("point")){
            return new Point();
        }else if(type.equalsIgnoreCase("line")){
            return new Line();
        }else if(type.equalsIgnoreCase("circle")){
            return new Circle();
        }else {
            throw new NullPointerException("空指针");
        }
    }

    @Override
    Color getColorFactory(String type) {
        return null;
    }
}
