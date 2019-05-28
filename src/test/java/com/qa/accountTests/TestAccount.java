package com.qa.accountTests;

import org.junit.Before;
import org.junit.Test;

public class TestAccount {
	Account account;
	AccountRepositoryMap arm;
	
	@Before
	public void setup() {
		account = new Account();
		arm = new AccountRepositoryMap();
	}
	
	@Test
	public void testCreateAccount() {
		assertEquals("Account was not created", "Account", account.getClass().getSimpleName());
	}
	
	@Test
	public void testAccountId() {
		account.setId(0);
		int id = account.getId();
		assertEquals("Account id not match", 0, id);
	}
	
	@Test
	public void testAccountFirstname() {
		account.setFirstname("Jay");
		String firstname = account.getFirstname();
		assertEquals("Account firstname not match", "Jay", firstname);
	}
	
	@Test
	public void testAccountSurname() {
		account.setFirstname("Hasmukhlal");
		String surname = account.getFirstname();
		assertEquals("Account surname not match", "Hasmukhlal", surname);
	}
	
	@Test
	public void testAccountNumber() {
		account.setAccountNumber(3);
		int accountNumber = account.getAccountNumber();
		assertEquals("Account number not match", 3, accountNumber);
	}
	
	@Test
	public void testCreateAccountRepositoryMap() {
		assertEquals("Account Repoitory Map was not created", "AccountRepositoryMap", arm.getClass().getSimpleName());
	}
	
	@Test
	public void testAccountRetrived() {
		int id = 2;
		account.setId(id);
		account.setFirstname("Jay");
		arm.add(account);
		Account retrievedAccount = arm.retrieve(id);
		assertEquals("Wrong account retrieved", account, retrievedAccount);
	}
}
