package com.pps.prototypedemo;

import java.util.Hashtable;

public class ShapCache {
    private static Hashtable<Integer,Shap> shapCache = new Hashtable<>();

    public static Shap getShap(Integer shapId){
        return shapCache.get(shapId).clone();
    }

    public static void loadCache(){
        Point point = new Point();
        point.setId(1);
        point.setType("point");
        shapCache.put(point.getId(),point);
        Line line = new Line();
        line.setId(2);
        line.setType("line");
        shapCache.put(line.getId(),line);
        Circle circle = new Circle();
        circle.setId(3);
        circle.setType("circle");
        shapCache.put(circle.getId(),circle);
    }
}
