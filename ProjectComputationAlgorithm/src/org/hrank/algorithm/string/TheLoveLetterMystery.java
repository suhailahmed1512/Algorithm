package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement The Love Letter Mystery algorithm
 * 
 * @author suhail-a
 * @version 1.0
 */
public class TheLoveLetterMystery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int k = 0; k < N; k++) {
			String data = sc.next();
			if (palindromeCheck(data)) {
				System.out.println(0);
			} else {
				int count = 0;
				// use two pointers;
				int i = 0, j = data.length() - 1;
				while (i < j) {
					count += Math.abs(data.charAt(i) - data.charAt(j));
					i++;
					j--;
				}
				System.out.println(count);
			}
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to check the palindrome
	 * 
	 * @param data
	 * @return
	 */
	static boolean palindromeCheck(String data) {

		String str = new StringBuilder(data).reverse().toString();

		if (data.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
}
