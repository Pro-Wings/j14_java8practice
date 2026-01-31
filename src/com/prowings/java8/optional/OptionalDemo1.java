package com.prowings.java8.optional;

import java.util.Optional;

public class OptionalDemo1 {
	
	public static void main(String[] args) {
		
		//Optional creation
		
		Optional<String> name1 = Optional.of("hello");
		Optional<String> name2 = Optional.ofNullable(null);
		Optional<String> name3 = Optional.empty();
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println("Name1 - isPresent : "+name1.isPresent());
		System.out.println("Name1 - isEmpty : "+name1.isEmpty());

		System.out.println(name2.isPresent());
		System.out.println(name2.isEmpty());
		
		System.out.println(name3.isPresent());
		System.out.println(name3.isEmpty());
		
		name1.ifPresent(System.out::println);
	}

}
