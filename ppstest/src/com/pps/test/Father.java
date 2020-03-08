package com.pps.test;

public class Father {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Father eat");
    }

    public void method(){
        System.out.println("Father private method");
    }
}
