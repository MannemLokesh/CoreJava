package com.lokesh;

public class UnaryExample5 {
	public static void main(String[] args) {
		int i = 5;
		++i; // i=6 
		int var = i + ++i + ++i + i; 
		// var = 6 + 7 + 8 + 8 = 29
		System.out.println(var);
		System.out.println(i);
	}
}

//Output:
//29
//8