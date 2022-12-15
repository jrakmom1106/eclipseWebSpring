package com.yoon.loginHelp.security;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException,
	ServletException {
		HttpSession session = request.getSession();
		
		String errorMsg = (String)exception.getMessage();
		
		session.setAttribute("errorMsg", errorMsg);
		session.setAttribute("userID", request.getParameter("username"));
		
		logger.debug("로그인에 실패하였습니다. 로그인 아이디 : " +request.getParameter("username") );
		logger.debug("원인: " + errorMsg );
		
		super.onAuthenticationFailure(request, response, exception);
		
	}

}
