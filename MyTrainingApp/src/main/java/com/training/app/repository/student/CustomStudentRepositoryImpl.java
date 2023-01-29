package com.training.app.repository.student;

import com.training.app.entity.Course;
import com.training.app.entity.Student;

public class CustomStudentRepositoryImpl implements CustomStudentRepository {
	
	@Override
	public Student updateCourseByStudent(Student student, Course course) {
		
		student.setCourse(course);
		return student;
	}

}