package com.nv.array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int iSize = 0;

		System.out.println("Enter the size of array: ");
		iSize = s.nextInt();

		int arr[] = new int[iSize];

		System.out.println("Enter the " + iSize + " elements");

		int i = 0;

		for (i = 0; i < iSize; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Array : " + arr.toString()); // where used the default implemenataion of the Object class
															// toString method
		// I@4a574795 it will return ClassName@Hashcode

		System.out.println("Array : " + Arrays.toString(arr)); // where used the method of Arrays which has a toString()
																// utility method for array
		// 10 20 30 give the correct array element in string format

		System.out.println("Array : ");
		for (int e : arr) {
			System.out.print(e + " ");
		}

		findSecondLargest(arr);

		s.close();

	}

	private static void findSecondLargest(int arr[]) {

		if (arr.length < 2) {
			System.out.println("array contains less that two elements");
			return;
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] < firstLargest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {

			System.out.println("No second largest element found");
		}

		System.out.println("Second largest element is : " + secondLargest);
	}

}
