package org.hrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement Next-permutation
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class NextPermutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		for (int i = 0; i < n; i++)
			System.out.print(A[i] + " ");
		System.out.print("\n");

		sc.close();
	}
}
