package org.hrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Class to implement circular arrays rotation algo. with O(n) time and O(1)
 * space complexity without using any api
 * 
 * @author suhail-a
 * @version 1.2
 * 
 */
public class CircularArrayRotation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int rot = K % N;
		/* System.out.println(rot+" rot"); */

		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int queryData = sc.nextInt();
			if (queryData - rot >= 0)
				System.out.println(arr[queryData - rot]);
			else
				System.out.println(arr[queryData - rot + arr.length]);
		}

		// Freeing up the resources
		sc.close();
	}
}
