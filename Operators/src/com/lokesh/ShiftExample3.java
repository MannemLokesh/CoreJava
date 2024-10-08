package com.lokesh;

public class ShiftExample3 {
	public static void main(String[] args) {
		//For positive number, >> and >>> works same         
		System.out.println(20>>2);         
		System.out.println(20>>>2);    
		
		//For negative number,        
		//>>> changes parity bit (MSB) to 0         
		System.out.println(-20>>2);         
		System.out.println(-20>>>2);
	}
}

//Output

//5
//5
//-5
//1073741819