package com.cbct.rest.model;

import com.cbct.vo.UserDetailsVO;

public class LoginStatus {

	private Integer status_code;
	private String  message;
	private UserDetailsVO userDetails;
	
	public LoginStatus() {
		super();
	}

	public LoginStatus(Integer status_code, String message, UserDetailsVO userDetails) {
		super();
		this.status_code = status_code;
		this.message = message;
		this.userDetails = userDetails;
	}

	public Integer getStatus_code() {
		return status_code;
	}

	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserDetailsVO getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetailsVO userDetails) {
		this.userDetails = userDetails;
	}
	
	
	
	
	
	
}
