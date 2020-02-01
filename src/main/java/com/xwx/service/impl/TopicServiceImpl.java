package com.xwx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.entity.Item;
import com.xwx.mapper.TopicMapper;
import com.xwx.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	TopicMapper mapper;
	
	@Override
	public List<Item> getList(Integer num) {
		return mapper.getList(num);
	}
	
	@Override
	public Item gettoUpd(int id) {
		//回显
		return mapper.getToUpd(id);
	}
	
	
	@Override
	public void upd1(int id,Integer votes) {
		//再修改
		mapper.upd1(id,votes);
	}
	
	
	@Override
	public List<Item> getList2(Integer num) {
		return mapper.getList2(num);
	}
	
	@Override
	public List<Item> getList3(Integer num) {
		return mapper.getList3(num);
	}
	
	@Override
	public List<Item> getList4(Integer num) {
		return mapper.getList4(num);
	}
	
}
