package com.raj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.raj.model.StudentRegistration;

public interface StudentRegistrationService {

	public String saveStudentRegistration(StudentRegistration registration);
	
	public String updateStudentRegistration(StudentRegistration registration); 
	
	public List<StudentRegistration> findAllRegistrations();
	
	public StudentRegistration findRegisteredStudentsById(Integer id);
	
	public String deleteStudentRegistrationById(Integer id);
	
	public Page<StudentRegistration> showPaginatedStudentRegistrationData(Pageable pageable);
	
}
