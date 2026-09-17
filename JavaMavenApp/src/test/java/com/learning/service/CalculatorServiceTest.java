package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	/**
	 * Normal = valid everyday input. 
	 * Boundary = input near an important limit
	 * Negative = invalid/unacceptable input 
	 * Exception = verify an exception is thrown
	 */
	
	// Normal Case
	@Test
	void should_add_two_numbers() {
		// GIVEN
		int num1 = 10;
		int num2 = 10;

		// It is hard coded because the test should define what the correct answer is,
		// rather than calculate the answer using the same logic.
		int expected = 20;

		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.add(num1, num2);

		// THEN
		assertEquals(expected, actual);
	}

	// Normal Case
	@Test
	void should_divide_two_integer_numbers() {
		// GIVEN
		int num1 = 10;
		int num2 = 5;
		int expected = 2;

		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.divide(num1, num2);

		// THEN
		assertEquals(expected, actual);
	}

	// Exception Case
	@Test
	void should_throw_exception_when_divide_by_zero() {
		// GIVEN
		CalculatorService calc = new CalculatorService();

		// WHEN + THEN
		assertThrows(ArithmeticException.class, () -> calc.divide(15, 0));

	}

	@Test
	void should_add_negative_numbers() {

		// GIVEN
		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.add(-10, -5);

		// THEN
		assertEquals(-15, actual);
	}

	// edge/boundary-type case
	@Test
	void should_return_zero_when_dividing_zero_by_number() {

		// GIVEN
		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.divide(0, 5);

		// THEN
		assertEquals(0, actual);
	}

}