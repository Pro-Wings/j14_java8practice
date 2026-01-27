package com.prowings.java8.stream.terminal;

import java.util.List;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		List<String> names = List.of("Ram", "Sham", "Pravin", "Arun", "Sachin");
		
		System.out.println("-----------------------");

//		names.forEach(System.out::println);
		
		names.stream().forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		
		names.parallelStream().forEachOrdered(System.out::println);
		
		
	}

}
