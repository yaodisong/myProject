package com.pps.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        Class clazz = e.getClass();
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field field:declaredFields) {
//            System.out.println(field);
//        }
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method method:declaredMethods) {
//            System.out.println(method);
//        }
        try {
            Constructor constructor = clazz.getConstructor(String.class, int.class, double.class);
            Object obj = constructor.newInstance("张三", 18, 20.00);
            Method raiseSalary = clazz.getDeclaredMethod("raiseSalary", double.class);
            Method getSalary = clazz.getDeclaredMethod("getSalary");
            raiseSalary.invoke(obj,20.00);
            System.out.println(getSalary.invoke(obj));
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e1) {
            e1.printStackTrace();
        }
    }
}