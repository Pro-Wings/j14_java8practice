package com.prowings.java8.functionInterface;

import java.util.function.Consumer;

public class MethodReferenceDemo2 {
	
	public static void main(String[] args) {
		
//		Consumer<String> c = (s) -> System.out.println(s);
		Consumer<String> c = System.out::println;
		
		c.accept("Hello");
		
		//Instance type Method Reference
		Writer writerObj = new Writer();
		
		Consumer<String> w = writerObj::write;
		
		w.accept("DATTTTTTTTTTTTTTTTTTTTTAAAAAAAAAAAAAAAAA");
		
	}


}
