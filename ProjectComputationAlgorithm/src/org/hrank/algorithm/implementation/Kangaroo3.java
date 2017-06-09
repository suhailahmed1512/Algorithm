package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement Kangaroo problem from Implementation
 * 
 * @author suhail-a
 * @version 1.3
 */
public class Kangaroo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x1 = sc.nextLong();
		long v1 = sc.nextLong();

		long x2 = sc.nextLong();
		long v2 = sc.nextLong();

		long dx = x1 - x2;
		long dv = v2 - v1;

		if (dv == 0) {
			System.out.println("NO");
		} else if ((dx % dv == 0) && (dx / dv > 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}
