package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	@Test
	void shouldAddTwoNumbers() {
		int num1 = 10, num2 = 10;
		int expected = num1 + num2;
		
		CalculatorService calc = new CalculatorService();
		int actual = calc.add(num1, num2);
		
		assertEquals(expected, actual);
	}
}