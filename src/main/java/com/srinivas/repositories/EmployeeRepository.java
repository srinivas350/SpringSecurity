package com.srinivas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinivas.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
