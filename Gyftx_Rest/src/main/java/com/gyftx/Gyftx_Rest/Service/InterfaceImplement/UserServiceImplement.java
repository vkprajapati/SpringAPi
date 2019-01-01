package com.gyftx.Gyftx_Rest.Service.InterfaceImplement;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gyftx.Gyftx_Rest.Repository.UserRepository;
import com.gyftx.Gyftx_Rest.Service.UserService;
import com.gyftx.Gyftx_Rest.Shared.Utils;
import com.gyftx.Gyftx_Rest.Shared.DataTransferObject.UserDto;
import com.gyftx.Gyftx_Rest.io.Entity.UserEntity;

//This Class implements the methods of UserService.java INTERFACE.
@Service
public class UserServiceImplement implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public UserDto createdUser(UserDto user) {
		
		
		
		if(userRepository.findByEmail(user.getEmail()) != null) throw new RuntimeException("Email already exist");

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		String publicUserId = utils.generateUserId(30);
		userEntity.setUserId(publicUserId);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		 
		UserEntity storedUserDetails =  userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}
	
	@Override
	public UserDto getUser(String email){
	
		UserEntity userEntity = userRepository.findByEmail(email);
		
		if (userEntity == null)
			throw new UsernameNotFoundException(email);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(userEntity, returnValue);
		return returnValue;
		

	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findByEmail(email);
//		UserEntity userEntity = userRepository.findByMobile(mobile);
		if (userEntity == null)
			throw new UsernameNotFoundException(email);
		
		return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), 
				userEntity.getEmailVarificationStatus(),
				true, true,
				true, new ArrayList<>());
	}

}
