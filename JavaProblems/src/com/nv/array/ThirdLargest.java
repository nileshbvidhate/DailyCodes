package com.nv.array;

import java.util.Arrays;

public class ThirdLargest {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 34, 65, 4546, -15, 82 };

		System.err.println(Arrays.toString(arr));

		if (arr.length < 3) {
			System.out.println("array contains less than 3 element ");
			return;
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if (arr[i] < firstLargest && arr[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}
			else if (arr[i] < secondLargest && arr[i] > thirdLargest) {
				thirdLargest = arr[i];
			}

		}

		if (thirdLargest == Integer.MIN_VALUE) {
			System.out.println("Third Largest not found");
		} else {
			System.out.println("Third Largest is : " + thirdLargest);
		}

	}
}
