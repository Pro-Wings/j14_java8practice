package com.prowings.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
	
	public static void main(String[] args) {
		
		//1. source - Array
		int[] primitiveNumbers = {1,2,3,5,6};

		Arrays.stream(primitiveNumbers)
			.filter(n -> n%2==0)
			.forEach(System.out::println);
		System.out.println("----------------------------");
		
		//2. source - collection (f/w)
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(5);
		nums.add(8);
		
		nums.stream()
		.filter(n -> n%2==0)
		.forEach(System.out::println);
		
		/*Note: 
		 * To get a stream from a map, you must first convert it into a Collection 
		 * view using one of its three "view" methods: 
		 * 1. entrySet() 2. keySet() and 3. values()
		 * and then obtain stream on these collection views.
		 */
		System.out.println("----------------------------");

		//3. of() of Stream 
		Stream.of(10,20,10,30,40,30).distinct().forEach(System.out::println);

		System.out.println("----------------------------");
		//4. Using Stream Builder
		Stream<String> streambuilderdemo = Stream.<String>builder()
				.add("aaa")
				.add("bbb")
				.add("aaa")
				.add("ccc")
				.build();
		streambuilderdemo.distinct().forEach(System.out::println);
		
		System.out.println("----------------------------");
		//5. Infinite Streams (iterate and generate)
		Stream<Integer> evenNumbers = Stream.iterate(2, n -> n + 2).limit(10);
		evenNumbers.forEach(System.out::println);

		System.out.println("----------------------------");
		Stream<Double> randomNumbers = Stream.generate(Math::random).limit(10);
		randomNumbers.forEach(System.out::println);
		
	}
	

}
