package com.training.app.repository.student;

import com.training.app.entity.Course;
import com.training.app.entity.Student;

public interface CustomStudentRepository {
	
	public Student updateCourseByStudent(Student student,
			Course course);

}