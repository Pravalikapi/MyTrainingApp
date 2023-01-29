package com.training.app.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.app.dto.StudentDTODefaultResponse;
import com.training.app.entity.Student;
import com.training.app.service.student.StudentService;
import com.training.app.util.StudentDTOConvertor;

@RestController
@RequestMapping("/student")
public class StudentRestController {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	StudentDTOConvertor dtoConvertor;
	
	
	public StudentRestController() {
		logger.info("Student Rest Controller called");
		System.err.println("Student Rest Controller called");
	}

	@PostMapping("/register")
	public ResponseEntity<StudentDTODefaultResponse> saveStudent(@RequestBody Student student)
	{
		Student saveStudent = studentService.registerStudent(student);
		logger.info(" --->> Student saved "+saveStudent);
		
		StudentDTODefaultResponse dtoObj = dtoConvertor.convertTo(saveStudent);
		
		
		return new ResponseEntity<StudentDTODefaultResponse>(dtoObj,HttpStatus.OK);
	}
	
	@GetMapping("/listOfStudents")
	public ResponseEntity<List<StudentDTODefaultResponse>> getAllStudents()
	{
		List<Student> allStudentsInDB = studentService.getAllStudentss();
		
		List<StudentDTODefaultResponse> dtoList = new ArrayList<>();
		for (Student student : allStudentsInDB) {
			
			StudentDTODefaultResponse dtoObj = dtoConvertor.convertTo(student);
			dtoList.add(dtoObj);
		}
		
		return new ResponseEntity<List<StudentDTODefaultResponse>>(dtoList,HttpStatus.OK);
	}
	
	
	@PutMapping("/{stid}/course/{cid}")
	public String updateStudentWithCourse(@PathVariable int stid,@PathVariable int cid)
	{
		Student updatedstudent = studentService.updateCourse(stid, cid);
		
		if(updatedstudent.getCourse() != null)
		{
			return updatedstudent.toString();
		}
		else return "error : - "+updatedstudent.toString()+" ";
	}

}