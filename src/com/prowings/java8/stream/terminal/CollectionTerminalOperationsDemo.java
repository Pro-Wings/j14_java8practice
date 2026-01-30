package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionTerminalOperationsDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,2,8,3,2,6,6,65);
		System.out.println("Original numbers list : "+numbers);
		
		//filter even numbers
		Set<Integer> evenNumbers = numbers.stream()
				.filter(n -> n %2 == 0)
				.collect(Collectors.toSet());
	
		System.out.println("Even numbers list : "+evenNumbers);
		
		TreeSet<Integer> sortedEvenNumbers = numbers.stream()
				.filter(n -> n %2 == 0)
				.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println("Sorted Even numbers list : "+sortedEvenNumbers);
	}

}
