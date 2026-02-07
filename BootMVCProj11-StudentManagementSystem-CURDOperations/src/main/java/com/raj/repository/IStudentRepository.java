package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.model.StudentEntity;

public interface IStudentRepository extends JpaRepository<StudentEntity,Long>{

}
