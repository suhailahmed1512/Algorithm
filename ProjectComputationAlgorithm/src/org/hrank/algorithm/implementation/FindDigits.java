package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement find-digits algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class FindDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println(getDigit(sc.nextInt()));
		}

		sc.close();
	}

	static int getDigit(int data) {
		int checkData = data;
		int counter = 0;
		while (checkData > 0) {

			int digit = checkData % 10;

			if (digit != 0 && data % digit == 0) {
				counter++;
			}
			if (checkData > 0) {
				checkData /= 10;
			}

		}

		return counter;
	}
}
