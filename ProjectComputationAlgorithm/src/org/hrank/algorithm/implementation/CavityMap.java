package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement cavity-map algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class CavityMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char arr[][] = new char[N][N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next().toCharArray();
		}

		printCavityMap(getCavityMap(arr, N), N);
		sc.close();
	}

	/**
	 * Method to find the cavity map from the square grid
	 * 
	 * @param arr
	 * @param N
	 * @return
	 */
	static char[][] getCavityMap(char arr[][], int N) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
				if (arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i - 1][j]
						&& arr[i][j] > arr[i][j + 1]
						&& arr[i][j] > arr[i][j - 1]) {
					arr[i][j] = 'X';
				}
			}
		}

		return arr;
	}

	/**
	 * Method to print the cavity map grid
	 * 
	 * @param arr
	 * @param N
	 */
	static void printCavityMap(char arr[][], int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(String.valueOf(arr[i][j]));
			}
			System.out.println("");
		}
	}
}
