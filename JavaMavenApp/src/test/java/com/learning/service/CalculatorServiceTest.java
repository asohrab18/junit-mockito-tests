package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	/**
	 * Normal = valid everyday input. Boundary = input near an important limit
	 * Negative = invalid/unacceptable input Exception = verify an exception is
	 * thrown
	 */

	// 1. Normal positive numbers
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

	// 2. Negative numbers
	@Test
	void should_add_negative_numbers() {

		// GIVEN
		int num1 = -10;
		int num2 = -5;
		int expected = -15;

		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.add(num1, num2);

		// THEN
		assertEquals(expected, actual);
	}

	// 3. Positive + negative
	@Test
	void should_add_positive_and_negative_numbers() {
		// GIVEN
		int num1 = 10;
		int num2 = -5;
		int expected = 5;

		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.add(num1, num2);

		// THEN
		assertEquals(expected, actual);
	}

	// 3. Zero as input
	@Test
	void should_add_zero_and_number() {
		// GIVEN
		int num1 = 0;
		int num2 = 5;
		int expected = 5;

		CalculatorService calc = new CalculatorService();

		// WHEN
		int actual = calc.add(num1, num2);

		// THEN
		assertEquals(expected, actual);
	}

	// 5. Integer boundary/overflow behavior → test values near Integer.MAX_VALUE /
	// Integer.MIN_VALUE
	@Test
	void should_add_min_and_max_numbers() {
		// GIVEN
		int num1 = Integer.MIN_VALUE;
		int num2 = Integer.MAX_VALUE;
		int expected = -1;

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