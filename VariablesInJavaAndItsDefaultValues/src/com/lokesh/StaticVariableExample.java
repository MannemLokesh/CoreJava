package com.lokesh;

public class StaticVariableExample {
	
	static int m = 100;//static variable  
	
	public static void main(String[] args) {
		
		/*----------------
		 * Static variable
		 * ---------------
		 * 
		 * A variable that is declared as static is called a static variable. It cannot be local. 
		 * You can create a single copy of the static variable and share it among all the instances of the class. 
		 * Memory allocation for static variables happens only once when the class is loaded in the memory.
		 * 
		 */
		
		
		System.out.println("data :: " + m);
		
		StaticVariableExample staticVariableExample = new StaticVariableExample();
		
		System.out.println("data of m :: " + StaticVariableExample.m);
		System.out.println("data of m in staticVariableExample :: " + staticVariableExample.m); //Warning
		
		//Changing the data
		m = 300; // (or) StaticVariableExample.m = 200;
		System.out.println("data after changing :: " + m);
		System.out.println("data of m after changing :: " + StaticVariableExample.m);
		System.out.println("data of m in staticVariableExample after changing :: " + staticVariableExample.m); //Warning
		
	}
}
