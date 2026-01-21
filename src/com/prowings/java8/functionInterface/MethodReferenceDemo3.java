package com.prowings.java8.functionInterface;

import java.util.function.Function;

public class MethodReferenceDemo3 {
	
	public static void main(String[] args) {
		
		
		String input = "abcd";
		
		String output = convertToUpperCase(input);
		
		System.out.println("After convertion : "+convertToUpperCase(input));
		
		
	}

	public static String convertToUpperCase(String input) {
		
//		Function<String, String> f = (s) -> s.toUpperCase();
		Function<String, String> f = String::toUpperCase;
		
		return f.apply(input);
		
	}


}
