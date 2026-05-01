package com.nv.array;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {

		int arr[] = { 10, 30, 40 }; // shorthand : used when declaration + initialization at a time
		int brr[] = new int[] { 20, 50, 60, 70 }; // explicit write : Used when only declaration

		int m[] = new int[arr.length + brr.length];

		int i = 0, j = 0, k = 0;

		while (i < arr.length && j < brr.length) {
			if (arr[i] < brr[j]) {
				m[k] = arr[i];
				i++;
				k++;
			} else {
				m[k] = brr[j];
				j++;
				k++;
			}
		}

		while (i < arr.length) {
			m[k] = arr[i];
			i++;
			k++;
		}

		while (j < brr.length) {
			m[k] = brr[j];
			j++;
			k++;
		}

		System.out.println(Arrays.toString(m));
	}
}
