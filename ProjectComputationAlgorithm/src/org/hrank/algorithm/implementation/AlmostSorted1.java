package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implemented almost-sorted alog.
 * 
 * @author suhail-a
 * @version 1.1
 * 
 */
public class AlmostSorted1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N];

		for (int i = 0; i < N; i++) {
			data[i] = sc.nextInt();
		}

		if (isSortedAscendingOrder(data)) {
			System.out.println("yes");
			return;
		}

		int i, j;
		for (i = 0; i < N - 1 && data[i] < data[i + 1]; ++i)
			;
		for (j = N - 1; j > 0 && data[j - 1] < data[j]; --j)
			;
		/* System.out.println("Value of i is " + i + " Value of j is " + j); */
		// try swap
		swap(data, i, j);
		if (isSortedAscendingOrder(data)) {
			System.out.println("yes\nswap " + (i + 1) + " " + (j + 1));
			return;
		}

		// try reverse (continue reversing inner pairs)
		int k = i + 1, l = j - 1;
		while (k < l)
			swap(data, k++, l--);
		if (isSortedAscendingOrder(data)) {
			System.out.println("yes\nreverse " + (i + 1) + " " + (j + 1));
			return;
		}
		System.out.println("no");

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to check the order of array is sorted in ascending order
	 * 
	 * @param data
	 * @return
	 */
	static boolean isSortedAscendingOrder(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] > data[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to swap elements of an array
	 * 
	 * @param d
	 * @param i
	 * @param j
	 */
	public static void swap(int[] d, int i, int j) {
		int tmp = d[i];
		d[i] = d[j];
		d[j] = tmp;
	}
}
