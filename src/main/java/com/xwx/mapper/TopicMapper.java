package com.xwx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwx.entity.Item;

public interface TopicMapper {

	List<Item> getList(@Param("num")Integer num);

	List<Item> getList2(@Param("num")Integer num);

	List<Item> getList3(@Param("num")Integer num);

	List<Item> getList4(@Param("num")Integer num);

	void upd1(@Param("id")int id, @Param("votes")Integer votes);

	Item getToUpd(@Param("id")int id);

}
