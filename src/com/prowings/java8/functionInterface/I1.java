package com.prowings.java8.functionInterface;

public interface I1 {
	
	default void print()
	{
		System.out.println("inside print() of I1 interface!!");
	}

	static void m1()
	{
		System.out.println("inside static method of I1 interface!!");
	}
	
}
