package org.hrank.algorithm.greedy;

import java.util.Scanner;

/**
 * Class to implement grid-challenge algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class GridChallenge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int y = 0; y < T; y++) {
			int N = sc.nextInt();

			String[] dataArr = new String[N];
			for (int k = 0; k < N; k++) {

				dataArr[k] = sc.next();

			}

			boolean isPossible = true;

			for (int l = 0; l < N; l++) {

				if (!isSorted(sortGreedy(dataArr[l].toCharArray()))) {
					isPossible = false;
					break;
				}
			}

			if (isPossible) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		sc.close();

	}

	/**
	 * Method to sort element
	 * 
	 * @param arr
	 * @return
	 */
	static char[] sortGreedy(char[] arr) {
		char temp = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {

				if (arr[j - 1] > arr[j]) {
					// swap the elements!
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

		return arr;
	}

	/**
	 * Method to check sorted
	 * 
	 * @param a
	 * @return
	 */
	public static boolean isSorted(char[] a) {

		if (a == null) {

			return false;
		} else if (a.length == 0) {
			return true;
		}
		// If we find any element which is greater then its next element we
		// return false.
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		// If array is finished processing then return true as all elements
		// passed the test.
		return true;
	}
}
