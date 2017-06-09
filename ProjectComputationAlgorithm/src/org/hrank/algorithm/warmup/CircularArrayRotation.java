package org.hrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Class to implement circular arrays rotation algo. with O(n) time and O(1)
 * space complexity
 * 
 * @author suhail-a
 * @version 1.1
 * 
 */
public class CircularArrayRotation {

	/**
	 * DEVELOPER COMMENTS NEED to optimize the solution to reduce the complexity
	 * Currently taking more time to compute for 10^6 element, has to be reduced
	 * to minimal it's time complexity
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = sc.nextInt();

		int q = sc.nextInt();

		int ipArr[] = new int[n];

		int posArr[] = new int[q];

		for (int i = 0; i < n; i++) {

			ipArr[i] = sc.nextInt();

		}

		for (int pos = 0; pos < q; pos++) {

			posArr[pos] = sc.nextInt();
		}

		/**
		 * Optimized somewhat from k to k%n, need to optimize it more
		 */
		for (int j = 0; j < k % n; j++) {
			ipArr = rotatingArrays(ipArr);
		}

		for (int l = 0; l < q; l++) {

			System.out.println(ipArr[posArr[l]]);
		}

		// Freeing up th resource
		sc.close();
	}

	/**
	 * Method to rotate array for kth time
	 * 
	 * @param arr
	 * @param noTimes
	 * @return
	 */
	public static int[] rotatingArrays(int arr[]) {

		int rotatedArr[] = new int[arr.length];

		if (arr != null && arr.length > 1) {

			rotatedArr[0] = arr[arr.length - 1];

			for (int i = 1; i <= arr.length - 1; i++) {

				rotatedArr[i] = arr[i - 1];
			}

		}

		else {

			rotatedArr[0] = arr[arr.length - 1];
		}

		return rotatedArr;
	}

}
