package com.prowings.java8.stream.terminal;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionTerminalJoiningOperations3 {
	
	public static void main(String[] args) {
		
		String sentences = "Hey Java developer Java";
		
		/*
		 * O/p = 
		 * 
		 * Hey - H,e,y
		 * Java - J,a,v,a
		 * developer - d,e,v,e,l,o,p,e,r
		 */
		
		Map<String, String> wordToCharMap = 
				Arrays.stream(sentences.split(" "))
//				.collect(Collectors.toMap(word -> word, word ->String.join(",", word.split(""))));

				//to handle duplicate keys, added mergefunction in toMap collector
				.collect(Collectors.toMap(word -> word, word ->String.join(",", word.split("")), (oldword,newword)->newword));
		
		System.out.println(wordToCharMap);
	}

}
