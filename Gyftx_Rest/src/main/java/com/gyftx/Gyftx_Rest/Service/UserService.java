package com.gyftx.Gyftx_Rest.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gyftx.Gyftx_Rest.Shared.DataTransferObject.UserDto;

//this INTERFACE contains many more methods other then "createUser".
//It will contains GetUser, GetUsers to list of User,Update User Details, Delete User Details etc.
public interface UserService extends UserDetailsService{

	UserDto createdUser(UserDto user);
	UserDto getUser(String email);
}
