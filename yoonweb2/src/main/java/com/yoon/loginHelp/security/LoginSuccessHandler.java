package com.yoon.loginHelp.security;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.util.StringUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		
		
		System.out.println("success handler inside");
		
		System.out.println(request);
		logger.debug(request.getHeader("User-Agent"));
		
		HttpSession session = request.getSession(true);
		
		CustomUserDetails detail = (CustomUserDetails)authentication.getDetails();
		
		System.out.println(detail);
		
		session.setAttribute("userName", detail.getUser_nm());
		session.setAttribute("userType", detail.getUser_typ());
		session.setAttribute("userId", detail.getUser_id());
		session.setAttribute("userPhone", detail.getUser_phone());
		
		getRedirectStrategy().sendRedirect(request, response, "/menu1.do");
		
		
		
		
		
		
		
	}
}
