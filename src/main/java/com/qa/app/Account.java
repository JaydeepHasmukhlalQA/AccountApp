package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String firstname;
	private String surname;
	private int accountNumber;
	private String address;
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return this.firstname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
