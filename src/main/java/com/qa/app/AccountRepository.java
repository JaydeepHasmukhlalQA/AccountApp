package com.qa.app;

public interface AccountRepository {

	public void add(Account account);
	public Account retrieve(int id);
	public void updateFirstname(int id, String newFirstName);
	public void remove(int id);
}
