package com.yoon.loginHelp.security;

import java.io.IOException;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	private String defaultDeniedUrl;
	
	public String getDefultDeniedUrl() {
		return defaultDeniedUrl;
	}
	
	
	public void setDefaultDeniedUrl(String defaultDeniedUrl) {
		this.defaultDeniedUrl = defaultDeniedUrl;
	}
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher(getDefultDeniedUrl()).forward(request, response);
		
	}
	
	
	
}