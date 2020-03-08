package com.how2java.springboot.service;

import com.how2java.springboot.pojo.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    List<Map<Integer, Category>> findAll();

    int add(Category category);

    void delete(Category category);

    Category get(int id);

    int update(Category category);

    Map<Integer,Category> getMap(int id);
}
