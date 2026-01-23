package com.prowings.java8.prerequisit;

import java.util.Comparator;

public class StringDecendingComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.compareTo(s2) > 0)
			return -2;
		else if(s1.compareTo(s2) < 0)
			return 2;
		else
			return 0;
			
		
	}

}
