package com.gyftx.Gyftx_Rest.Shared.DataTransferObject;

import java.io.Serializable;

//This class contains details of Model/Request/UserDetailsRequestModel.java and Model/Responce/UserRest.Java classes.
//It means this class contains details of REQUEST MODEL CLASS and RESPONCE MODEL CLASS.
//This class will be SHARED among different layers like SERVICE LAYER, DATABASE LAYER and UI LAYER.
//This class will be used like a DATA TRANSFER OBJECT.
//It will contain lot more information.
//Our JAVA CODE will PASSING USER INFORMATION in this DATA TRANSFER OBJECT when it needs to SEND INFORMATION BETWEEN DIFERENT LAYERS.

public class UserDto implements Serializable {
	 
	private static final long serialVersionUID = 225295660863452084L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private int mobile;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVarificationToken;
	private boolean emailVarificationStatus = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

		
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

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

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVarificationToken() {
		return emailVarificationToken;
	}

	public void setEmailVarificationToken(String emailVarificationToken) {
		this.emailVarificationToken = emailVarificationToken;
	}

	public Boolean getEmailVarificationStatus() {
		return emailVarificationStatus;
	}

	public void setEmailVarificationStatus(Boolean emailVarificationStatus) {
		this.emailVarificationStatus = emailVarificationStatus;
	}

}
