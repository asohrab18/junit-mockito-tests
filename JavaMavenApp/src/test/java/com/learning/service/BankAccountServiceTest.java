package com.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BankAccountServiceTest {

	@Test
	void should_Withdraw_Money_And_Reduce_Balance() {
		// GIVEN
		BankAccountService bas = new BankAccountService(1000d);

		// WHEN
		bas.withdraw(500d);

		// THEN
		assertEquals(500d, bas.getBalance());
	}

	@Test
	void should_Throw_Exception_When_Withdrawing_Money_More_Than_Balance() {

		assertThrows(IllegalArgumentException.class, () -> {
			BankAccountService bas = new BankAccountService(100d);
			bas.withdraw(200d);
		});

	}
}