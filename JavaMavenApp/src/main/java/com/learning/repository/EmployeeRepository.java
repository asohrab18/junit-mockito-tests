package com.learning.repository;

import java.util.HashMap;
import java.util.Map;

import com.learning.model.Employee;

public class EmployeeRepository {

	private static Map<Integer, Employee> employees = new HashMap<>();

	static {
		employees.put(101, new Employee(101, "Adam Smith"));
		employees.put(102, new Employee(102, "Bob Muller"));
		employees.put(103, new Employee(103, "Celina Gomez"));
	}

	public Employee findById(int id) {
		return employees.get(id);
	}
}
