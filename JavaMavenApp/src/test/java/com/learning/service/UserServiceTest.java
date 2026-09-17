package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class UserServiceTest {

	@Test
	void should_throw_exeption_when_age_is_negative() {

		assertThrows(IllegalArgumentException.class, () -> {
			UserService user = new UserService();
			user.getUserType(-12);
		});

	}

	@Test
	void should_throw_exeption_when_age_is_zero() {

		assertThrows(IllegalArgumentException.class, () -> {
			UserService user = new UserService();
			user.getUserType(0);
		});

	}

	@Test
	void should_get_minor_when_age_less_than_18() {
		UserService user = new UserService();
		String actual = user.getUserType(17);
		assertEquals("MINOR", actual);
	}

	@Test
	void should_get_adult_when_age_is_18() {
		// Given
		UserService user = new UserService();

		// When
		String actual = user.getUserType(18);

		// Then
		assertEquals("ADULT", actual);
	}

	@Test
	void should_get_adult_when_age_greater_than_18() {
		// Given
		UserService user = new UserService();

		// When
		String actual = user.getUserType(19);

		// Then
		assertEquals("ADULT", actual);
	}

}
