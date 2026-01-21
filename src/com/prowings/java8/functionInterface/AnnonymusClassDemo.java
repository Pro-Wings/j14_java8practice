package com.prowings.java8.functionInterface;

public class AnnonymusClassDemo {
	
	public int x = 10;

	public static void main(String[] args) {
		
		Runnable r = new Runnable()
				{
					@Override
					public void run() {
						System.out.println("Inside run method!!!!");
					}
				};
		
				
		r.run();
		
		Runnable r1 = () -> System.out.println( "Inside RUN METHOD of Lambda!!!");
		
		r1.run();
		
		
		Addition add = (a, b) -> {
		    int sum = a + b;
		    return sum;
		};
		
		int res = add.sum(10, 20);
		
		System.out.println(res);
		
		
		
		
		Multiplication mul = (a,b,c) ->
								{
									int multiplicationRes = a*b*c;
									System.out.println();
									System.out.println("multiplication Result is: "+multiplicationRes);
								};
								
		mul.multiply(1, 2, 3);
	}

}
