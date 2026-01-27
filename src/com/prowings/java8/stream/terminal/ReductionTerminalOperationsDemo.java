package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;

public class ReductionTerminalOperationsDemo {

	public static void main(String[] args) {
		
		List<String> names = List.of("Ram", "Sham", "Pravin", "Arun", "Sachin");

		System.out.println(names.stream().min(String::compareTo));
		System.out.println(names.stream().max(String::compareTo));
		
		
		System.out.println("-----------------------");

		long count = names.stream().count();
		System.out.println("count is : "+count);
		System.out.println("size is : "+names.size());
		System.out.println("-----------------------");
		
		List<Integer> numbers = List.of(10,30,50,6,96,60,80);
		
		Optional<Integer> minNum = numbers.stream().min(Integer::compareTo);
		System.out.println(minNum.get());
		
		Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);
		System.out.println(maxNum.get());
		
		System.out.println("-----------------------");
		
		List<Student> stdList = List.of(new Student(30,"Ram",76.5f), new Student(10,"Sham",86.5f), new Student(20,"Suraj",94.5f));
		
		Optional<Student> minStd1 = stdList.stream().min(new StudentRollNumberComparator());
		System.out.println(minStd1);
		
		Optional<Student> maxStd = stdList.stream().max(new StudentMarksComparator());
		System.out.println(maxStd);
		
		//Find second highest mark obtained student
		
		System.out.println("---- Find second highest mark obtained student ----");
		stdList.stream().sorted(new StudentMarksComparator()).limit(2).skip(1).forEach(System.out::println);
	}

}
