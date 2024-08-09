package com.lokesh;

public class LongDataTypeExample {

	public static void main(String[] args) {
		
		/*
		 * The long data type is a 64-bit two's complement integer. 
		 * Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). 
		 * Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807. 
		 * Its default value is 0. The long data type is used when you need a range of values more than those provided by int.
		 */
		long a = 100000L; long b = -200000L;
		
		System.out.println("a :: " + a);
		System.out.println("b :: " + b);
	}

}
