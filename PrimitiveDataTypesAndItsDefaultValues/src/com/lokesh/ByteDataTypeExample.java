package com.lokesh;

public class ByteDataTypeExample {

	public static void main(String[] args) {
		
		/*
		 * The byte data type is an example of primitive data type. It is an 8-bit signed two's complement integer. 
		 * Its value-range lies between -128 to 127 (inclusive). 
		 * Its minimum value is -128 and maximum value is 127. Its default value is 0.
		 * 
		 * 
		 * The byte data type is used to save memory in large arrays where the memory savings is most required. 
		 * It saves space because a byte is 4 times smaller than an integer. 
		 * It can also be used in place of "int" data type.
		 */
		byte a = 10; byte b = -20;
		
		System.out.println("a :: " + a);
		System.out.println("b :: " + b);
	}

}
