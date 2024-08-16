package com.lokesh;

public class NestedWhileExample {

	public static void main(String[] args) {
		int i=1; 
		while(i<=3) { 
			int j=1;
			
			while(j<=3) {
				System.out.print(i+" "+j); 
				j++;
				System.out.println();
			}
			
			i++;
		}
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
