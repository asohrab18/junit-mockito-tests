package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BankAccountServiceTest {

	@Test
	void should_withdraw_money_and_reduce_balance() {
		// GIVEN
		BankAccountService bas = new BankAccountService(1000d);

		// WHEN
		bas.withdraw(500d);

		// THEN
		assertEquals(500d, bas.getBalance());
	}

	@Test
	void should_throw_exception_when_withdrawing_money_more_than_balance() {

		assertThrows(IllegalArgumentException.class, () -> {
			BankAccountService bas = new BankAccountService(100d);
			bas.withdraw(200d);
		});

	}
}