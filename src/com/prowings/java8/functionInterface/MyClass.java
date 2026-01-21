package com.prowings.java8.functionInterface;

public class MyClass implements MyInterface{

	@Override
	public void m1() {
		
		System.out.println("Inside m1() impl from MyClass!!!");
		
	}
	
	public void m2()
	{
		MyInterface.super.m2();
//		System.out.println("inside m2() of MyClass!!");
	}


}
