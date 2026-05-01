package com.nv.numbers;
//print all possible two-digit numbers using digits from 0 to 5, without repeating digits.

public class PrintPossibleTwoDigitsNumber {
	public static void main(String[] args) {

		for(int i = 0; i <= 5; i++)
		{
			for(int j = 0; j <= 5; j++)
			{
				if(i != j)
				{
					System.out.println(i+","+j);
				}
			}
		}
	}
}
