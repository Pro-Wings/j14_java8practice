package com.prowings.java8.functionInterface;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
	
	public static void main(String[] args) {

		
		
		Function<String, Integer> calculateWordLength = (s) -> s.length();
		System.out.println(calculateWordLength.apply("Hello"));

		
		BiFunction<String, String, Integer> calculateWordLength2 = (s, u) -> s.length()+u.length();
		System.out.println(calculateWordLength2.apply("Hello","world"));
		
		
//		List<Integer> numbers = List.of(10,20,30,40,50);
		
		
	}

}
