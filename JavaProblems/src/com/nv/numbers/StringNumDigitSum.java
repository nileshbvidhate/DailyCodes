package com.nv.numbers;

public class StringNumDigitSum {

	public static void main(String[] args) {
		
		String str = "1234";
		
		int sum = 0;
		
		char arr[] = str.toCharArray();
		
//		for(char ch : str.toCharArray())
//		{
//			sum = sum + ch - '0';
//		}
		
		for(char ch : arr)
		{
			sum = sum + ch - '0';
		}
		
		
		System.out.println(sum);
	}
}
