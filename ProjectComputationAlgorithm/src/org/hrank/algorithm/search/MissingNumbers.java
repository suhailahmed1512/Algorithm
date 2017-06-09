package org.hrank.algorithm.search;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Class to implement missing-numbers algo. with complexity in O(n)
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class MissingNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeMap<Integer, Integer> freqMap = new TreeMap<Integer, Integer>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int data = sc.nextInt();
			if (freqMap.containsKey(data)) {
				freqMap.put(data, freqMap.get(data) - 1);
			} else {
				freqMap.put(data, -1);
			}
		}

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int data = sc.nextInt();
			if (freqMap.containsKey(data)) {
				freqMap.put(data, freqMap.get(data) + 1);
			} else {
				freqMap.put(data, -1);
			}
		}

		for (Integer key : freqMap.keySet()) {

			/* System.out.println("Key is " + key + " " + freqMap.get(key)); */

			if (freqMap.get(key) > 0) {
				System.out.print(key + "\t");
			}
		}

		// Freeing up the resources
		sc.close();
	}
}
