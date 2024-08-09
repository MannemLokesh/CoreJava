package com.lokesh;

public class DefaultValuesExample1 {
	static byte byteVariable;
	static short shortVariable;
	static int intVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static char charVariable;

	public static void main(String[] args) {
		
		System.out.println("byteVariable :: " + byteVariable); //default value is 0
		System.out.println("shortVariable :: " + shortVariable); //default value is 0
		System.out.println("intVariable :: " + intVariable); //default value is 0
		System.out.println("longVariable :: " + longVariable); //default value is 0
		System.out.println("floatVariable :: " + floatVariable); //default value is 0.0
		System.out.println("doubleVariable :: " + doubleVariable); //default value is 0.0
		System.out.println("booleanVariable :: " + booleanVariable); //default value is false
		System.out.println("charVariable :: " + charVariable); //it will result 1 space
		
	}

}
