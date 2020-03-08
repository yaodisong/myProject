package com.pps.castdemo;

public class Generic<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Generic(T data) {
        this.data = data;
    }

    public Generic() {

    }

    public void showKeyValue(Generic<?> obj){
        System.out.println(obj.getData());
    }

    /*
    * 泛型方法
    * */
    public <T> T genericMethod(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T t = tClass.newInstance();
        return t;
    }
}
