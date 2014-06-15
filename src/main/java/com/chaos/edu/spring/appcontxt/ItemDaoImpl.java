package com.chaos.edu.spring.appcontxt;

import java.util.Arrays;
import java.util.List;

public class ItemDaoImpl implements ItemDao {

	@Override
	public List<Item> findAll() {
		return Arrays.asList(new Item("A"), new Item("B"));
	}
	
}
