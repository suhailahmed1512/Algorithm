package org.hrank.algorithm.implementation;

import java.util.Scanner;

public class NonDivisibleSubset1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] remainders = new int[k];
		for (int i = 0; i < n; i++) {
			remainders[in.nextInt() % k]++;
		}

		int size = remainders[0] > 0 ? 1 : 0;
		if (k % 2 == 1) {
			int half = (k - 1) / 2;
			for (int i = 1; i <= half; i++) {
				size += remainders[i] > remainders[k - i] ? remainders[i]
						: remainders[k - i];
			}
		} else {
			int half = k / 2 - 1;
			size += remainders[half + 1] > 0 ? 1 : 0;
			for (int i = 1; i <= half; i++)
				size += remainders[i] > remainders[k - i] ? remainders[i]
						: remainders[k - i];
		}
		System.out.println(size);
		in.close();
	}
}
