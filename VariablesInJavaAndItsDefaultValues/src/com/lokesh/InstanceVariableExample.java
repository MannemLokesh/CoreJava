package com.lokesh;

public class InstanceVariableExample {
	
	int age = 20; //instance variable
	
	public static void main(String[] args) {
		
		/*------------------
		 * Instance Variable
		 * -----------------
		 * 
		 * A variable declared inside the class but outside the body of the method, is called an instance variable. 
		 * It is not declared as static.
		 * 
		 * It is called an instance variable because its value is instance-specific and is not shared among instances.
		 */
	
		InstanceVariableExample instanceVariableExample = new InstanceVariableExample();
		
		System.out.println("data :: " + instanceVariableExample.age);

	}
}
