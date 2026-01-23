package com.prowings.java8.functionInterface;

@FunctionalInterface
public interface FindMax {
	
	public int max(int a, int b);
	
	public boolean equals(Object o);
	
	int hashCode();

	public String toString();
	
	

}
