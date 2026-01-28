package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Optional;

public class ReduceOperationDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10,20,30,40,50);

		Integer res = numbers.stream().reduce(0,(a, b)-> a+b);
		
		System.out.println("Sum is : "+res);
		
		List<String> words = List.of("India", "is", "beautiful");
		
		//Take above words and return a sentence out of it
		
		Optional<String> sentance = words.stream().reduce((s1,s2) -> s1+" "+s2);
		
		System.out.println("Sentance is :"+sentance.get());
		
		//Find total number of chars from words
		Optional<Integer> charCount = words.stream().map(s -> s.length()).reduce((n1,n2)-> n1+n2);
		
		System.out.println("Total number of chars : "+charCount);
		
		Optional<String> convertedWords = words.stream().reduce((word1,word2) -> word1.toUpperCase()+word2.toUpperCase());
		
		System.out.println(convertedWords);
	}

}
