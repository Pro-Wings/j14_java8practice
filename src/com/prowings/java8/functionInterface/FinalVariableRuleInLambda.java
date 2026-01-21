package com.prowings.java8.functionInterface;

public class FinalVariableRuleInLambda {
	
	static int p = 10;
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		Addition add = (x, y) -> {
			System.out.println("p : "+p);
			int res = x + y;
			return res;
		};
		p = 20;
		System.out.println("main ended!!");
		
		
	}

}
