package com.prowings.java8.stream;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,20,40,607,89);
		
		Stream<Integer> s = list.stream();
		s.forEach(System.out::println);
		s.count();
		
	}

}
