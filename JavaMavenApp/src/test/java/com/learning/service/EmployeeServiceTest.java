package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.learning.model.Employee;
import com.learning.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@Mock
	EmployeeRepository repository;

	@InjectMocks
	EmployeeService service;

	@Test
	void shouldReturnUserName() {

		Employee employee = new Employee(1, "Sohrab");

		when(repository.findById(1)).thenReturn(employee);

		String result = service.getUserName(1);

		assertEquals("Sohrab", result);
	}
}
