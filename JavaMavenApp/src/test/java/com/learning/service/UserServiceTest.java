package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserServiceTest {

	@Test
	void shouldGetAdultWhenAgeGreaterThanOrEqualTo18() {
		// Given
		UserService user = new UserService();

		// When
		String actual = user.getUserType(19);

		// Then
		assertEquals("ADULT", actual);
	}

	@Test
	void shouldGetMinorWhenAgeLessThan18() {
		UserService user = new UserService();
		String actual = user.getUserType(17);
		assertEquals("MINOR", actual);
	}
}
