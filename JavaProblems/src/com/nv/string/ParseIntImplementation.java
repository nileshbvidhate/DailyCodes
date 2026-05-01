package com.nv.string;

import java.util.Scanner;

public class ParseIntImplementation {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the numeric string:");
		String str = s.nextLine();

		if(str == null || str.length() == 0)
		{
			System.out.println("String is empty");
			return;
		}

		int num = 0;
		int i = 0;
		int sign = 1;

		char arr[] = str.toCharArray();
		
		if(arr[i] == '-')
		{
			sign = -1;
			i++;
		}
		else if(arr[i] == '+')
		{
			sign = 1;
			i++;
		}
		

		for ( ; i < arr.length; i++) {
			
			if(arr[i] < '0' || arr[i] > '9')
			{
				System.out.println("Invalid numeric string");
				return;
			}
			
			if(num > (Integer.MAX_VALUE - (arr[i] - '0')) / 10 )
			{
				System.out.println("Integer Overflow");
				return;
			}
			
			num = num * 10 + arr[i] - '0';
		}
		
		num = num * sign;

		System.out.println("Number :" + num);

		System.out.println(num % 10);
		
		s.close();

	}
}
