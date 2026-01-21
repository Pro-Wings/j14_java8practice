package com.prowings.java8.functionInterface;

public class LambdaThisKeyword {
	
	
	public void m1()
	{
		Multiplication mul = (x, y, z) -> {
			int multiRes = x*y*z;
			System.out.println(this);
			System.out.println("Multiplication Result : "+multiRes);
		};
		
		mul.multiply(1, 5, 8);
	}

	@Override
	public String toString() {
		return "LambdaThisKeyword []";
	}



	public static void main(String[] args) {
		
		LambdaThisKeyword obj = new LambdaThisKeyword();
		
		obj.m1();
		
	}

	
	
}
