package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class UserServiceTest {

	/**
	 * Normal = valid everyday input. Boundary = input near an important limit
	 * Negative = invalid/unacceptable input Exception = verify an exception is
	 * thrown ============================================ 17 ← just below boundary
	 * 18 ← boundary 19 ← just above boundary
	 **/
	@Test
	void should_throw_exception_when_age_is_negative() {
		// Given
		UserService user = new UserService();
		int age = -12;

		// When & Then
		assertThrows(IllegalArgumentException.class, () -> {
			user.getUserType(age);
		});

	}

	@Test
	void should_throw_exception_when_age_is_zero() {
		// Given
		UserService user = new UserService();
		int age = 0;

		// When & Then
		assertThrows(IllegalArgumentException.class, () -> {
			user.getUserType(age);
		});

	}

	@Test
	void should_get_minor_when_age_is_one() {

		UserService user = new UserService();

		String actual = user.getUserType(1);

		assertEquals("MINOR", actual);
	}

	@Test
	void should_get_minor_when_age_less_than_18() {
		// Given
		UserService user = new UserService();
		int age = 17;

		// When
		String actual = user.getUserType(age);

		// Then
		assertEquals("MINOR", actual);
	}

	@Test
	void should_get_adult_when_age_is_18() {
		// Given
		UserService user = new UserService();
		int age = 18;

		// When
		String actual = user.getUserType(age);

		// Then
		assertEquals("ADULT", actual);
	}

	@Test
	void should_get_adult_when_age_greater_than_18() {
		// Given
		UserService user = new UserService();
		int age = 19;

		// When
		String actual = user.getUserType(age);

		// Then
		assertEquals("ADULT", actual);
	}

	@Test
	void should_get_adult_when_age_is_maximum_integer_value() {

		// Given
		UserService user = new UserService();

		// When
		String actual = user.getUserType(Integer.MAX_VALUE);

		// Then
		assertEquals("ADULT", actual);
	}
}
