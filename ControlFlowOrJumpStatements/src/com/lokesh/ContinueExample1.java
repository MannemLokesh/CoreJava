package com.lokesh;

public class ContinueExample1 {

	public static void main(String[] args) {
		
		//for loop 
		for(int i=1;i<=10;i++) { 
			
			if(i==5) { 
				//using continue statement 
				continue;//it will skip the rest statement 
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
6
7
8
9
10
*/