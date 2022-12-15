package com.yoon.loginHelp.security;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yoon.user.service.UserService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

public class CustomAuthenticationProvider implements AuthenticationProvider{
	
	final Logger logger = LoggerFactory.getLogger(getClass());

	
	@Resource
	private UserService userService;
	
	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);	
		}

	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
//		HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();

		String username = (String) authentication.getPrincipal();
		String password = (String) authentication.getCredentials();
		
		
		logger.debug("고객번호/비밀번호. {}/{}", username,password);
		
		Map<String,String> param = new HashMap<>();
		param.put("username", username);
		param.put("password", password);
		
		try {
			
			List<Map<String,String>> userInfo = userService.getUserInfo(param);
			
			if(userInfo.get(0) != null) {
				System.out.println("success login1");
				System.out.println(userInfo.get(0).toString());
				
				List<GrantedAuthority> roles = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN");
				System.out.println("success login2");
				System.out.println(roles.toString());
				UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(username,password,roles);
				System.out.println("success login3");
				System.out.println(result.toString());
				result.setDetails(new CustomUserDetails(userInfo.get(0),roles));
				System.out.println("success login4");
				System.out.println(result);
				return result;
				
			}else {
				throw new BadCredentialsException("미가입 사용자");
			}
			
			
		}catch (Exception e) {
			throw new BadCredentialsException(e.toString(), e);
		}
		
		
		
		
		
		
		
		
	}
	
	
}
