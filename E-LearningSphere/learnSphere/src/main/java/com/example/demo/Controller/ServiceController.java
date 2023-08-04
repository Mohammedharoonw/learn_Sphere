package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Services.UserService;
import com.example.demo.entity.Users;

@Controller
public class ServiceController {
	@Autowired
	UserService uService;
	
	@PostMapping("/addUser")
	public String adduser(@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,
			@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("mobile")String mobile,
			@RequestParam("role")String role) {
		
//		login for checking email
		boolean emailExists= uService.checkEmail(email);
		if(emailExists==false) {
			
			Users user =new Users();
			
			user.setFname(fname);
			user.setLname(lname);
			user.setEmail(email);
			user.setPassword(password);
			user.setMobile(mobile);
			user.setRole(role);
			
			uService.addUser(user);	
			System.out.println("user register successfully!");
					return "redirect:/login";
			
		}
		else {
			System.out.println("user alredy exists!");
			return "redirect:/register";
		}
		
	}
	
	
	
	@PostMapping("/validate")
	public String Validate(@RequestParam("email")String email,
			@RequestParam("password")String password){
		if(uService.checkEmail(email)) {
			boolean valid = uService.validate(email,password);
//			if user is valid
			if(valid==true) {
				if(uService.getUserRole(email).equals("trainer")) {
					return "trainerHome";					
				}
				else {
					return "studentHome";
				}
			}else {
				System.out.println("Incorrect Password! , try again!");
				return"login";
			}
			
		}
		else {
			System.out.println("Email does not exist!");
			return "/error";
		}
		
	}
	

}
