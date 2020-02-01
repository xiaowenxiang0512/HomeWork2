package com.xwx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwx.entity.Item;
import com.xwx.service.TopicService;

@Controller
public class TopicController {

	@Autowired
	TopicService service;
	
	
	//你公司的项目中使用哪些数据库？   1
	@RequestMapping("list1")
	private String list1(Model model,Integer num) {
		List<Item> list = service.getList(num);
		model.addAttribute("list", list);
		model.addAttribute("num", num);
		return  "list1";
	}
	
	@RequestMapping("toupd")
	private String gettoUpd(int id,Model model) {
		Item item = service.gettoUpd(id);
		model.addAttribute("item", item);
		return "toupd1";//返回到upd1界面
	}
	
	@RequestMapping("upd1")//upd1方法
	private String upd(int id,Integer votes) {
		service.upd1(id,votes);
		return "redirect:/list1";
	}
	
	//你公司里用的Web层框架是什么？    2
	@RequestMapping("list2")
	private  String list2(Model model,Integer num) {
		List<Item> list = service.getList2(num);
		model.addAttribute("list", list);
		model.addAttribute("num", num);
		return "list2";
	}
	//你公司里用的持久层框架是什么？   3
	@RequestMapping("list3")
	private String list3(Model model,Integer num) {
		List<Item> list = service.getList3(num);
		model.addAttribute("list", list);
		model.addAttribute("num", num);
		return "list3";
	}
	
	
	//你公司使用了哪些页面UI框架？
	@RequestMapping("list4")
	private String list4(Model model,Integer num) {
		List<Item> list = service.getList4(num);
		model.addAttribute("list", list);
		model.addAttribute("num", num);
		return "list4";
	}
	
	
}
