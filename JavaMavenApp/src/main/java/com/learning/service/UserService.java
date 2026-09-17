package com.learning.service;

public class UserService {

	public String getUserType(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Age cannot be zero or negative.");
		}

		if (age >= 18) {
			return "ADULT";
		}

		return "MINOR";
	}
}
