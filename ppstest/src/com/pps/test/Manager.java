package com.pps.test;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
