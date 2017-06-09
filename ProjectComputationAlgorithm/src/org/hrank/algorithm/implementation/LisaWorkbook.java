package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement Lisa's Workbook Special Problem algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class LisaWorkbook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int totalPages = 0;
		int specialProblems = 0;

		for (int i = 1; i <= n; i++) {
			totalPages++;
			int t = sc.nextInt();
			for (int j = 1; j <= t; j++) {

				if (totalPages == j) {
					specialProblems++;
				}
				if (j % k == 0 && j < t) {
					totalPages++;
				}
			}
		}

		System.out.println(specialProblems);

		sc.close();
	}
}
