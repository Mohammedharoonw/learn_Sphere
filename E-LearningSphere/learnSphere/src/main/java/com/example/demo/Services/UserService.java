package com.example.demo.Services;


import com.example.demo.entity.Users;

public interface UserService {
//	adds new user to database
	
	String addUser(Users User);
	
//	checks email is already present in db
	
	boolean checkEmail(String email);
//	 get validates user's credentials
	boolean validate(String email,String password);
	//get user's role by providing email

	String getUserRole(String email);

}
