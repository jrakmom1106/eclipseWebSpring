package com.yoon.menu.controller;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yoon.menu.service.MenuService;

import jakarta.annotation.Resource;


@Controller
public class MenuController {
	
	
	@Resource
	private MenuService menuService;
	
	// 메인메뉴 1
	@RequestMapping(value="/menu1.do", method=RequestMethod.GET)
	@ResponseBody
    public ModelAndView urlTest() throws SQLException {
        System.out.println("Testhere");
        
        ModelAndView model = new ModelAndView();
        
        
        List<Map<String,String>> result = menuService.menuTest();
       
        System.out.println(result);
        model.setViewName("/menu/menu1");
        
        
        return model;    // JSP 경로
    }
	
//	로그인 페이지
	@RequestMapping(value="/login/login.do", method=RequestMethod.GET)
    public String login() {
		System.out.println("login start");
        return "/login/login";    // JSP 경로
    }

//	로그인 실패 페이지
	@RequestMapping(value="/login/error.do", method=RequestMethod.GET)
    public String loginError() {
		System.out.println("login error controller");
        return "/login/loginError";    // JSP 경로
    }
	
	
	
}


