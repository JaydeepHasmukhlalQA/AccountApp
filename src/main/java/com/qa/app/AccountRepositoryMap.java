package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryMap implements AccountRepository {

	public Map<Integer, Account> map = new HashMap<Integer, Account>();
	
	public void add(Account account) {
		map.put(account.getId(), account);
	}

	public Account retrieve(int id) {
		return map.get(id);
	}

	@Override
	public void updateFirstname(int id, String newFirstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
