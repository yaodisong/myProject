package com.pps.test;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(){
    }

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }
}
