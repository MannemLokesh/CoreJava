package com.lokesh;

public class UnaryExample10 {
	public static void main(String[] args) {
		int i = 10;
		int j = -11;
		System.out.println(~i); // -(var + 1)
		// -(10 + 1) = -11 
		System.out.println(~j); // -(var + 1) 
		// -(-11 + 1) = -(-10) = 10 
		System.out.println(!false); 
		System.out.println(!true);
	}
}

//Output:
//-11
//10
//true
//false