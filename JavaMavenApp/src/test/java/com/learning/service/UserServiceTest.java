package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class UserServiceTest {

	@Test
	void shouldThrowExeptionWhenAgeIsNegativeNumber() {

		assertThrows(IllegalArgumentException.class, () -> {
			UserService user = new UserService();
			user.getUserType(-12);
		});

	}

	@Test
	void shouldThrowExeptionWhenAgeIsZero() {

		assertThrows(IllegalArgumentException.class, () -> {
			UserService user = new UserService();
			user.getUserType(0);
		});

	}

	@Test
	void shouldGetMinorWhenAgeLessThan18() {
		UserService user = new UserService();
		String actual = user.getUserType(17);
		assertEquals("MINOR", actual);
	}

	@Test
	void shouldGetAdultWhenAgeEqualTo18() {
		// Given
		UserService user = new UserService();

		// When
		String actual = user.getUserType(18);

		// Then
		assertEquals("ADULT", actual);
	}

	@Test
	void shouldGetAdultWhenAgeGreaterThan18() {
		// Given
		UserService user = new UserService();

		// When
		String actual = user.getUserType(19);

		// Then
		assertEquals("ADULT", actual);
	}

}
