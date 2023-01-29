package com.training.app.service.student;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.entity.Student;
@Service
public interface StudentService {
	public Student registerStudent(Student student);
	public Student getStudentByName(String name);
	public Student getStudentById(int id);
	public List<Student> getAllStudentss();
	public Student updateCourse(int stuId,int courseId);

}