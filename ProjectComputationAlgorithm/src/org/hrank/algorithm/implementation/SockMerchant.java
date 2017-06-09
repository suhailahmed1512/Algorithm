package org.hrank.algorithm.implementation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Class to implement Sock Merchant algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class SockMerchant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Map<Integer, Integer> sockPairMap = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {

			int data = sc.nextInt();

			if (!sockPairMap.containsKey(data)) {
				sockPairMap.put(data, 1);
			} else {
				sockPairMap.put(data, sockPairMap.get(data) + 1);
			}
		}

		int counter = 0;
		for (Integer key : sockPairMap.keySet()) {

			int value = sockPairMap.get(key);
			/*System.out.print(key + " values is " + value);*/
			if (value >= 2) {
				counter += value / 2;
			}
		}

		System.out.println(counter);

		sc.close();
	}
}
