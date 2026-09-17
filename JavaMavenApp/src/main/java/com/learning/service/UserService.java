package com.learning.service;

public class UserService {

	public String getUserType(int age) {

		if (age >= 18) {
			return "ADULT";
		}

		return "MINOR";
	}
}
