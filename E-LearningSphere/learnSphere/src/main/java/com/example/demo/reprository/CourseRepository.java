package com.example.demo.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer>{

}
