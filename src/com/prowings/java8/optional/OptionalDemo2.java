package com.prowings.java8.optional;

import java.util.Optional;

public class OptionalDemo2 {
	
	public static void main(String[] args) {
		
		//Optional creation
		Optional<String> name1 = Optional.of("hello");
		Optional<String> name2 = Optional.ofNullable(null);
		Optional<String> name3 = Optional.empty();
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		//methods to extract/unwrapp the optional container
		
		String res1 = name1.get();
		System.out.println("get() result = "+res1);

//		String res3 = name3.get();
//		System.out.println("get() result = "+res3);

//		String res2 = name2.get(); //it will throw NosuchElementEx
		
		//orElse - this is Eager - means, even of Optional is empty or not, the variable "other" will always get initialized 
		String res2 = name2.orElse("");
		System.out.println("orElse() result = "+res2);

		//orElseGet - this is Lazy - means Lambda will only execute if Optional is empty
		String res3 = name2.orElseGet(()-> "helloInLambda");
		System.out.println("orElseGet() result = "+res3);

//		String res4 = name2.orElseThrow(()-> new RuntimeException("not allowed as name2 is empty!!"));
//		System.out.println("orElseThrow() result = "+res4);
		
		
//		Optional<String> status = Optional.ofNullable(null);
//		Optional<String> status = Optional.empty();
		Optional<String> status = Optional.ofNullable("Active");
		
		status.ifPresent((s)->System.out.println("Status is : "+s));
		
		Optional<String> input = Optional.ofNullable(null);
		
		input.ifPresentOrElse(
		        val -> System.out.println("Received: " + val),
		        () -> System.out.println("Nothing received!")
		    );
	}

}
