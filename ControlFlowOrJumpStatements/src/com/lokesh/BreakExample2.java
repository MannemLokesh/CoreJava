package com.lokesh;

public class BreakExample2 {

	public static void main(String[] args) {
		
		//outer loop 
		for(int i=1;i<=3;i++) { 
			//inner loop 
			for(int j=1;j<=3;j++) { 
				
				if(i==2&&j==2) { 
					//using break statement inside the inner loop 
					break; 
				} 
				
				System.out.println(i+" "+j); 
			} 
		} 
		
	}

}

//Output
/*
1 1
1 2
1 3
2 1
3 1
3 2
3 3
*/