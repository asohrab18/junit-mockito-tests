package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	@Test
	void should_add_two_numbers() {
		int num1 = 10, num2 = 10;
		int expected = num1 + num2;

		CalculatorService calc = new CalculatorService();
		int actual = calc.add(num1, num2);

		assertEquals(expected, actual);
	}

	@Test
	void should_divide_two_integer_numbers() {
		int num1 = 10, num2 = 5;
		int expected = num1 / num2;

		CalculatorService calc = new CalculatorService();
		int actual = calc.divide(num1, num2);

		assertEquals(expected, actual);
	}

	@Test
	void should_throw_exception_when_divide_by_zero() {
		assertThrows(ArithmeticException.class, () -> {
			CalculatorService calc = new CalculatorService();
			calc.divide(15, 0);
		});

	}
}