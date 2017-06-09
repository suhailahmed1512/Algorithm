package org.hrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement greedy-florist algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class GreedyFlorist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int flowersPrice[] = new int[n];
		for (int i = 0; i < n; i++) {
			flowersPrice[i] = sc.nextInt();
		}
		Arrays.sort(flowersPrice);
		System.out.println(getFlowersPrice(flowersPrice, k));

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get the flower price bought
	 * 
	 * @param flowersPrice
	 * @param k
	 * @return
	 */
	static int getFlowersPrice(int[] flowersPrice, int k) {

		int i = flowersPrice.length - 1;
		int prevBoughCounter = 0, totalPrice = 0;
		while (i >= 0) {

			for (int j = 0; j < k && i >= 0; j++) {

				totalPrice += (1 + prevBoughCounter) * flowersPrice[i];
				i--;

			}
			prevBoughCounter++;
		}

		return totalPrice;
	}
}
