package com.how2java.springboot.service.impl;

import com.how2java.springboot.mapper.CategoryMapper;
import com.how2java.springboot.pojo.Category;
import com.how2java.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Map<Integer, Category>> findAll() {

        return categoryMapper.findAll();
    }

    @Override
    public int add(Category category) {
        int add = categoryMapper.add(category);
        if(0 != add){
            return 1;
        }else
        return 0;
    }

    @Override
    public void delete(Category category) {
        categoryMapper.delete(category);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }

    @Override
    public int update(Category category) {
        int update = categoryMapper.update(category);
        if(0 != update){
            return 1;
        }else
        return 0;
    }

    @Override
    public Map<Integer, Category> getMap(int id) {
        return categoryMapper.getMap(id);
    }
}





































