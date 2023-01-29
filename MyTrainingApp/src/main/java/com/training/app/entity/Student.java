package com.training.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int studentId;
	private String studentName;
	private String feedback;
	private int marks;
	
	@Embedded
	@Column(nullable=true)
	private Profile profile;
	
	@OneToOne(cascade= CascadeType.ALL)
	private Course course;

	public Student(int studentId, String studentName, String feedback, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.feedback = feedback;
		this.marks = marks;
	}

	public Student(int studentId, String studentName, String feedback, int marks, Profile profile, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.feedback = feedback;
		this.marks = marks;
		this.profile = profile;
		this.course = course;
	}
	

}