package com.nv.string;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		
		String str = "swiss";
		
		char byBruteForceApproach = byBruteForceApproach(str);
		 char byOptimalApproch = byOptimalApproch(str);
		
		if(byBruteForceApproach != '\0')
		{
			System.out.println(byBruteForceApproach);
		}
		else
		{
			System.out.println("First Non repeating char not found.");
		}
		
		if(byOptimalApproch != '\0')
		{
			System.out.println(byOptimalApproch);
		}
		else
		{
			System.out.println("First Non repeating char not found.");
		}
	}
	
	private static char byBruteForceApproach(String str) {
		 
		int i = 0;
		for (i = 0; i < str.length(); i++)
		{
			int j = 0;
			
			for( j = 0; j < str.length(); j++)
			{
				if( i != j && str.charAt(i) == str.charAt(j)) {
					break;
				}
			}
			if(j == str.length())
			{
				return str.charAt(i);
			}
		}
		
		return '\0';	 
	}
	
	private static char byOptimalApproch(String str)
	{
		int freq[] = new int[256];
		
		for(int i = 0; i < str.length(); i++)
		{
			freq[str.charAt(i)]++;
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			if(freq[str.charAt(i)] == 1)
			{
				return str.charAt(i);
			}
		}
		
		return '\0';
	}
}
