package com.training.app.repository.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.app.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>,CustomStudentRepository {
	//public Student getStudentByStudentName(String studentName);
	//public List<Student> getStudentByCourse(String course);

}