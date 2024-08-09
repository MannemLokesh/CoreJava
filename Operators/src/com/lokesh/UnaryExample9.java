package com.lokesh;

public class UnaryExample9 {
	public static void main(String[] args) {
		int i = 5;
		i--; // i= 4 
		int var= i + i-- + ++i - --i + i++ - i; 
		// var= 4 + 4 + 4 - 3 + 3 -4 = 8
		System.out.println(var); 
		System.out.println(i);
	}
}

//Output:
//8
//4