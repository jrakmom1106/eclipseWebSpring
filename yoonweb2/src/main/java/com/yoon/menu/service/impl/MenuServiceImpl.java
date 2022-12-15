package com.yoon.menu.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yoon.mapper.MenuMapper;
import com.yoon.menu.service.MenuService;

import jakarta.annotation.Resource;


@Service
public class MenuServiceImpl implements MenuService{

	@Resource
	private MenuMapper menuMapper;

	@Override
	public List<Map<String,String>> menuTest() throws SQLException {
		// TODO Auto-generated method stub
		List<Map<String,String>> result = menuMapper.menuTest();
		
		System.out.println("tetet");
		System.out.println(result);
		return result;
	}
	
	
	

}
