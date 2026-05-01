package com.nv.numbers;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year : ");
		
		int year = s.nextInt();
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
		
		s.close();
	}
}
