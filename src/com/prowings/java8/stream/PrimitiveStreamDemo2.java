package com.prowings.java8.stream;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class PrimitiveStreamDemo2 {
	
	public static void main(String[] args) {
		
		List<Student> stdList = List.of(
				new Student(10, "Ram", 89.5),
				new Student(20, "Arun", 69.5),
				new Student(30, "Sachin", 79.0),
				new Student(40, "Shiv", 99.9)
				);
		
		//Give sum of all marks of all students
		
//		double sumOfAllMarks = stdList.stream()
//				.map(Student::getMarks)
//				.reduce(0.0, (m1, m2)-> m1+m2);
		

		DoubleSummaryStatistics marksStats = stdList.stream()
				.mapToDouble(Student::getMarks)
				.summaryStatistics();
		
		System.out.println("Max marks : "+marksStats.getMax());
		System.out.println("Min marks : "+marksStats.getMin());
		System.out.println("AVG marks : "+marksStats.getAverage());
		System.out.println("SUM marks : "+marksStats.getSum());
	}

}
