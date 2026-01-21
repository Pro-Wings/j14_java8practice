package com.prowings.java8.prerequisit;

public class AnnonymusClass {
	
	public static void main(String[] args) {
		
//		MyInterface obj = new MyClass();
//		obj.print("aaa");
		
		
		MyInterface obj = new MyInterface () {

//			@Override
//			public void print(String message) {
//				System.out.println("Message is : "+message);
//				
//			}

			
			@Override
			public boolean isEven(int number)
			{
				if(number % 2 == 0)
					return true;
				else
					return false;
			}
			
		};
				
//		obj.print("Hello ");
		
		System.out.println(obj.isEven(10));
		
		//Lambda
//		MyInterface m = (msg) -> System.out.println("The message is :"+msg);
		
//		m.print("Hello");
		
		MyInterface obj1 = (number) -> (number%2==0);
		
		System.out.println(obj1.isEven(11));
	}

}
