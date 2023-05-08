package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class UserEntity {
	@Id
	@GeneratedValue
	private int userid;
	private String username;
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String userpass;
	private String usercode;
	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", username=" + username + ", userpass=" + userpass + ", usercode="
				+ usercode + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUsercode() {
		return usercode;
	}

	
	}


