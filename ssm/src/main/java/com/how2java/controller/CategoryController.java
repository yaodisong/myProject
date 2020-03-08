package com.how2java.controller;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.redis.JedisClientSingle;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController{

	@Autowired
	CategoryService categoryService;

	@Autowired
	JedisClientSingle jedisClientSingle;

	@RequestMapping("redisTest")
	@ResponseBody
	public String redisTest(){
		jedisClientSingle.set("session","123");
		return jedisClientSingle.get("session");
	}

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		if(0>page.getStart()){
			page.setStart(0);
		}
		PageHelper.offsetPage(page.getStart(),5);
		List<Category> cs= categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();
		
		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	@ResponseBody
	@RequestMapping("listCategoryJson")
	public String listCategoryJson(Page page){
		if(0>page.getStart()){
			page.setStart(0);
		}
		PageHelper.offsetPage(page.getStart(),5);
		List<Category> cs= categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();

		page.caculateLast(total);

		return JSONObject.toJSONString(cs).toString();
	}

}
