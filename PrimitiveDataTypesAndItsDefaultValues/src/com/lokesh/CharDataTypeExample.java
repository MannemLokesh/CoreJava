package com.lokesh;

public class CharDataTypeExample {

	public static void main(String[] args) {
		
		/*
		 * The char data type is a single 16-bit Unicode character. 
		 * Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
		 * The char data type is used to store characters.
		 */
		
		char letterA = 'A';
		
		System.out.println("letterA :: " + letterA);
		
		// Why char uses 2 byte in java and what is \u0000 ?
		
		/*
		 * It is because java uses Unicode system not ASCII code system. 
		 * The \u0000 is the lowest range of Unicode system. To get detail explanation about Unicode visit next page.		 
		 */
				
	}

}
