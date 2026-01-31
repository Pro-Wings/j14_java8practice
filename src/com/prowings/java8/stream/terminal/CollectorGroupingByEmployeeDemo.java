package com.prowings.java8.stream.terminal;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectorGroupingByEmployeeDemo {
	
	public static void main(String[] args) {
		
		List<Employee> empList = List.of(
				new Employee(10, "Ram", "IT", 89999),
				new Employee(20, "Sham", "HR", 45000),
				new Employee(30, "Arun", "IT", 90000),
				new Employee(40, "Sameer", "HR", 55000),
				new Employee(50, "Niranjan", "IT", 70000)
				);
		
		//Group Employees by Department
		
		Map<String, List<Employee>> empGroupDeptWise = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println(empGroupDeptWise);
		
		//Give dept wise count of employees
		
		Map<String, Long> deptWiseCount = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(deptWiseCount);
		
		//Give total salary of emps - department wise
		Map<String, Long> deptWiseSalary = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingLong(Employee::getSalary)));
				
		System.out.println("Dept wise total salary : "+deptWiseSalary);

		//Give Average salary of emps - department wise
		Map<String, Double> deptAvgWiseSalary = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getSalary)));
		
		System.out.println("Dept wise Average salary : "+deptAvgWiseSalary);

		//Give Names of emps - department wise
		
		Map<String, List<String>> deptWiseEmpNames = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

		System.out.println("Dept wise Emp Names : "+deptWiseEmpNames);

	
		//Dept wise highest salaried emp : Approach 1 - using groupingBy
		
		Map<String, Optional<Employee>> deptWiseHighestSalariedEmp = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))
						));
		
		System.out.println("Dept wise highest salaried emp : "+deptWiseHighestSalariedEmp);
		
		//Dept wise highest salaried emp : Approach 1 - using toMap
		
		Map<String, Employee> map =
				empList.stream()
			             .collect(Collectors.toMap(
			                 Employee::getDepartment,
			                 e -> e,
			                 BinaryOperator.maxBy(
			                     Comparator.comparingDouble(Employee::getSalary)
			                 )
			             ));
		
		System.out.println("[Approach 2] Dept wise highest salaried emp : "+map);
		
		//Dept wise second highest salaried emp 
		
		Map<String, Optional<Employee>> deptWiseSecondHighestSalariedEmp = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.collectingAndThen(Collectors.toList(), emps -> emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst())
						));
		
		System.out.println("Dept wise second highest salaried emp : "+deptWiseSecondHighestSalariedEmp);
		
		
		DoubleSummaryStatistics stats = empList.stream()
	             .collect(Collectors.summarizingDouble(Employee::getSalary));
		
		
		System.out.println(stats);
		
		System.out.println("AVERAGE : "+stats.getAverage());
		System.out.println("COUNT : "+stats.getCount());
		System.out.println("MAX : "+stats.getMax());
		System.out.println("MIN : "+stats.getMin());
		System.out.println("SUM : "+stats.getSum());
	}

}
