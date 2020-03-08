package com.how2java.springboot.web;

import com.alibaba.fastjson.JSONObject;
import com.how2java.springboot.pojo.Category;
import com.how2java.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

//import com.how2java.springboot.dao.CategoryDAO;

@Controller
public class CategoryController {
//	@Autowired
//	CategoryDAO categoryDAO;

	@Autowired
	CategoryService categoryService;
	
//    @RequestMapping("/listCategory")
//    public String listCategory(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
//
//    	start = start<0?0:start;
//
//    	Sort sort = new Sort(Sort.Direction.ASC, "id");
//    	Pageable pageable = new PageRequest(start, size, sort);
//    	Page<Category> page =categoryDAO.findAll(pageable);
//
//
////    	System.out.println(page.getNumber());
////    	System.out.println(page.getNumberOfElements());
////    	System.out.println(page.getSize());
////    	System.out.println(page.getTotalElements());
////    	System.out.println(page.getTotalPages());
//
//    	m.addAttribute("page", page);
//
//    	return "listCategory";
//    }
//
//	@RequestMapping("/addCategory")
//    public String addCategory(Category c) throws Exception {
//    	categoryDAO.save(c);
//    	return "redirect:listCategory";
//    }
//
//    @RequestMapping("/deleteCategory")
//    public String deleteCategory(Category c) throws Exception {
//    	categoryDAO.delete(c);
//    	return "redirect:listCategory";
//    }
//
//    @RequestMapping("/updateCategory")
//    public String updateCategory(Category c) throws Exception {
//    	categoryDAO.save(c);
//    	return "redirect:listCategory";
//    }
//
//    @RequestMapping("/editCategory")
//    public String ediitCategory(int id,Model m) throws Exception {
//    	Category c= categoryDAO.getOne(id);
//    	m.addAttribute("c", c);
//    	return "editCategory";
//    }

    /*
    * mybatis查询全部种类信息(用于前后端分离返回json数据)
    * */
    @ResponseBody
	@RequestMapping("/listAllCategoryJson")
	public String listAllCategory() throws Exception {
		List<Map<Integer, Category>> cs= categoryService.findAll();
		return JSONObject.toJSONString(cs);
	}

	@RequestMapping("/addCategoryMybatis")
	public String addCategoryMybatis(Category c) throws Exception {
		categoryService.add(c);
		return "redirect:listCategory";
	}

	@RequestMapping("/updateCategoryMybatis")
	public String updateCategoryMybatis(Category c) throws Exception {
		categoryService.update(c);
		return "redirect:listCategory";
	}

	@RequestMapping("/deleteCategoryMybatis")
	public String deleteCategoryMybatis(Category c) throws Exception {
		categoryService.delete(c);
		return "redirect:listCategory";
	}

	@RequestMapping("/editCategoryMybatis")
	public String ediitCategoryMybatis(int id,Model m) throws Exception {
		Category c=  categoryService.get(id);
		m.addAttribute("c", c);
		return "editCategory";
	}

	@ResponseBody
	@RequestMapping("/editCategoryMybatisJson")
	public String ediitCategoryMybatisJson(int id) throws Exception {
		Map<Integer, Category> map = categoryService.getMap(id);
		return JSONObject.toJSONString(map);
	}


}

































