package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	
	public static void main(String[] args) {
		
		//scenario - Splitting sentences into words
		
		String scentence1 = "Hey Java developer";
		String scentence2 = "welcome to ProWings";
		
		List<String> scentences = List.<String>of(scentence1, scentence2);
		
		System.out.println(scentences);
		
		scentences.stream()
		.flatMap(s -> Arrays.stream(s.split(" ")))
		.forEach(System.out::println);
		
		//o/p - words from all given scentences
		
		
		//map simple example :
		
		List<String> words = List.of("aaa", "bbb", "ccc");
		
		words.stream().map(String::toUpperCase).forEach(System.out::println);
		words.stream().map(String::length).forEach(System.out::println);
		
		
	}

}
