package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionTerminalOperationsDemo2 {
	
	public static void main(String[] args) {
		
		
		List<Student> stdList = List.of(new Student(30,"Ram",76.5f),
				new Student(10,"Sham",86.5f), 
				new Student(10,"Krishna",86.5f), 
				new Student(20,"Suraj",94.5f));
		
		System.out.println("Original Std List : "+stdList);
		
		//Create a Map - Key = RollNumber Value = Name of the Student
		
		Map<Integer, String> rollToNameMap = stdList.stream()
//				.collect(Collectors.toMap(Student::getRollNumber, Student::getName));
				.collect(Collectors.toMap(Student::getRollNumber, Student::getName, (existingValue, newValue) -> newValue));
		
		System.out.println(rollToNameMap);
	}

}
