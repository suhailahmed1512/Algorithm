package org.hrank.algorithm.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement circular arrays rotation algo. with O(n) time and O(1)
 * using collections API (just for testing used API to check the complexity)
 * Sequential List - 5 s Random List - 3s
 * 
 * @author suhail-a
 * @version 1.3
 * 
 */
public class CircularArrayRotation3 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>(N);
		/**
		 * Checking the performance by providing sequential list instead of
		 * Random List to check the performance difference
		 */
		/* List<Integer> list = new LinkedList<Integer>(); */

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		Collections.rotate(list, K);

		for (int j = 0; j < Q; j++) {
			System.out.println(list.get(sc.nextInt()) + "\t");
		}

		// Freeing up the resources
		sc.close();

	}
}
