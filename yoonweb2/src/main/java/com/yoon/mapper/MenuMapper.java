package com.yoon.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface MenuMapper {

	public List<Map<String,String>> menuTest() throws SQLException;
	
}
