package com.prowings.java8.stream.terminal;

import java.util.List;
import java.util.Optional;

public class ReduceOperationDemo3 {
	
	public static void main(String[] args) {
		
		//Find longest string 
		
		List<String> words = List.of("India", "is", "beautiful");
//		List<String> words = List.of();
		
		Optional<String> logestWord = words.stream().reduce((w1,w2)->{
			if(w1.length() > w2.length())
				return w1;
			else
				return w2;
		});
		
		if(logestWord.isPresent())
			System.out.println(logestWord.get());
		else
			System.out.println("NA");
		
	}

}
