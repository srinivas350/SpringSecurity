package com.srinivas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinivas.models.Department;
import com.srinivas.models.Employee;
import com.srinivas.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository repository;
	
	
	public void saveEmployee(Employee employee)
	{
		List<Department> dept=new ArrayList<Department>();
		dept=(List<Department>) employee.getDepartment();
		employee.setDepartment(dept);
		repository.save(employee);
	}
	
	

}
