package com.pps.prototypedemo;

public class PrototypeTest {
    public static void main(String[] args) {
        ShapCache.loadCache();
        Shap shap = ShapCache.getShap(1);
        System.out.println(shap.getType());
        Shap shap1 = ShapCache.getShap(2);
        System.out.println(shap1.getType());
        Shap shap2 = ShapCache.getShap(3);
        System.out.println(shap2.getType());
    }
}
