package com.gyftx.Gyftx_Rest.Bean.Model.Responce;

//This Class convert JAVA OBJECT into outgoing JSON Responce.
//This class contains USER information that is been sent back as a conformation that UserDetails have been stored in a database.
//And this is what we can RETURN back.
//This class is use on the UI layer Which is UserFace layer.

public class UserRest {
	
	

	private String userId;
	private String firstName;
	private String lastName;
	private int mobile;
	private String email;

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

}
