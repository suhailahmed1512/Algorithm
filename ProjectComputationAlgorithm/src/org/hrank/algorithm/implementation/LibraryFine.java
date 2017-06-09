package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement library-fine algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class LibraryFine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int actDate = sc.nextInt();
		int actMonth = sc.nextInt();
		int actYear = sc.nextInt();

		int retDate = sc.nextInt();
		int retMonth = sc.nextInt();
		int retYear = sc.nextInt();

		int fine;

		if (actYear < retYear) {
			fine = 0;
		} else if (actYear == retYear && actMonth < retMonth) {
			fine = 0;
		} else if (actYear == retYear && actMonth == retMonth
				&& actDate < retDate) {
			fine = 0;
		}

		else {
			if ((actYear == retYear) || actYear < retYear) {
				if ((actMonth == retMonth) || actMonth < retMonth) {

					if ((actDate == retDate) || actDate < retDate) {
						fine = 0;
					} else {

						fine = (actDate - retDate) * 15;
					}
				} else {
					fine = (actMonth - retMonth) * 500;
				}
			} else {
				fine = 10000;
			}
		}
		System.out.println(fine);
		sc.close();
	}
}
