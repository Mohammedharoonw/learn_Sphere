package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		long id;
		String fname;
		String lname;
		String email;
		String password;
		String mobile;
		String role;
		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Users(long id, String fname, String lname, String email, String password, String mobile, String role) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.password = password;
			this.mobile = mobile;
			this.role = role;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
					+ password + ", mobile=" + mobile + ", role=" + role + "]";
		}
		
		

}
