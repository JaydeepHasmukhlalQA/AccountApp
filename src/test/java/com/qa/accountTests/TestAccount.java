package com.qa.accountTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.AccountRepositoryDB;
import com.qa.app.AccountRepositoryMap;

public class TestAccount {
	Account account;
	AccountRepositoryMap arm;
	AccountRepositoryDB ard;
	
	@Before
	public void initSetup() {
		account = new Account();
		ard = new AccountRepositoryDB();
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
		account.setSurname("Hasmukhlal");
		String surname = account.getSurname();
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
	public void testAccountAddAndRetrived() {
		int id = 2;
		account.setId(id);
		account.setFirstname("Jay");
		arm.add(account);
		Account retrievedAccount = arm.retrieve(id);
		assertEquals("Wrong account retrieved", account, retrievedAccount);
	}
	
	@Test
	public void testCreateAccountRepositoryDB() {
		assertEquals("Account Repoitory DB was not created", "AccountRepositoryDB", ard.getClass().getSimpleName());
	}
	
	@Test
	public void testAccountAddAndRetrieved() {
		account.setFirstname("Jay");
		ard.add(account);
		int id = account.getId();
		Account retrievedAccount = ard.retrieve(id);
		assertEquals("Wrong account retrieved", account, retrievedAccount);
	}
	
	@Test
	public void testAccountRepositoryUpdate() {
		account.setFirstname("Jay");
		ard.add(account);
		ard.updateFirstname(account.getId(), "JoJo");
		assertEquals("Wrong name updated", "JoJo", account.getFirstname());
	}
	
	@Test
	public void testAccountRepositoryRemove() {
		account.setFirstname("Bad name");
		ard.add(account);
		ard.remove(account.getId());
		assertEquals("Did not remove account", null, "Bad name");
	}
}
