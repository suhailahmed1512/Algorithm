package org.hrank.algorithm.string;

import java.util.Scanner;

/***
 * Class to implement Palindrome Index algo
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class PalindromeIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int position = -1;
		for (int k = 0; k < N; k++) {

			StringBuilder str = new StringBuilder(sc.next());

			if (isPalindrome(str.toString())) {

				System.out.println("-1");
			} else {

				for (int i = 0, j = str.length() - 1; i < str.length() / 2
						&& !(j < 0); i++, j--) {

					if (str.charAt(i) != str.charAt(j)) {
						StringBuilder d1 = new StringBuilder(str);
						StringBuilder d2 = new StringBuilder(str);
						StringBuilder frontData = new StringBuilder(
								d1.deleteCharAt(i));
						StringBuilder backData = new StringBuilder(
								d2.deleteCharAt(j));

						if (isPalindrome(frontData.toString())) {
							position = i;
							break;
						} else if (isPalindrome(backData.toString())) {
							position = j;
							break;
						}
					}
				}

				System.out.println(position);

			}
		}
		sc.close();
	}

	/**
	 * Method to check for palindrome string
	 * 
	 * @param str
	 * @return isPalindrome
	 */
	static boolean isPalindrome(String str) {

		boolean isPalindrome = true;

		int i = 0, j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;

			} else {
				i++;
				j--;
			}
		}

		return isPalindrome;
	}
}
