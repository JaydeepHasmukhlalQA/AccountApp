package com.qa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountRepositoryDB implements AccountRepository {
	final String persistenceUnitName = "myPU";
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	@Override
	public void add(Account account) {
		et.begin();
		em.persist(account);
		et.commit();
	}

	@Override
	public Account retrieve(int id) {
		return em.find(Account.class, id);
	}

	@Override
	public void updateFirstname(int id, String newFirstName) {
		et.begin();
		Account retrievedAccount = this.retrieve(id);
		retrievedAccount.setFirstname(newFirstName);
		et.commit();
	}

	@Override
	public void remove(int id) {
		et.begin();
		em.remove(id);
		et.commit();
	}

}
