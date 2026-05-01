package com.nv.numbers;

//50 51 52 53 54 55 40 41 42 43 44 45....................... 10 11 12 13 14 15

public class PrintSequence {
	public static void main(String[] args) {
		
		for(int  i = 50 ; i >= 10; i -=10)
		{
			for(int j = 0; j <= 5; j++)
			{
				System.out.print(i+j + " ");
			}
			System.out.println();
		}
	}
	
}
