package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
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

	/** Means: Don't use the real repository. Give me a fake/mock repository. */
	@Mock
	EmployeeRepository repository;

	@InjectMocks
	EmployeeService service;

	@Test
	void should_return_employee_name() {

		Employee employee = new Employee(1, "Sohrab");

		// Means: When the service asks the repository for user 1, pretend the
		// repository returned this user.
		when(repository.findById(1)).thenReturn(employee);

		String result = service.getEmployeeName(1);

		assertEquals("Sohrab", result);

		verify(repository).findById(1);
	}

	@Test
	void should_delete_employee() {
		// GIVEN
		int employeeId = 10;

		// WHEN
		service.deleteEmployee(employeeId);

		// Means: Verify that deleteById(10) was actually called.
		verify(repository).deleteById(employeeId);

	}
}
