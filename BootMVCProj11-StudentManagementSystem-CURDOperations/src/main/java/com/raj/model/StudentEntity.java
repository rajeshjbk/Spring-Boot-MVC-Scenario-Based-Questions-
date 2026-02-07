package com.raj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="tbl_student")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	@Column(length = 30)
	private String name;
	
	@NonNull
	@Column(length = 30)
	private String email;
	
	@NonNull
	@Column(length = 30)
	private String course;
	
	@NonNull
	private Double fee;
	
	@NonNull
	private Double marks;
	
}
