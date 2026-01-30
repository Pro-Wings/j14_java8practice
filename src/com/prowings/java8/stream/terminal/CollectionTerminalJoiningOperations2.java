package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionTerminalJoiningOperations2 {
	
	public static void main(String[] args) {
		
		
		List<Student> stdList = List.of(new Student(30,"Ram",76.5f),
				new Student(10,"Sham",86.5f), 
				new Student(10,"Krishna",86.5f), 
				new Student(20,"Suraj",94.5f));
		
		System.out.println("Original Std List : "+stdList);

		//Return a all names of student comma separated,and name must be greater than 4 chars
		
		String names = stdList.stream()
				.map(Student::getName)
				.filter(s -> s.length()>4)
				.collect(Collectors.joining(", "));
		
		System.out.println(names);
		
	}

}
