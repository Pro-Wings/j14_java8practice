package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorGroupingByDemo {
	
	public static void main(String[] args) {
		
		
		List<String> names = List.of("Java", "Spring", "AWS", "Kafka", "Math", "CPP","Azure","Java");
		
		//Group Strings by Length
		
		Map<Integer, List<String>> res = names.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(res);

		
	}

}
