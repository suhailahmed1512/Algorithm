package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement strange-code algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class StrangeCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long t = sc.nextLong();

		long intialCounterValue = 3;
		long rem = 3;
		while (intialCounterValue < t) {
			t = t - intialCounterValue;
			rem *= 2;
		}

		System.out.println(rem - t + 1);
		sc.close();
	}
}
