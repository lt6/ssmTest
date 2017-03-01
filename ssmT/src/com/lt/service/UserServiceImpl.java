package com.lt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lt.dao.UserMapper;
import com.lt.domain.User;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

}
