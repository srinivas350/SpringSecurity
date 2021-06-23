package com.srinivas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srinivas.models.Employee;
import com.srinivas.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	public EmployeeService service;

	@RequestMapping("/registration")
	public ModelAndView getEmployeeView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employee_registartion");
		return mav;
	}

	@RequestMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return new ResponseEntity<String>("Please Enter Valid Inputs", HttpStatus.BAD_REQUEST);
		} else {
			service.saveEmployee(employee);
			return new ResponseEntity<String>("Employee Registerd Successfully", HttpStatus.ACCEPTED);
		}
	}

}
