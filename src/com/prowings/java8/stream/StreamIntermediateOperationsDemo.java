package com.prowings.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.prowings.java8.prerequisit.StringDecendingComparator;

public class StreamIntermediateOperationsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70);
		
		System.out.println("-----filter--------");
		numbers.stream()
			.filter(n-> n>10).forEach(System.out::println);
		
		System.out.println("-----map--------");
		System.out.println(numbers);
		
		numbers.stream().map(n->n/2).forEach(System.out::println);
		
		System.out.println("-----flatmap--------");
		
		List<Integer> num1 = Arrays.asList(10,20,30);
		List<Integer> num2 = Arrays.asList(30,40,50);
		List<Integer> num3 = Arrays.asList(60,70,80);
		
//		List<List<Integer>> numsList = Arrays.asList(num1,num2,num3);
		
//		List<List<Integer>> numsList = List.of(num1,num2,num3);

		List<List<Integer>> numsList = new ArrayList<>();
		numsList.add(num1);
		numsList.add(num2);
		numsList.add(num3);
		
		System.out.println(numsList);
		
//		List<Integer> combinedList = new ArrayList<>();
//		for(List<Integer> lst : numsList)
//		{
//			combinedList.addAll(lst);
//		}
//		System.out.println(combinedList);
		
		numsList.stream().flatMap(list -> list.stream()).forEach(System.out::println);
		
		System.out.println("-----distinct--------");
		
		List<String> words = Arrays.asList("hello", "abc", "hello","pqr","abc");
		
		System.out.println("original list: "+words);
		
		words.stream().distinct().forEach(System.out::println);
		
		System.out.println("original list after distinct : "+words);
		
		System.out.println("-----sorted--------");
		
//		words.stream().sorted().forEach(System.out::println);
		words.stream().sorted(new StringDecendingComparator()).forEach(System.out::println);
		
		System.out.println("-----limit--------");
		
		System.out.println(numbers);
		
		numbers.stream().limit(3).forEach(System.out::println);

		System.out.println("-----skip--------");
		
		System.out.println(numbers);
		
		numbers.stream().skip(3).forEach(System.out::println);
		
		System.out.println("-----peek--------");
		
		System.out.println(numbers);
		
		numbers.stream()
	    .peek(n -> System.out.println("Before: " + n))
	    .map(n -> n * 2)
	    .peek(n -> System.out.println("After: " + n))
	    .forEach(System.out::println);

		
		System.out.println("main method ended!!");
	}

}
