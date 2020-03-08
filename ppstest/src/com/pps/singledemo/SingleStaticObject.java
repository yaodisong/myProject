package com.pps.singledemo;

public class SingleStaticObject {
    private static class SingleStaticHolder{
        private static final SingleStaticObject SINGLE_STATIC_OBJECT = new SingleStaticObject();
    }
    private SingleStaticObject(){}

    public SingleStaticObject getInstance(){
        return SingleStaticHolder.SINGLE_STATIC_OBJECT;
    }
}
