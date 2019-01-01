package com.gyftx.Gyftx_Rest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gyftx.Gyftx_Rest.io.Entity.UserEntity;


//this User repository is take entity from UserEntity.java class to persist the data in to database.
// this interface contains methods like , Save userDetails, Update User Details, Delete user Details,Sql queries, etc.
//this also contains methods for Open Database Connection and Perform Sql Queries and close Database Connection.
//OR have to add methods that use Hibernets againg for each apuration, have to create a saperate methods that creates, Reads or Update records.
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

	//UserEntity findUserbyEmail(String email);
	UserEntity findByEmail(String email);
	
}
