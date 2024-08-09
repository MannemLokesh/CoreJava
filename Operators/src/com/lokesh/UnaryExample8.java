package com.lokesh;

public class UnaryExample8 {
	public static void main(String[] args) {
		int i = 5;
		i--; // i= 4 
		int var= i + i-- - i + i-- + i; 
		// var= 4 + 4 - 3 + 3 + 2 = 10
		System.out.println(var); 
		System.out.println(i);
	}
}

//Output:
//10
//2