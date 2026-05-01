package com.nv.string;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		
		// without converting to char array
		
		String str = "Nilesh";
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		System.out.println(sb);// hseliN
		
		///////////////////////////////////////////////////////
		
		String revStr = "";
		
		for(int i = str.length() -1; i>= 0; i--)
		{
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println(revStr);
		
		////////////////////////////////////////////////////////
		
		
		// converting to char array
		
		// way1: reversing using extra 
		 
		int iArr[] = new int[] {10,20,30,40,50};
		
//		System.out.println(iArr); NA : print the ClassName@HashCode
		System.out.println(Arrays.toString(iArr)); // print the array in string format eg. [10, 20, 30, 40, 50]
		
		char arr[] = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			arr[i] = str.charAt(str.length() -1 -i);
		}
		
		System.out.println(Arrays.toString(arr)); // print the char array in string format eg.[h, s, e, l, i, N
		System.out.println(arr); // A : print the char array as string eg. hseliN
		
		///////////////////////////////////////////////////////
		
		
		// way1: In-place Reversing
		char str1[] = str.toCharArray();
		
		int start  = 0;
		int end = str1.length -1;
		
		while(start < end)
		{
			char ch = str1[start];
			str1[start] = str1[end];
			str1[end] = ch;
			
			start++;
			end--;
		}
		
		System.out.println(str1);
		
	}
}
