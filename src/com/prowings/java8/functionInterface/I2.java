package com.prowings.java8.functionInterface;

@FunctionalInterface
public interface I2 {
	
	//abstract method
	public void m3();
	
	//default method
	default void print()
	{
		System.out.println("inside print() of I2 interface!!");
	}

	//static method
	public static void m4()
	{
		System.out.println("inside static method m4() of interface I2!!");
	}
	
	//Object class method
	public boolean equals(Object o);
}
