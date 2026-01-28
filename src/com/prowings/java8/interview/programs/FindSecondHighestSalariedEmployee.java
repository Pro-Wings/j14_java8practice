package com.prowings.java8.interview.programs;

import java.util.Comparator;
import java.util.List;

public class FindSecondHighestSalariedEmployee {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram", 100000);
		Employee emp5 = new Employee(50, "RajKumar", 120000);
		Employee emp2 = new Employee(20, "Laxman", 90000);
		Employee emp3 = new Employee(30, "Raj", 98000);
		Employee emp4 = new Employee(40, "Sachin", 78000);
		
		List<Employee> empList = List.of(emp2, emp1, emp4, emp3, emp5);
		
		//Find seconf highest salaried employee from given list
		
		Employee secondHighestSalariedEmp = findEmployee(empList);
		
		System.out.println("Second highest salaried employee is : "+secondHighestSalariedEmp);
	}

	public static Employee findEmployee(List<Employee> empList) {
		
//		empList.stream().sorted(new EmployeeSalaryComparator()).skip(empList.size()-2).limit(1).forEach(System.out::println);

		Employee res = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1).findFirst().get();

		return res;
	}

}
