package com.example.demospring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demospring.Services.CourseService;
import com.example.demospring.entities.Course;

@RestController
public class Mycontrol {
	@Autowired
    private CourseService c;
	
	@GetMapping("/home")
	public String Show()
	{
		return "Chalo chale aao";
	}
	@GetMapping("/courses")
	public List<Course> getCourses()
	
	{
		return this.c.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.c.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.c.addCourse(course);
	}
	
	
	
	
}
