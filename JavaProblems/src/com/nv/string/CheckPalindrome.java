package com.nv.string;

import java.util.Arrays;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "madam"; // stored in SCP

		String str3 = new String("abcba");
		String str4 = new String("abcba"); // Stored in heap memory as separate object

		if (str1 == str2) // compares hashcode
		{
			System.out.println("both str1 and str2 are equal in SCP");
		} else {
			System.out.println("not equal");
		}

		System.out.println(str1.equals(str2)); // compares the actual content

		if (str3 == str4) {
			System.out.println("both str1 and str2 are equal Object");
		} else {
			System.out.println("not equal");
		}

		System.out.println(str3.equals(str4));

		// Check Palindrome
		boolean isPali = isPalindrom("madam");

		if (isPali) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrome");
		}

		boolean isPalindrome = isPalindromeByArray("madam");

		if (isPalindrome) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	private static boolean isPalindrom(String str) {

//		way1: convert string into array and reverse and then check.
//		way2: convert String into stringBuffer Object and then reverse and compare

		StringBuffer sb = new StringBuffer(str);

		sb.reverse();

		String str2 = sb.toString();

		if (str.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isPalindromeByArray(String str) {

		char arr[] = str.toCharArray();

		int i = arr.length - 1;

		char brr[] = new char[arr.length];

		for (char ch : arr) {
			brr[i] = ch;
			i--;
		}

//		System.out.println(arr.toString()); NA
//		System.out.println(brr.toString());

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));

//		if(arr.equals(brr)) NA
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		} 

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != brr[i]) {
				return false;
			}
		}

		return true;

	}
}