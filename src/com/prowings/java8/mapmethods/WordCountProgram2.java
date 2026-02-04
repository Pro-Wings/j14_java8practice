package com.prowings.java8.mapmethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountProgram2 {
	
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
		
		Map<String, Integer> wordCountMap = new HashMap<>();
		
		
		for(String word : sentence.split(" "))
		{
			if(null != wordCountMap.putIfAbsent(word, 1))
				wordCountMap.merge(word, 1, (oldV,newV)->newV = oldV+1);
		}
		
		wordCountMap.forEach((k,v)->System.out.println("Word : "+k +"  "+v));

		
	}

}
