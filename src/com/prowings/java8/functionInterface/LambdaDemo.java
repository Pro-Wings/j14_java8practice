package com.prowings.java8.functionInterface;

public class LambdaDemo {

	public static int x = 10;

	public static void main(String[] args) {

		int y = 10;
		
		Runnable r1 = () -> System.out.println("Inside RUN METHOD of Lambda!!!"+x);

		x = 20;
		r1.run();

	}

}
