package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.reprository.CourseRepository;
import com.example.demo.reprository.LessonRepository;

@Service
public class TrainerServiceImp implements TrainerService {
	@Autowired
	CourseRepository  courseRepo;
	
	@Autowired
	LessonRepository lessonRepo;
//  for Adding Course
	@Override
	public String addCourse(Course course) {
		courseRepo.save(course);
	
		return " Course added!";
	}
// for Adding  Lesson
	@Override
	public String addLesson(Lesson lesson) {
		lessonRepo.save(lesson);
		return "lesson added!";
	}

	@Override
	public Course getCourse(int courseId) {
		return courseRepo.findById(courseId).get();
	}
	
//  for view all course
	@Override
	public List<Course> courseList() {
		
		return courseRepo.findAll();
	}
	

	
	

	

}
