package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.reprository.UserRepository;


@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository repo;
	
	
	

	@Override
	public String addUser(Users User) {
		repo.save(User);
		return "student added sucessfully!";
	}




	@Override
	public boolean checkEmail(String email) {
		
		return repo.existsByEmail(email);
	}




	@Override
	public boolean validate(String email, String password) {
		if(repo.existsByEmail(email)) {
			Users u=repo.getByEmail(email);
			String dbPassword=u.getPassword();
			if(password.equals(dbPassword)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}




	@Override
	public String getUserRole(String email) {
		Users u = repo.getByEmail(email);
		return u.getRole();
	}

//  public boolean valid(String password,String dbPassword) {
//	return password.equals(dbPassword);
//}
//
//@Override
//public boolean validate(String email, String password) {
//	
//	String dbPassword =findByEmail(email);
//	if(dbPassword != null) {
//		return password.equals(dbPassword);
//	}
//	return false;
//}
//
//
//
//
//private String findByEmail(String email) {
//	Users user =repo.findByEmail(email);
//	if(user != null) {
//		return user.getPassword();
//	}
//	// TODO Auto-generated method stub
//	return null;
//}


	






}
