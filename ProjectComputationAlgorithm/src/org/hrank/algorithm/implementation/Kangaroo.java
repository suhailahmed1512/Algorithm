package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement Kangaroo problem from Implementation
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Kangaroo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();

		if (x1 - x2 == 0) {
			System.out.println("NO");
		} else if (((x1 - x2) % (v2 - v1) == 0) && ((x1 - x2) / (v2 - v1) > 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
