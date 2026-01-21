package com.prowings.java8.functionInterface;

public interface MyInterface {
	
	public void m1();
	
	default void m2()
	{
		System.out.println("inside default m2() of MyInterface!!");
	}

}
