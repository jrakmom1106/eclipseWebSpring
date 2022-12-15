package com.yoon.user.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserService {


	public List<Map<String, String>> getUserInfo(Map<String, String> mapData) throws SQLException;
}
