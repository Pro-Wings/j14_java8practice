package com.prowings.java8.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class MatchingTerminalOperationsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("-------------Shortcircuting demo-----------------");

		List<Integer> nums = Arrays.asList(10, 3, 4, 3, 8);

		boolean result = nums.stream()
		    .peek(n -> System.out.println("Processing: " + n)) // Visualizing the flow
		    .anyMatch(n -> n > 5);

		System.out.println("Result: " + result);
		
		System.out.println("------------------------------");
		
		System.out.println("-------------Non Shortcircuting demo-----------------");

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		names.stream()
		    .peek(name -> System.out.println("Checking: " + name))
		    .forEach(name -> {
		        if (name.equals("Bob")) {
		            System.out.println(">>> Found Bob! But I can't stop!");
		        }
		    });
		
		System.out.println("------------------------------");
		
		List<Integer> numbers = List.of(80,20,40,54,70,54);
		
		//find is there a number exist that greater than 60
		
//		boolean res = numbers.stream().anyMatch(n-> n>60);
//		
//		if(res)
//			System.out.println("Yes!! a number greater than 60 found!!");
//		else
//			System.out.println("No!! a number greater than 60 not found!!");
		
		System.out.println(numbers.stream().allMatch(n-> n>=60) ? "Yes!! a number greater than 60 found!!" : "No!! a number greater than 60 not found!!");
		
		//Check whether odd number present in given list
		
//		numbers.stream().anyMatch(n -> n%2 != 0);
		System.out.println(numbers.stream().anyMatch(n -> n%2 != 0) ? "Yes!! odd number found!!" : "No!! odd number not found!!");
	}

}
