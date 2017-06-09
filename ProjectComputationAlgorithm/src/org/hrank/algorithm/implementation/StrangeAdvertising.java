package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement strange-advertising algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class StrangeAdvertising {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long s = 2, total = 2;
		for (int i = 0; i < n-1; i++) {

			s = (s * 3) / 2;
			total += s;

		}
		System.out.println(total);
		// Freeing up the resources
		sc.close();
	}
}
