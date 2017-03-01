package com.lt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lt.dao.ItemsMapper;
import com.lt.domain.Items;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Resource
	private ItemsMapper itemsMapper;
	
	public List<Items> findAll() {
		List<Items> list = 	itemsMapper.findAll();
		return list;
	}

	public Items findByID(Integer id) {
		Items items = itemsMapper.selectByPrimaryKey(id);
		return items;
	}

	public void saveOrUpdate(Items items) {
		
		itemsMapper.updateByPrimaryKey(items);
		
	}

	public void deleteByID(Integer id) {
		itemsMapper.deleteByPrimaryKey(id);
	}

}
