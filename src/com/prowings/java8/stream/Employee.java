package com.prowings.java8.stream;

import java.util.List;

public class Employee {

	private int eid;
	private String name;
	private List<String> phones;

	public Employee() {
	}

	public Employee(int eid, String name, List<String> phones) {
		super();
		this.eid = eid;
		this.name = name;
		this.phones = phones;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phones=" + phones + "]";
	}

}
