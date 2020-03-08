package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CategoryMapper {

    List<Map<Integer,Category>> findAll();

    int add(Category category);

    void delete(Category category);

    Category get(int id);

    int update(Category category);

    Map<Integer,Category> getMap(int id);
}