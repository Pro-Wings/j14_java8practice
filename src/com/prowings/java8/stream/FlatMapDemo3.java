package com.prowings.java8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatMapDemo3 {
	
	public static void main(String[] args) {
		
		/*
		 * You have a Map<String, List<String>> representing a Department and its Employees. 
		 * How do you get a list of all employees across all departments?
		 */
		
		Map<String, List<String>> deptWiseEmployee = new HashMap<>();
		deptWiseEmployee.put("IT", List.of("Ram","Sham"));
		deptWiseEmployee.put("HR", List.of("Anita","Shree"));
		deptWiseEmployee.put("Accounts", List.of("Aniket","Ranjit","Sachin"));
		
		//print all employee names from all dept
		
		deptWiseEmployee.values().stream().flatMap(s -> s.stream()).forEach(System.out::println);
	}

}
