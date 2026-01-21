package com.prowings.java8.prerequisit;

public interface InterfaceMain {
	
	public void m1();

	public void m2();

	default void m3()
	{
		System.out.println("inside default m3() in interface!!");
	}
}
