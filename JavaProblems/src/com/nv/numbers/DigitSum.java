package com.nv.numbers;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = s.nextInt();

		int sum = 0;

		while (num != 0) {
			sum = sum + num % 10;
			num /= 10;
		}
		
		System.out.println("Sum of Digits is: "+sum);
		
		s.close();

	}
}
