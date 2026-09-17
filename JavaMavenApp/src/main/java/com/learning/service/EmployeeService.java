package com.learning.service;

import com.learning.model.Employee;
import com.learning.repository.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public String getEmployeeName(int id) {

		Employee employee = repository.findById(id);

		return employee.getName();
	}
	
	public void deleteEmployee(int id) {
	    repository.deleteById(id);
	}
}
