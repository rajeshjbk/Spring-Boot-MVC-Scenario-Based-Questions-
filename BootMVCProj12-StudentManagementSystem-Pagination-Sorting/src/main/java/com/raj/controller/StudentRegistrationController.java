package com.raj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.raj.model.StudentRegistration;
import com.raj.service.StudentRegistrationService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentRegistrationController {

	@Autowired
	private StudentRegistrationService registrationService;
	
	@GetMapping("/")
	public String showHomePage() {
	
		return "welcome";
	}
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {

		//use service
		List<StudentRegistration> list = registrationService.findAllRegistrations();
		//keep the results in model attribute
		map.put("listVO", list);

		//return LVN
		return "show-report";
	}
	
	@GetMapping("/add")
	public String showAddStudentFormPage(@ModelAttribute("stud")StudentRegistration st) {

		//return LVN
		return "student-register-form";
	}
	
	@PostMapping("/add")
	public String saveDoctor(@ModelAttribute("stud")StudentRegistration st, HttpSession ses) {
		//use service
		String result = registrationService.saveStudentRegistration(st);

		//keep result as model attribute
		ses.setAttribute("resultMsg", result);

		//return LVN
		return "redirect:report";
	}
	
	@GetMapping("/edit")
	public String showEditStudentFormPage(@ModelAttribute("student")StudentRegistration stu,
			@RequestParam Integer no) {

		//use the service
		StudentRegistration studentsById = registrationService.findRegisteredStudentsById(no);
		
		BeanUtils.copyProperties(studentsById,stu);
		
		//return LVN
		return "student-edit-form";
	}

	@PostMapping("/edit")
	public String editDoctor(@ModelAttribute("student") StudentRegistration stud,
			RedirectAttributes attrs) {

		//use the service
		String msg = registrationService.updateStudentRegistration(stud);
		
		//add the flash attributes
		attrs.addFlashAttribute("resultMsg",msg);

		//redirect the request
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("no")int no, Map<String,Object> map) {

		//use service
		String msg = registrationService.deleteStudentRegistrationById(no);

		//keep the message in model attribute
		map.put("resultMsg", msg);

		//redirect the request
		return "forward:report";
	}
	
	@GetMapping("/page-report")
	public String showReportByPagination(@PageableDefault(page = 0,size = 4,sort = "course",direction = Sort.Direction.ASC) Pageable pageable,
			                             Map<String, Object> map) {
		//use service
		Page<StudentRegistration> page = registrationService.showPaginatedStudentRegistrationData(pageable);
		
		//keep this object share memory as the the model attribute
		map.put("pageData", page);
		
		//return LVN
		return "page-report";
	}
}
