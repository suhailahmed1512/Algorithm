package org.hrank.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement countingsort1 algo.
 * 
 * @author suhail-a
 * 
 */
public class Countingsort1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		Arrays.fill(arr, 1);
		for (int i = 0; i < N; i++) {
			int data = sc.nextInt();
			arr[data]++;
		}
		// Displaying number till <=99 as expected
		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i] + "\t");
		}

		// Freeing up the resources
		sc.close();
	}

}
