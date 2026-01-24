package com.prowings.java8.stream;

import java.util.List;

public class FlatMapDemo2 {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram", List.of("123","345"));
		Employee emp2 = new Employee(20, "Sham", List.of("789","888"));
		Employee emp3 = new Employee(30, "Arun", List.of("4545","999"));
		
		List<Employee> empList = List.of(emp1,emp2,emp3);
 		
		//Requirement - Extract all phones from all employees into a single masterlist of phones
		
		empList.stream().flatMap(e -> e.getPhones().stream()).forEach(System.out::println);
		
	}

}
