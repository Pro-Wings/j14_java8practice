package com.prowings.java8.optional;

import java.util.Optional;

public class Animal {
	
	private int id;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
