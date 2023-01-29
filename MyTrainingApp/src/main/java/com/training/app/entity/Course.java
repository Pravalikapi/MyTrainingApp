package com.training.app.entity;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // code to generate PK automatically
	private int courseId;
	private String courseName;
	private int duration;
	private String category;
	private String courseOwner;
	
	public Course(String courseName, int duration, String category, String courseOwner) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.category = category;
		this.courseOwner = courseOwner;
	}
	
	
	
}
