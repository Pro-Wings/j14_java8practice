package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionTerminalJoiningOperations {
	
	public static void main(String[] args) {
		
		
//		List<Student> stdList = List.of(new Student(30,"Ram",76.5f),
//				new Student(10,"Sham",86.5f), 
//				new Student(10,"Krishna",86.5f), 
//				new Student(20,"Suraj",94.5f));
//		
//		System.out.println("Original Std List : "+stdList);

		
		List<String> sentences = List.of("Hey Java developers", "welcome to Java8", "Java8 supports functional programming");
		
		//Give a single sentence 
		
//		String combinedStmts = sentences.stream()
//				.reduce("", (s1,s2) -> s1.concat(s2));

		String combinedStmts = sentences.stream()
//				.collect(Collectors.joining());
//				.collect(Collectors.joining(","));
				.collect(Collectors.joining(",","{", "}"));
		
		
		System.out.println("Combined sentances : "+combinedStmts);
		
		System.out.println("-------------------SCN 2-----------------------");
		
		//I/p : below list of words
		
		List<String> words = List.of("India","is"," ", "beautiful","country", "india", "is", "strongest","country");
		
		//O/p : [India, is, beautiful, country]
		
		String result = words.stream()
				.filter(s-> s!=null && !s.trim().isEmpty())
				.map(String::toUpperCase)
				.distinct()
				.sorted()
				.collect(Collectors.joining(", ", "[", "]"));
		
		System.out.println("Final Res: "+result);
		
	}

}
