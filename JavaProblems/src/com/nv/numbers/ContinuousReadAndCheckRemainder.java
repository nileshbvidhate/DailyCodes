package com.nv.numbers;

import java.util.Scanner;

//Continuously read numbers and print the number if the remainder is 3 when divided by 7. Stop the program when the input is 0.

public class ContinuousReadAndCheckRemainder {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the Number: ");
			int num = s.nextInt();
			
			if(num == 0)
			{
				s.close();
//				System.exit(0);
				break;
			}
			
			if(num % 7 == 3)
			{
				System.out.println("Number is : "+num);
			}
			
		}
		
	}
}
