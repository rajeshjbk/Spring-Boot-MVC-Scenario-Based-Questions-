package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.model.StudentRegistration;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Integer>{

}
