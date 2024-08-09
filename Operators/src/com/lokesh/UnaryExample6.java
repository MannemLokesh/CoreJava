package com.lokesh;

public class UnaryExample6 {
	public static void main(String[] args) {
		int i = 5;
		i++; // i=6 
		int var= i + i++ + i++ + i; 
		//  var= 6 + 6 + 7 + 8 = 27
		System.out.println(var);
		System.out.println(i);
	}
}

//Output:
//27
//8