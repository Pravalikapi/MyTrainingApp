package com.training.app.util;

import org.springframework.stereotype.Component;

import com.training.app.dto.StudentDTODefaultResponse;
import com.training.app.entity.Student;

@Component
public class StudentDTOConvertor {
	 
	public StudentDTODefaultResponse convertTo(Student student)
	{
		
		return new StudentDTODefaultResponse(student.getStudentId(), student.getStudentName());
	}

}