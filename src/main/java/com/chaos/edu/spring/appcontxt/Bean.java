package com.chaos.edu.spring.appcontxt;

import org.springframework.beans.factory.annotation.Autowired;

public class Bean {

	private Item item;
	
	public static Bean newInstance() {
		return new Bean("A new bean created by static newInstance()");
	}
	
	public Bean() {}
	
	public Bean(String name) {
		this.name = name;
	}
	
	public Bean(String name, Bean nextBean) {
		this.name = name;
		this.nextBean = nextBean;
	}
	
	private Bean nextBean;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean getNextBean() {
		return nextBean;
	}

	public void setNextBean(Bean nextBean) {
		this.nextBean = nextBean;
	}
	
	public Item getItem() {
		return item;
	}

	@Autowired
	public void setItem(Item item) {
		this.item = item;
	}
}
