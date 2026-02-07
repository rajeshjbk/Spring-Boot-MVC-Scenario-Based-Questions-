package com.raj.service;

import java.util.List;

import com.raj.model.StudentVO;

public interface IStudentMgmtService {

	String saveStudent(StudentVO vo);
	
	List<StudentVO> showAllStudents();
}
