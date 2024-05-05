package com.example.demospring.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demospring.entities.Course;

@Service
public class courseEmpl implements CourseService {
   List<Course> list;
   public courseEmpl()
   {
	   list=new ArrayList<>();
	   list.add(new Course(1,"Hello","How Are ypu"));
	   list.add(new Course(2,"Bye","Welcome"));
   }
	
	
	@Override
	public List<Course> getCourses() {
	
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
	    Course c=null;
	    for(Course course:list)
	    {
	    	if(course.getId()==courseId)
	    	{
	    		c=course;
	    		break;
	    	}
	    }
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
