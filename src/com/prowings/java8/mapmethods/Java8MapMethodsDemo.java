package com.prowings.java8.mapmethods;

import java.util.HashMap;
import java.util.Map;

public class Java8MapMethodsDemo {
	
	public static void main(String[] args) {
		
//		Map<String, Integer> myMap = Map.of("AAA",123, "BBB", 345, "CCC",678, "DDD",890);
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("AAA", 123);
		myMap.put("BBB", 345);
		myMap.put("CCC", 678);
		myMap.put("DDD", 890);
		
		System.out.println(myMap);
		
		System.out.println(myMap.get("A"));
		System.out.println(myMap.getOrDefault("A", 1223));
		
		System.out.println("-----replaceAll------");
		myMap.replaceAll((k,v)-> v=v+1);
		
		System.out.println(myMap);

		System.out.println("-----putIfAbsent------");
		
		System.out.println(myMap.putIfAbsent("ZZZ", 11222));
		
		System.out.println(myMap);

		System.out.println("-----remove------");
		System.out.println(myMap.remove("ZZZ", 11222));
		
		System.out.println(myMap);

		System.out.println("-----replace------");
		System.out.println(myMap.replace("BBB", 11222));
		System.out.println(myMap);
		
		
	}

}
