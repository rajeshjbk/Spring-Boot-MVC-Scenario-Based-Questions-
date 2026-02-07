package com.raj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.model.StudentEntity;
import com.raj.model.StudentVO;
import com.raj.repository.IStudentRepository;

@Service
public class StudentMgmtServiceImpl implements IStudentMgmtService {

	@Autowired
	private IStudentRepository studentRepo;
	
	@Override
	public String saveStudent(StudentVO vo) {
		
		//convert vo to Entity
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(vo, entity);
		
		//save the Object
		Long idVal = studentRepo.save(entity).getId();
		
		return "Student is saved with id value:: "+idVal;
	}

	@Override
	public List<StudentVO> showAllStudents() {
		
		//use repo
		List<StudentEntity> listEntity = studentRepo.findAll();
		
		//convert ListEntity to listVO
		
		List<StudentVO> listVO = new ArrayList<StudentVO>();
		
		listEntity.forEach(entity->{
			
			StudentVO vo = new StudentVO();
			BeanUtils.copyProperties(entity, vo);
			vo.setResult((vo.getMarks()>=35 && vo.getMarks()<=100) ?"PASS":"FAIL");
			listVO.add(vo);
		});
		
		return listVO;
	}

}
