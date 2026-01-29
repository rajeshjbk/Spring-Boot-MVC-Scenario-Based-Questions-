package com.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

	private Integer courseId;
	private String courseName;
	private String instructor;
	private Double duration;
	private Double price;
	
}
