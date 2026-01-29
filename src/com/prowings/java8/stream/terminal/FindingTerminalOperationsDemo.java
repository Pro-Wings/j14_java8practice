package com.prowings.java8.stream.terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingTerminalOperationsDemo {
	
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		Set<String> namesSet = new HashSet<>(names);
		
		System.out.println(names.stream().findFirst());

		System.out.println(names.parallelStream().findAny());
		
		
	}

}
