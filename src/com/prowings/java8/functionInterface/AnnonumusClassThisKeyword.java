package com.prowings.java8.functionInterface;

public class AnnonumusClassThisKeyword {
	
	public static void test()
	{
		Addition add = new Addition() 
		{
			@Override
			public int sum(int a, int b) {
				int res = a + b;
				System.out.println(this);
				return res;
			}
			
			@Override
			public String toString() {
				return "AnnonumusInnerClass[]";
			}
			
		};
		
		add.sum(10, 20);
	}

	@Override
	public String toString() {
		return "AnnonumusOuterClassThisKeyword []";
	}
	
	public void test2()
	{
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		System.out.println("main started!!");
		AnnonumusClassThisKeyword obj = new AnnonumusClassThisKeyword();
		test();
		obj.test2();
		System.out.println("main ended!!");

	}

}
