package com.learning.service;

public class BankAccountService {

	private double balance;

	public BankAccountService(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}

		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}
}
