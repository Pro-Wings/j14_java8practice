package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionTerminalOperationsDemo3 {
	
	public static void main(String[] args) {
		
		
		List<Student> stdList = List.of(new Student(30,"Ram",76.5f),
				new Student(10,"Sham",86.5f), 
				new Student(10,"Krishna",86.5f), 
				new Student(20,"Suraj",94.5f));
		
		System.out.println("Original Std List : "+stdList);
		
		//Give list of names of all Students
		
		List<String> names = stdList.stream()
				.map(Student::getName)
				.collect(Collectors.toList());
		
		System.out.println("Names of all students : "+names);

		//------ same can be achived using Collector's mapping()
		TreeSet<String> names2 = stdList.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toCollection(TreeSet::new)));
		
		System.out.println("Names of all students : "+names2);
		
	}

}
