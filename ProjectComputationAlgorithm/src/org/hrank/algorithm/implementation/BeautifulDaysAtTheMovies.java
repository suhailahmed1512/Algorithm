package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement beautiful-days-at-the-movies algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		long counter = 0;
		for (int num = i; num <= j; num++) {

			int reverseNum = getReverse(num);
			if ((num - reverseNum) % k == 0) {
				counter++;
			}

		}

		System.out.println(counter);

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get the reverse of the number;
	 * 
	 * @param num
	 * @return
	 */
	static int getReverse(int num) {

		int z = 0, y = 0;
		while (num > 0) {

			y = num % 10;
			num /= 10;
			z = z * 10 + y;
		}

		return z;
	}
}
