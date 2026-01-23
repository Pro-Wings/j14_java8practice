package com.prowings.java8.functionInterface;

public class AnnonymusClassDemo {

	public int x = 10;

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside run method!!!!");
			}
		};

		r.run();

	}

}
