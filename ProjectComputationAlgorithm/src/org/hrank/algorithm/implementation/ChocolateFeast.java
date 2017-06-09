package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement chocolate-feast algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class ChocolateFeast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tCase = sc.nextInt();

		for (int i = 0; i < tCase; i++) {

			long N = sc.nextLong();
			long c = sc.nextLong();
			long m = sc.nextLong();

			System.out.println(getTotalChocolates(m, c, N));
			
		}

		sc.close();
	}

	static long getTotalChoclate(long m, long c, long N) {

		long total = 0;

		for (int i = 0; i < N / c; i++) {

			total += N / c;
			long wrappers = total / m;
			while (wrappers >= m) {

				wrappers = wrappers - (wrappers % m);

				total = total + wrappers;

				wrappers -= wrappers % m;

				if (wrappers >= m) {
					System.out.println(total + "inside");
					continue;
				} else {
					break;
				}
			}
		}

		return total;
	}

	static long getTotalChocolates(long m, long c, long N) {

		long totalChoclates = 0;
		long totalWrappers = 0;
		long freeChoclates = 0;

		totalChoclates = N / c;
		totalWrappers = totalChoclates;
		while (totalWrappers >= m) {

			long wrappersToGive = totalWrappers - (totalWrappers % m);

			freeChoclates = totalWrappers / m;

			totalChoclates += freeChoclates;

			totalWrappers = (totalWrappers - wrappersToGive) + freeChoclates;

		}

		return totalChoclates;
	}
}
