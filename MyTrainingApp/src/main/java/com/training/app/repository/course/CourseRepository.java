package com.training.app.repository.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.app.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
	
	/* custom requirements */
	
	
	 // method name has be get<EntityName>By<PropertyName (follow naming convention)>
	public Course getCourseByCourseName(String courseName);
	public List<Course> getCourseByCategory(String category); // no need to write code
	// spring Data JPa automatically fetch courses by category

}
