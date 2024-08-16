package com.lokesh;

public class NestedDoWhileExample {

	public static void main(String[] args) {
		
		int i=1; 
		do { 
			int j=1;
			
			do {
				System.out.print(i+" "+j); 
				j++;
				System.out.println();
			} while (j<=3);
			
			i++;
		} while (i<=3); 

	}

}

//Output
/*
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
 */
