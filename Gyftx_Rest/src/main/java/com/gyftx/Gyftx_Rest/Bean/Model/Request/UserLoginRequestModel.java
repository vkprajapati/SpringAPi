package com.gyftx.Gyftx_Rest.Bean.Model.Request;

//this java class contains contain userName  and Password in JSON format will be converted
public class UserLoginRequestModel {

	private String email;
	private String password;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
