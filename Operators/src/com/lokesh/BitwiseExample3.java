package com.lokesh;

public class BitwiseExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 3;
		System.out.println(x ^ y); 
		/*
		Truth table of XOR or ^ in Digital Electronics
		---------------------------------------------- 
		case 1		case2 		result 
		   1     	 1            0
		   1         0            1 
		   0         1            1 
		   0         0            0
		---------------------------------------------- 
		
		Decimal x=10 ----> Binary 1 0 1 0 
				operation & 
		Decimal y=3 -----> Binary 0 0 1 1
		---------------------------------- 
		Result ----------> Binary 1 0 0 1
		---------------------------------- 
		Convert the above result into Decimal 
		1001 Binary -------> 9 Decimal
		*/
	}

}


//Output

//9