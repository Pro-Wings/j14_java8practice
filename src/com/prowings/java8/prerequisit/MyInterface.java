package com.prowings.java8.prerequisit;


public interface MyInterface {
	
//	public void print(String message);

	public boolean isEven(int n);
	
	default void printHello()
	{
		System.out.println("Hello!!");
	}
}
