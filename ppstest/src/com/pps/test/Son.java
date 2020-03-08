package com.pps.test;

public class Son extends Father{
    private String name;
    private Integer age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Son eat");
    }

    public void method(){
        System.out.println("Son private method");
    }
}
