package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement larrysArray algo. O(N) in time
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class LarrysArray {

	/**
	 * DEVELOPER COMMENTS IMPLEMENTED BELOW CODE WITH ONE LOOP and also Using
	 * Brute Force
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			int size = sc.nextInt();
			int arr[] = new int[size];

			for (int j = 0; j < size; j++) {
				arr[j] = sc.nextInt();
			}

			System.out.println(isLarryWithOneLoopArray(arr));
		}
		sc.close();
	}

	/**
	 * Method to check Laary's Array implement with one Array
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	static String isLarryWithOneLoopArray(int arr[]) {

		String isLaaryArray = "NO";

		int i = 0, j = 1, counter = 0;
		while (j < arr.length) {

			if (arr[i] > arr[j]) {
				counter++;
				if (j == (arr.length - 1)) {
					i++;
					j = i + 1;

				} else {
					j++;
				}
			} else {
				if (j == (arr.length - 1)) {
					i++;
					j = i + 1;
				} else {
					j++;
				}

			}
		}

		if (counter % 2 == 0) {
			isLaaryArray = "YES";
		}
		return isLaaryArray;

	}

	/**
	 * Method to check Laary's Array implement using normal Brute Force with two
	 * loops
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	static String isLarryWithTwoArray(int arr[]) {
		String isLaaryArray = "NO";
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					counter++;
				}

			}
		}

		if (counter % 2 == 0) {
			isLaaryArray = "YES";
		}

		return isLaaryArray;
	}
}
