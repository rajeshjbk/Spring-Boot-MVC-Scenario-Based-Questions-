package com.raj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.raj.model.StudentVO;
import com.raj.service.IStudentMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentOperationsController {

	@Autowired
	private IStudentMgmtService studentService;
	
	@GetMapping("/")
	public String showHome() {

		//return LVN
		return "welcome";
	}

	@GetMapping("/report")
	public String studentReport(Map<String,Object> map) {

		//use service
		List<StudentVO> listVO = studentService.showAllStudents();
		
		//keep the result in model attribute
		map.put("listVO", listVO);
		
		//return LVN
		return "show-report";
	}

	@GetMapping("/add")
	public String showStudentRegistrationForm(@ModelAttribute("stuVO") StudentVO vo) {

		//return LVN
		return "student-register-form";
	}


	/*@PostMapping("/add")
	public String saveStudent(@ModelAttribute("stuVO") StudentVO vo, Map<String, Object> map) {
	
		//use service
		String result = studentService.saveStudent(vo);
		
		//keep result as model attribute
		map.put("resultMsg", result);
		
		//return LVN
		return "redirect:report";
	}*/
	
		
	/*@PostMapping("/add")
	public String saveStudent(@ModelAttribute("stuVO") StudentVO vo, RedirectAttributes attrs) {
	
		//use service
		String result = studentService.saveStudent(vo);
		
		//keep result as model attribute
		attrs.addFlashAttribute("resultMsg", result);
		
		//return LVN
		return "redirect:report";
	}*/
	
	@PostMapping("/add")
	public String saveStudent(@ModelAttribute("stuVO") StudentVO vo, HttpSession ses) {
	
		//use service
		String result = studentService.saveStudent(vo);
		
		//keep result as model attribute
		ses.setAttribute("resultMsg", result);
		
		//return LVN
		return "redirect:report";
	}

}
