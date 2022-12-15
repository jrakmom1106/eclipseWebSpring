package com.yoon.loginHelp.security;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.Soundbank;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jakarta.annotation.Resource;

public class CustomUserDetails extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1593214568512L; // ?

	
	private String user_id;
	private String user_pw;
	private String user_nm;
	private String user_phone;
	private String user_typ;
	
	
	
	public CustomUserDetails(String username, String password,Collection<? extends GrantedAuthority> authorities) {
		super(username, password,authorities);
		// TODO Auto-generated constructor stub
	};
	
	public CustomUserDetails(Map<String, String> result ,Collection<? extends GrantedAuthority> authorities ) {
		super(result.get("USER_ID"),result.get("USER_PW"),authorities);
		System.out.println("tttt");
		System.out.println(result);
		this.setUser_id(result.get("USER_ID").toString());
		this.setUser_pw(result.get("USER_PW").toString());
		this.setUser_nm(result.get("USER_NM").toString());
		this.setUser_phone(result.get("USER_PHONE").toString());
		this.setUser_typ(result.get("USER_TYP").toString());
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_typ() {
		return user_typ;
	}

	public void setUser_typ(String user_typ) {
		this.user_typ = user_typ;
	}
	
	

}
