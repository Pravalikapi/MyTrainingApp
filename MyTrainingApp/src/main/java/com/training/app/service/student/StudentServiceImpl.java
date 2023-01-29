package com.training.app.service.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.entity.Student;
import com.training.app.repository.course.CourseRepository;
import com.training.app.repository.student.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Student registerStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudentss() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateCourse(int stuId, int courseId) {
		// TODO Auto-generated method stub
		
		Student saveStudent = studentRepository.getReferenceById(stuId);
		Course savedCourse = courseRepository.getReferenceById(courseId);
		
		
		if(saveStudent != null & savedCourse != null) 
		{
			Student updatedStudent = studentRepository.updateCourseByStudent(saveStudent, savedCourse);
			studentRepository.save(updatedStudent); 
			return updatedStudent;
		}
		
		else return null;
	}

}