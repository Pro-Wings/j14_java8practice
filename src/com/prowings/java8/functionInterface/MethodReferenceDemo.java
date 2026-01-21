package com.prowings.java8.functionInterface;

import java.util.function.Function;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		
		String numberInString = "100";
		Integer convertedNumber = converter(numberInString);
		System.out.println(convertedNumber);
	}

	private static Integer converter(String numberInString) 
	{
//		Function<String, Integer> f = (s) -> Integer.parseInt(s);
		
		Function<String, Integer> f = Integer::parseInt;
		
		Integer num = f.apply(numberInString);
		return num;
	}

}
