package com.lokesh;

public class BreakExample1 {

	public static void main(String[] args) {
		
		//using for loop 
		for(int i=1;i<=10;i++) { 
			if(i==5) { 
				//breaking the loop 
				break; 
			} 
			System.out.println(i); 
		} 
		
	}

}

//Output
/*
1
2
3
4
*/