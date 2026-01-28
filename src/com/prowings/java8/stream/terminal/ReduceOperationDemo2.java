package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Optional;

public class ReduceOperationDemo2 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3);
//		List<Integer> numbers = List.of();
		
		//find sum of all nums from numbers
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of all numbers : "+sum);

		//find product of all nums from numbers
		Integer multiplication = numbers.stream().reduce(1, (a,b) -> a*b);
		System.out.println("Multiplication of all numbers : "+multiplication);
		
		//Sum of square of every element from numbers
		Integer sumOfSqure = numbers.stream().map(n-> n*n).reduce(0, Integer::sum);
		System.out.println("Sum Of Squre of each element : "+sumOfSqure);
	}

}
