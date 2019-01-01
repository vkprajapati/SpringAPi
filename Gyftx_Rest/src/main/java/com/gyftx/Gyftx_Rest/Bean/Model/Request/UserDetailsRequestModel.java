package com.gyftx.Gyftx_Rest.Bean.Model.Request;

//This class convert incoming JSON document into JAVA class.
//This class contains user information that was submited to us to Create a NEW ACCOUNT.
//This class is use on the UI layer Which is UserFace layer.
	

public class UserDetailsRequestModel {
	
	
		private String firstName;
		private String userName;
		private String lastName;
		private String email;
		private int mobile;
		private String password;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getMobile() {
			return mobile;
		}

		public void setMobile(int mobile) {
			this.mobile = mobile;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}



