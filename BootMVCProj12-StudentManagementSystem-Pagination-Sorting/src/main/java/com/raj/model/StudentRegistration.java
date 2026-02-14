package com.raj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name = "tbl_student_registration")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
	@NonNull
	@Column(length = 30)
	private String studentName;
	
	@NonNull
	@Column(length = 30)
	private String email;
	
	@NonNull
	@Column(length = 30)
	private String course;
	
	@NonNull
	@Column(length = 30)
	private String semester;
	
	@NonNull
	@Column(length = 30)
	private String registrationDate;
	
	@NonNull
	@Column(length = 30)
	private String status;
	
}
