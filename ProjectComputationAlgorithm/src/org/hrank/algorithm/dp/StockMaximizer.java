package org.hrank.algorithm.dp;

import java.util.Scanner;

/**
 * Class to implement stockmax algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class StockMaximizer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int size = sc.nextInt();
			int arr[] = new int[size];

			for (int j = 0; j < size; j++) {
				arr[j] = sc.nextInt();
			}

			System.out.println(getMaxStockProfit(size, arr));
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get Maximum Stock Profit
	 * 
	 * @param size
	 * @param arr
	 * @return
	 */
	static long getMaxStockProfit(int size, int arr[]) {

		long profit = 0;
		long max = 0;
		for (int i = size - 1; i >= 0; i--) {
			if (max <= arr[i]) {
				max = arr[i];
			}
			profit += max - arr[i];
		}

		return profit;
	}
}
