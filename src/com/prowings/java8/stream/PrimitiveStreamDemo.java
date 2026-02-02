package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,11,12,14,13,15);
		
		System.out.println(nums.stream().filter(n -> n%2==0).collect(Collectors.toList()));

		System.out.println("-------------------------");
		IntStream.range(1, 20).forEach(System.out::print);
		
		System.out.println("-------------------------");
		List<Integer> numbers1to100 = IntStream
				.range(1, 101)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(numbers1to100);
	
	}

}
