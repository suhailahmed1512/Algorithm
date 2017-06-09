package org.hrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement priyanka-and-toys algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class PriyankaAndToys {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int min = arr[0];
		int counter = 1;
		for (int j = 0; j < N; j++) {
			if (arr[j] > min + 4) {
				counter++;
				min = arr[j];
			}
		}

		System.out.println(counter);

		// Freeing up the resources
		sc.close();
	}
}
