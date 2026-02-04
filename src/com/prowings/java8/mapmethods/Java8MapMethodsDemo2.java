package com.prowings.java8.mapmethods;

import java.util.HashMap;
import java.util.Map;

public class Java8MapMethodsDemo2 {
	
	public static void main(String[] args) {
		
//		Map<String, Integer> myMap = Map.of("AAA",123, "BBB", 345, "CCC",678, "DDD",890);
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("AAA", 123);
		myMap.put("BBB", 345);
		myMap.put("CCC", 678);
		myMap.put("DDD", 890);
		
		System.out.println(myMap);
		
		//compute
		System.out.println("compute : "+myMap.compute("AAA", (k,v)-> v = v-10));
		System.out.println(myMap);
		
		//computeIfAbsent
		System.out.println("computeIfAbsent : "+myMap.computeIfAbsent("AAA", v->9999));
		System.out.println(myMap);
		
		//computeIfPresent
		System.out.println("computeIfPresent : "+myMap.computeIfPresent("BBB", (k,v)->v = v *2));
		System.out.println(myMap);
		
		//Merge
		System.out.println("merge : "+myMap.merge("YYY", 1111, (k,v)-> 8989));
		System.out.println(myMap);
		
		System.out.println("============FOR-EACH=============");
		
		myMap.forEach((k,v)->System.out.println("Key : "+k +"  "+"Value : "+v));
		
	}

}
