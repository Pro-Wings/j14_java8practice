package com.prowings.java8.stream.terminal;

import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getRollNumber() > s2.getRollNumber())
			return 9;
		else if(s1.getRollNumber() < s2.getRollNumber())
			return -9;
		else 
			return 0;

	}
	
	

}
