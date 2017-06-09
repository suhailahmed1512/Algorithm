package org.hrank.algorithm.sorting;

import java.util.Scanner;

/**
 * Class to implement countingsort2 algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Countingsort2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			arr[data]++;

		}

		for (int j = 0; j < n; j++) {
			int k = arr[j];
			if (k > 0) {

				while (k > 0) {
					System.out.print(j + "\t");
					k--;
				}

			}

		}
		// freeing up the resources
		sc.close();
	}
}
