package org.hrank.algorithm.sorting;

import java.util.Scanner;

/**
 * Class to implement quicksort2 algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Quicksort2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to check the sorting
	 * 
	 * @param arr
	 * @return
	 */
	static boolean isArraySorted(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to print elements of an array
	 * 
	 * @param arr
	 */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}

	/**
	 * Method to partition an array
	 * 
	 * @param ar
	 */
	static int[] partition(int[] ar) {
		int temp = 0;
		int pivot = ar[0];
		int pIndex = ar.length - 1;
		for (int i = ar.length - 1; i >= 1; i--) {
			if (ar[i] >= pivot) {
				temp = ar[i];
				ar[i] = ar[pIndex];
				ar[pIndex] = temp;
				pIndex -= 1;
			}
		}
		temp = ar[pIndex];
		ar[pIndex] = ar[0];
		ar[0] = temp;
		printArray(ar);

		return ar;
	}

	/**
	 * Method to partition array to sub arrays as per algo.
	 * 
	 * @param arr
	 * @param N
	 * @param pivotElement
	 */
	static void sortArraySteps(int arr[], int pivotElement) {

		if (arr.length == 1) {
			printArray(arr);
		} else if (arr.length <= 2) {
			if (isArraySorted(arr)) {
				printArray(arr);
			} else {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				printArray(arr);
			}

		} else {

			int leftConter = 0, rightCOunter = 0, equalCounter = 0;

			int[] leftArr = new int[arr.length];
			int[] rightArr = new int[arr.length];
			int[] equalArr = new int[arr.length];

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < pivotElement) {
					leftArr[leftConter] = arr[i];
					leftConter++;
				} else if (arr[i] > pivotElement) {
					rightArr[rightCOunter] = arr[i];
					rightCOunter++;
				} else {
					equalArr[equalCounter] = arr[i];
					equalCounter++;
				}
			}
		}
	}
}
