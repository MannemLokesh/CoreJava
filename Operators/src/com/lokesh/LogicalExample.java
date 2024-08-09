package com.lokesh;

public class LogicalExample {
	public static void main(String[] args) {
		int x = 4;
		System.out.println(x > 5 && x < 10);
		System.out.println(x > 9 || x < 1);
		System.out.println(!(x > 5 && x < 10));
	}
}

/*
* Output
* 
* false
* false
* true
*
*/