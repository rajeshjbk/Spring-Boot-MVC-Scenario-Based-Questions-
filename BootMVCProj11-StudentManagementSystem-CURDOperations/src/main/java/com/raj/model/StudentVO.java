package com.raj.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class StudentVO {

	private Long id;

	@NonNull
	private String name;

	@NonNull
	private String email;

	@NonNull
	private String course;

	@NonNull
	private Double fee;

	@NonNull
	private Double marks;
	
	private String result;

}
