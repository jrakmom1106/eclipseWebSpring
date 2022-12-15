package com.yoon.user.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yoon.mapper.UserMapper;
import com.yoon.user.service.UserService;

import jakarta.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<Map<String, String>> getUserInfo(Map<String,String>mapData) throws SQLException {
		// TODO Auto-generated method stub
		return userMapper.getUserInfo(mapData);
	}

}
