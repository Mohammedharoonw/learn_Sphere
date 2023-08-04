package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Services.TrainerService;
import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;




@Controller
public class TrainerController {
	@Autowired
	TrainerService tService;
	
//	 Adding course
	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseId")int courseId,
			@RequestParam("courseName")String courseName,
			@RequestParam("coursePrice")int coursePrice) {
		Course c =new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePrice(coursePrice);
		
		tService.addCourse(c);		
		return "redirect:/";
		
	}
//	Adding Lesson
	@PostMapping("/lesson")
	public String lesson(@RequestParam("courseId")int courseId,
			@RequestParam("lessonId")int lessonId,
			@RequestParam("lessonName")String lessonName,
			@RequestParam("topic")String topic,
			@RequestParam("link")String link) {
		Course course = tService.getCourse(courseId);
		
		Lesson lesson= new Lesson(lessonId,lessonName,topic,link,course);
		tService.addLesson(lesson);
		course.getLesson().add(lesson);
		
				
		return "redirect:/";
		
	}
// Adding view List
	@GetMapping("/showCourses")
	public String showCourses(Model model) {
		List<Course>courseList=tService.courseList();
		model.addAttribute("courseList", courseList);
		System.out.println(courseList);
	return "courses";
}

	
	
}
