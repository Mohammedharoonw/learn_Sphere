package com.example.demo.Services;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

public interface TrainerService {
	public String addCourse(Course course);
	
	public String addLesson(Lesson lesson);
	
	Course getCourse(int courseId);
	
//	public List<Course>findAllCourse();

	public List<Course> courseList();

	

}
