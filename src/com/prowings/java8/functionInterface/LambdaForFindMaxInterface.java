package com.prowings.java8.functionInterface;

public class LambdaForFindMaxInterface {
	
	public static void main(String[] args) {
		
		//Lambda for an existing method
		FindMax mx = (a, b) -> Math.max(a, b);
		
		System.out.println(mx.max(10, 30));
		
		//If your lambda is calling to any exsting method, then no need to write/impl lambda, instead usr Method Reference (::)
		FindMax mx1 = Math::max;
		System.out.println(mx1.max(10, 30));
		
	}

}
