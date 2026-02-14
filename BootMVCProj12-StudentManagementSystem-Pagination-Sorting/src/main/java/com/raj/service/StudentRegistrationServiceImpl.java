package com.raj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.raj.model.StudentRegistration;
import com.raj.repository.StudentRegistrationRepository;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	private StudentRegistrationRepository registrationRepo;

	@Override
	public String saveStudentRegistration(StudentRegistration registration) {

		Integer id = registrationRepo.save(registration).getId();

		return "New Student is Registered with Id: "+id;
	}

	@Override
	public String updateStudentRegistration(StudentRegistration registration) {

		StudentRegistration stud = registrationRepo.findById(registration.getId()).orElseThrow(()-> new RuntimeException("Student Id not Found"));
		registrationRepo.save(registration);

		return stud.getId()+" Student Details are Updated";
	}

	@Override
	public List<StudentRegistration> findAllRegistrations() {

		return registrationRepo.findAll();
	}

	@Override
	public StudentRegistration findRegisteredStudentsById(Integer id) {

		StudentRegistration student = registrationRepo.findById(id).orElseThrow(()-> new RuntimeException("Student Id is Invalid"));

		return student;
	}

	@Override
	public String deleteStudentRegistrationById(Integer id) {
		
		boolean flag = registrationRepo.existsById(id);
		
		if(flag) {
			
			registrationRepo.deleteById(id);
			return id+" Student Found and Deleted";
		}
		
		return id+" Student not Found and not Deleted";
	}

	@Override
	public Page<StudentRegistration> showPaginatedStudentRegistrationData(Pageable pageable) {
		
		Page<StudentRegistration> page = registrationRepo.findAll(pageable);
		
		return page;
	}
}
