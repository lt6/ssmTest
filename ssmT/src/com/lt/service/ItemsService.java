package com.lt.service;

import java.util.List;

import com.lt.domain.Items;

public interface ItemsService {
	List<Items> findAll();

	Items findByID(Integer id);

	void saveOrUpdate(Items items);

	void deleteByID(Integer id);
}
