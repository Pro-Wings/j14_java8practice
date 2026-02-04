package com.prowings.java8.mapmethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountProgram {
	
	public static void main(String[] args) {
		
		//Input:
		String sentence = "Hey Java developer Java is OOO Language Java is developer friendly developer";
		/*
		 * Word = occurance
		 * Hey - 1
		 * Java -3
		 * ...
		 */
		
		//Way 1 :
		
		Map<String, Long> wordCountMap = Arrays.stream(sentence.split(" "))
	            .collect(Collectors.groupingBy(
	                    (word -> word), // Use the word itself as the Key
	                    Collectors.counting() // Count the occurrences as the Value
	                ));
		
		System.out.println(wordCountMap);
		
		System.out.println("------------------------------------------");
		
		//Way 2:
		
		Map<String, Integer> wordCountMap2 = new HashMap<>();
		
		for(String word : sentence.split(" "))
			wordCountMap2.merge(word, 1, (oldVal, newVal)->newVal = oldVal+1);
		
		wordCountMap2.forEach((k,v)->System.out.println("Word : "+k +"  "+v));

		
	}

}
