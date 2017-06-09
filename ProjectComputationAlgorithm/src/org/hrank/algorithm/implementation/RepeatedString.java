package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement repeated-string algo.
 * 
 * @author suhail-a
 * @version 1.1
 * 
 */
public class RepeatedString {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();

		long rem = n % s.length();

		long count = (n / s.length()) * countNoA(s);

		int rem1 = 0;

		if (rem != 0) {
			for (int i = 0; rem1 < rem; i++) {
				rem1++;
				if (s.charAt(i) == 'a')
					count++;
			}
		}
		System.out.println(count);

		in.close();

		long elapsed = System.currentTimeMillis() - start;
		System.out.println(elapsed / 1000 + " sec");
	}

	/**
	 * Method to count number of a in string
	 * 
	 * @param str
	 * @return
	 */
	static long countNoA(String str) {

		long counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				counter++;
		}

		return counter;
	}
}
