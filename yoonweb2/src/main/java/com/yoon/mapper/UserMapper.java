package com.yoon.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public List<Map<String, String>> getUserInfo(Map<String, String> mapData);

}
