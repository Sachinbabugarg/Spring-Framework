package com.example.demospring.Services;

import java.util.List;

import com.example.demospring.entities.Course;

public interface CourseService {
  
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}
