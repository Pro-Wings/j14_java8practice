package com.prowings.java8.stream;

import java.util.List;

public class ParallelStreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10,20,3050,6060,7080,8909,340,340230,120,03545);
		
		System.out.println("Sequential Stream : ");
		numbers.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------");
		System.out.println("Parallel Stream : ");
		
		numbers.parallelStream().forEach(System.out::println);
//		numbers.stream().parallel();
		
		
	}

}
