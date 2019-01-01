package com.gyftx.Gyftx_Rest.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyftx.Gyftx_Rest.Bean.Model.Request.UserDetailsRequestModel;
import com.gyftx.Gyftx_Rest.Bean.Model.Responce.UserRest;
import com.gyftx.Gyftx_Rest.Service.UserService;
import com.gyftx.Gyftx_Rest.Shared.DataTransferObject.UserDto;



@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser(){
		return "user called";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
	
		//creating return value of UserRest
		UserRest returnValue = new UserRest();
		
		//Create UserDataTransferObject
		UserDto userDto = new UserDto();
		
		//copy the information provided by BEAN Class which is UserDetailsRequestMode.java to UserDataTransferOnject.java class
		BeanUtils.copyProperties(userDetails, userDto);
		
		//UserDto provide information to userSerice INTERFACE will perform some additional business logics, will generate some additional values. 
		//And will add those values to UserDataTransferObject.
		//And that UserDataTransferObject will be used in business logics with data layer to Prepare and ENTITY CLASS.
		//And that ENTITY CLASS will be stored into DATABASE.
		UserDto createUser = userService.createdUser(userDto);
		
		// Once createUser Method is done its work it will return back UserDataTransferObject.
		//which we can use to populate returnValue with information that we are going back to the User.
		BeanUtils.copyProperties(createUser, returnValue);
		return returnValue;
	}
	
	@PutMapping
	public String updateUser(){
		return "updateUser called";
		
	}
	
	@DeleteMapping
	public String deleteUser(){
		return "deleteUser called";
	}
}
