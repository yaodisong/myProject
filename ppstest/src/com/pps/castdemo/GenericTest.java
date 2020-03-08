package com.pps.castdemo;

public class GenericTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Generic<String> generic = new Generic<>("cxz");
        Generic<Integer> genericnum = new Generic<>(123);
        generic.showKeyValue(generic);
        generic.showKeyValue(genericnum);
        System.out.println(generic.genericMethod(Class.forName("com.pps.castdemo.AnimalGeneric")));
    }
}
