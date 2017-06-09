package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement fair-rations algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class FairRations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int sum = 0, arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		if (sum % 2 == 1) {
			System.out.println("NO");
		} else {

			int count = 0;

			for (int i = 0; i < N - 1; i++) {

				if (arr[i] % 2 != 0) {
					/* System.out.println(arr[i] + " Before i"); */
					arr[i] = arr[i] + 1;
					/* System.out.println(arr[i] + " After i"); */
					/* System.out.println(arr[i + 1] + " Before i+!"); */
					arr[i + 1] = arr[i + 1] + 1;
					/* System.out.println(arr[i + 1] + " After i+1"); */
					count += 2;
					/* System.out.println("Count is " + count); */
				}
			}
			/*
			 * int j = 0; while (j < arr.length) { System.out.print(arr[j]);
			 * j++; }
			 */
			System.out.println(count);
		}

		sc.close();
	}
}
