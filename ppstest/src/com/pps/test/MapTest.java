package com.pps.test;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
//        LinkedList<HashMap<String,Employee>> staff = new LinkedList<>
        List<Map> list = new ArrayList<>();
        Map<String,Employee> map = new LinkedHashMap<>();
        map.put("1",new Employee("1"));
        map.put("2",new Employee("2"));
        map.put("3",new Employee("3"));
        list.add(map);
        System.out.println(list);
    }
}
