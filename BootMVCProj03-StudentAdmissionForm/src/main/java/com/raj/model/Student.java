package com.raj.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private String studentName;
	
	private Integer rollNumber;
	
	private String dateOfBirth;
	
	private String  course;
	
	private Long contactNumber;
	
}
