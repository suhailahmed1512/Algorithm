package org.hrank.algorithm.sorting;

import java.util.Scanner;

/**
 * Class to implement quicksort1 algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Quicksort1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N];

		int pivotElement;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		pivotElement = arr[0];

		getLeftArray(arr, pivotElement);
		getEqualArray(arr, pivotElement);
		getRightArray(arr, pivotElement);

		pivotElement = arr[0];

		sc.close();
	}

	/**
	 * Method to get the left array
	 * 
	 * @param arr
	 * @param pivotElement
	 */
	static void getLeftArray(int arr[], int pivotElement) {

		boolean zeroPresent = false;
		int lzeroCounter = 0;
		int leftArray[] = new int[arr.length];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivotElement) {
				leftArray[n] = arr[i];
				n++;
				if (arr[i] == 0) {
					zeroPresent = true;
				}
			}
		}

		for (int i = 0; i < leftArray.length; i++) {
			if (zeroPresent && leftArray[i] == 0 && lzeroCounter == 0) {
				System.out.print(leftArray[i] + "\t");
				lzeroCounter++;
			} else if (leftArray[i] != 0) {
				System.out.print(leftArray[i] + "\t");
			}
		}

	}

	/**
	 * Method to get the right side of the array
	 * 
	 * @param arr
	 * @param pivotElement
	 */
	static void getRightArray(int arr[], int pivotElement) {

		boolean zeroPresent = false;
		int lzeroCounter = 0;
		int rightArray[] = new int[arr.length];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > pivotElement) {
				rightArray[n] = arr[i];
				n++;
				if (arr[i] == 0) {
					zeroPresent = true;
				}
			}
		}

		for (int i = 0; i < rightArray.length; i++) {
			if (zeroPresent && rightArray[i] == 0 && lzeroCounter == 0) {
				System.out.print(rightArray[i] + "\t");
				lzeroCounter++;
			} else if (rightArray[i] != 0) {
				System.out.print(rightArray[i] + "\t");
			}
		}
	}

	/**
	 * Method to get the equal part of the array
	 * 
	 * @param arr
	 * @param pivotElement
	 */
	static void getEqualArray(int arr[], int pivotElement) {
		boolean zeroPresent = false;
		int lzeroCounter = 0;
		int equalArray[] = new int[arr.length];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == pivotElement) {
				equalArray[n] = arr[i];
				n++;
				if (arr[i] == 0) {
					zeroPresent = true;
				}
			}
		}

		for (int i = 0; i < equalArray.length; i++) {
			if (zeroPresent && equalArray[i] == 0 && lzeroCounter == 0) {
				System.out.print(equalArray[i] + "\t");
				lzeroCounter++;
			} else if (equalArray[i] != 0) {
				System.out.print(equalArray[i] + "\t");
			}
		}

	}

}
