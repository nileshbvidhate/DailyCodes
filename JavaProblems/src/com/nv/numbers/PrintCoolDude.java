package com.nv.numbers;

public class PrintCoolDude {
	public static void main(String[] args) {
		
		
		for(int num = 100; num <= 500; num++ )
		{
			if(num % 5 == 0 && num % 11 == 0)
			{
				System.out.println("Cool Dude");
			}
			else if(num % 5 == 0)
			{
				System.out.println("Cool");
			}
			else if(num %  11 == 0)
			{
				System.out.println("Dude");
			}
//			else {
//				System.out.println(num);
//			}
		}
		
	}
}
