package com.pps.castdemo;

public class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T add(T a, T b){
        System.out.println("a+b="+a+b);
        return a;
    }

    public static void main(String[] args) {
        GenericClass<String> genericString = new GenericClass<>();
        GenericClass<Integer> genericInteger = new GenericClass<>();
        genericString.setData("Generic Class");
        genericInteger.setData(1);
        System.out.println(genericString.getData());
        System.out.println(genericInteger.getData());
        System.out.println(genericString.add("a","b"));
        System.out.println(genericInteger.add(1,2));
    }
}
