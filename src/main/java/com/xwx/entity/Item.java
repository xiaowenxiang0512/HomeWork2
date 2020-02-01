package com.xwx.entity;

public class Item {

	private Integer id          ;//主键
	private String name        ;
	private Integer votes       ;//获得投票数
	private Integer topic_id    ;//所属投票主题
	private String tname;
	
	private Integer num;//总数
	
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVotes() {
		return votes;
	}
	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	public Integer getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", votes=" + votes + ", topic_id=" + topic_id + ", tname=" + tname
				+ "]";
	}

}
