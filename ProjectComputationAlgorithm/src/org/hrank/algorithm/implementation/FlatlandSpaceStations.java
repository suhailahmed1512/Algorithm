package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement flatland-space-stations algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class FlatlandSpaceStations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		int result = 0, large = 0;
		if (m == n)
			large = 0;
		else {
			for (int i = 0; i < n; i++) {
				result = Math.abs(arr[0] - i);
				/*System.out.println(result+" result");*/
				for (int j = 0; j < m; j++) {
					if (Math.abs(arr[j] - i) < result) {
						result = Math.abs(arr[j] - i);
					}
				}
				if (large < result)
					large = result;
			}
		}
		System.out.println(large);

		sc.close();
	}
}
