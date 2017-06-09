package org.hrank.algorithm.sorting;

import java.util.Scanner;

/**
 * Class to implement insertionsort1 algo. with sorted data
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Insertionsort1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		insertIntoSorted(arr);

		// Freeing up the resources
		sc.close();

	}

	/**
	 * Method to display steps involved in sorting
	 */
	static void displaySteps(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	/**
	 * Method to display steps in inserted sort
	 * 
	 * @param ar
	 */

	static void insertIntoSorted(int ar[]) {

		int valueToInsert, holePosition;

		for (int i = ar.length - 1; i > 0; i--) {

			valueToInsert = ar[i];
			holePosition = i;

			while (holePosition < ar.length
					&& ar[holePosition - 1] > valueToInsert) {
				ar[holePosition] = ar[holePosition - 1];
				holePosition -= 1;

				displaySteps(ar);
				System.out.println();
				if (holePosition == 0) {
					if (ar[holePosition] > valueToInsert) {
						ar[holePosition] = valueToInsert;
						displaySteps(ar);
					}
				}
				break;
			}

			ar[holePosition] = valueToInsert;
			if (i == 1 && holePosition != 0) {
				displaySteps(ar);
			}

		}
	}
}
