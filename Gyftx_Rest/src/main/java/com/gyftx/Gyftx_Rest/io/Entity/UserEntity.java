package com.gyftx.Gyftx_Rest.io.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -6254030257095826989L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false, length = 50)
	private String firstName;

	@Column(nullable = false, length = 50)
	private String lastName;

	@Column(nullable = false, length = 10)
	private int mobile;
	
	@Column(nullable = false, length = 120, unique=true)
	private String email;

	@Column(nullable = false)
	private String encryptedPassword;

	private String emailVarificationToken;

	@Column(nullable = false, columnDefinition = "boolean default false")
	private Boolean emailVarificationStatus;

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
