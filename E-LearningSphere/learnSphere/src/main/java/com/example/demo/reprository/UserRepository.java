package com.example.demo.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;


 public interface UserRepository extends JpaRepository<Users, Long> {
	 boolean existsByEmail(String email);
//	 Users findByEmail(String email);
	 Users getByEmail(String email);

}
