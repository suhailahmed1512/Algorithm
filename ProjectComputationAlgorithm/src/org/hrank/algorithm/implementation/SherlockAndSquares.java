package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement sherlock-and-squares algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class SherlockAndSquares {

	/**
	 * DEVELOPER COMMENTS NEDD to bring down the complexity some more O(n) has
	 * to be reduced to execute in less time to save timeout'
	 * 
	 * Complexity drilled down to O(1)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println(getCountOfSherlockSquare(sc.nextInt(),
					sc.nextInt()));
		}

		sc.close();
	}

	/**
	 * Method to get the counter of number which are squares of some number
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	static long getCountOfSherlockSquare(int start, int end) {

		long op = ((int) Math.floor(Math.sqrt(end)) - (int) Math.floor(Math
				.sqrt(start - 1)));

		return op;

	}

	/**
	 * Method to check whether the number is perfect square
	 * 
	 * @param n
	 * @return
	 */
	static long PerfectSquare(int n) {
		int h = n & 0xF; // last hexadecimal "digit"
		if (h > 9)
			return 0; // return immediately in 6 cases out of 16.

		// Take advantage of Boolean short-circuit evaluation
		if (h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8) {
			// take square root if you must
			int t = (int) Math.floor(Math.sqrt((double) n));
			return t;
		}
		return 0;
	}
}
