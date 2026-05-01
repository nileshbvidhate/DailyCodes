package com.nv.string;

//input: Raja Software Labs
//Output: Labs Software Raja

public class WordReverse {

	public static void main(String[] args) {
		String str = "Raja Software Labs";

//		String str = "Nilesh Vidhate";

		reverseUsingSplitFunction(str);
		reverseUsingAnotherString(str);
		reverse_By_Converting_ToArray_And_Another_Array(str);
		reverseUsingStringBuffer(new StringBuffer(str));
		// optimised
		String str1 = "Raja Software Labs";

		inplaceStringWordReversing(str1);
	}

	private static void reverseUsingSplitFunction(String str) {

		String[] split = str.split(" ");

		String res = "";

		for (int i = split.length - 1; i >= 0; i--) {
			res = res + split[i] + " ";
		}

		System.out.println("String after word reverse : " + res);

	}

	private static void reverseUsingAnotherString(String str) {
		String revString = ""; // "Raja Software Labs";

		int end = str.length() - 1;

		while (end >= 0) {
			int wordStart = end;

			while (wordStart >= 0 && str.charAt(wordStart) != ' ') {
				wordStart--;
			}

			for (int i = wordStart + 1; i <= end; i++) {
				revString = revString + str.charAt(i);
			}

			revString = revString + ' ';

			end = wordStart - 1;

		}

		System.out.println("String after word reverse : " + revString);
	}

	private static void reverse_By_Converting_ToArray_And_Another_Array(String str) {
		char arr[] = str.toCharArray();

		char revArr[] = new char[arr.length];

		int i = 0;

		int end = arr.length - 1;

		while (end >= 0) {
			int wordStart = end;

			while (wordStart >= 0 && arr[wordStart] != ' ') {
				wordStart--;
			}

			for (int j = wordStart + 1; j <= end; j++) {
				revArr[i] = arr[j];
				i++;
			}

			end = wordStart - 1;

			if (end > 0) {
				revArr[i] = ' ';
				i++;
			}

		}

		System.out.println(revArr);
	}

	private static void reverseUsingStringBuffer(StringBuffer str) {

		StringBuffer revString = new StringBuffer();

		int end = str.length() - 1;

		while (end >= 0) {

			int wordStart = end;

			while (wordStart >= 0 && str.charAt(wordStart) != ' ') {
				wordStart--;
			}

			for (int i = wordStart + 1; i <= end; i++) {
				revString.append(str.charAt(i));
			}
			revString.append(' ');

			end = wordStart - 1;
		}

		System.out.println("String after word reverse : " + revString);
	}
	
	private static void inplaceStringWordReversing(String str) {
		
		System.out.println("str is : "+str);
		char arr[] = str.toCharArray();
		
		reverse(arr,0,arr.length-1);
		
		int start = 0;
		int end = 0;
		
		for(end = 0; end <= arr.length; end++)
		{
			if(end == arr.length || arr[end] == ' ')
			{
				reverse(arr,start,end-1);
				start = end+1;
			}
		}
		
		System.out.println(arr);
	}
	
	private static void reverse(char arr[], int start, int end)
	{
		while(start < end)
		{
			char ch = arr[start];
			arr[start] = arr[end];
			arr[end] = ch;
			start++;
			end--;
		}
	}
}
