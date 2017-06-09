package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement optimized solution for PAL check with least complexity
 * having O(n)
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class OptimizeReverseCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

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
		if (isPalindrome) {
			System.out.println("ITS PAL");
		} else {
			System.out.println("NOT A PAL");
		}
		sc.close();
	}
}
