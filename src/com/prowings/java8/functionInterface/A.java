package com.prowings.java8.functionInterface;

public class A implements /* I1, */ I2{
	
	public void print()
	{
		I2.super.print();
		
		I1.m1();
	}

	@Override
	public void m3() {
		
		System.out.println("inside m3() impl of I2 in A!!");
		
	}

	
	
}
