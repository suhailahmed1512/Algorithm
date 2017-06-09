package org.hrank.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement mark-and-toys algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class MarkAndToys {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long k = sc.nextLong();

		List<Long> priceList = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			priceList.add(sc.nextLong());
		}

		System.out.println(getMaxToysCountPurchased(priceList, k));

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get the count of maximum toys can be purchased within $k
	 * 
	 * @param priceList
	 * @param k
	 * @return
	 */
	static long getMaxToysCountPurchased(List<Long> priceList, long k) {

		long maxToysPurchased = 0, totalPrice = 0;
		Collections.sort(priceList);
		for (long price : priceList) {
			if (!(totalPrice > k) && (totalPrice + price) < k) {
				totalPrice += price;
				maxToysPurchased++;
			} else {
				break;
			}
		}

		return maxToysPurchased;

	}
}
