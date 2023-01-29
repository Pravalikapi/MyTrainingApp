package com.training.app.service.cousese;




import java.util.List;

import org.springframework.stereotype.Service;

import com.training.app.entity.Course;

@Service
public interface CourseService {

	public Course addCourse(Course course);
	public Course getCourseByName(String name);
	public Course getCourseById(int id);
	public List<Course> getAllCourses();
	public List<Course> getCoursesByCategory(String category);
	
	
}
