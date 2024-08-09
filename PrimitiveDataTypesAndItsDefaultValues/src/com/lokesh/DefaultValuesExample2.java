package com.lokesh;

public class DefaultValuesExample2 {
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	float floatVariable;
	double doubleVariable;
	boolean booleanVariable;
	char charVariable;

	public static void main(String[] args) {
		
		DefaultValuesExample2 defaultValues = new DefaultValuesExample2();
		
		System.out.println("byteVariable :: " + defaultValues.byteVariable); //default value is 0
		System.out.println("shortVariable :: " + defaultValues.shortVariable); //default value is 0
		System.out.println("intVariable :: " + defaultValues.intVariable); //default value is 0
		System.out.println("longVariable :: " + defaultValues.longVariable); //default value is 0
		System.out.println("floatVariable :: " + defaultValues.floatVariable); //default value is 0.0
		System.out.println("doubleVariable :: " + defaultValues.doubleVariable); //default value is 0.0
		System.out.println("booleanVariable :: " + defaultValues.booleanVariable); //default value is false
		System.out.println("charVariable :: " + defaultValues.charVariable); //it will result 1 space. '\u0000'
		
	}

}
