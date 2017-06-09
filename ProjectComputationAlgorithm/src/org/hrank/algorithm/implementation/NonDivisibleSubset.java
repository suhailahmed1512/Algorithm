package org.hrank.algorithm.implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Class to implement NonDivisibleSubset
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class NonDivisibleSubset {

	/**
	 * DEVELOPER COMMENTS Need to optimized the solution instead of doing the
	 * quadratic solution
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*long start = System.currentTimeMillis();*/

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();

		long arr[] = new long[N];

		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextLong();
		}

		Arrays.sort(arr);

		long counter = 0;

		Set<Long> set = new HashSet<Long>();

		for (int i = 0; i < N - 1; i++) {
			for (int j = i+1; j < N; j++) {
				if (!(set.contains(arr[i]) && set.contains(arr[j]))) {
					long sum = arr[i] % K + arr[j] % K;
					if (sum != 0 ) {
						/*System.out.println(arr[i] + " and " + arr[j]
								+ " Counter is " + counter);*/
						counter++;
						set.add(arr[i]);
						set.add(arr[j]);
					}
				}
			}
		}

		System.out.println(counter);

		/*System.out.println("TIME TAKES IS "
				+ (System.currentTimeMillis() - start) / 1000 + " secs");*/
		sc.close();

	}
}
