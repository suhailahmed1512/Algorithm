package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement Save the Prisoner algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class SavethePrisoner {

	/**
	 * DEVELOPER COMMENTS PASSING ALL THE CASES BUT FAILING AT #0 even after
	 * wasting 5 HACKOS downloading the tCASE #0 matching OP not sure why?????
	 * NEED TO CHECK FROM IRC COMMENTS POSTED THERE :::::::
	 * 
	 * REVISED 1.1 
	 * PASSES #0 issue was for not taking care of when op modulos
	 * come's as zero when it has to be 1 fixed it by (+2) and -1 in op
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		long arr[] = new long[T];

		for (int i = 0; i < T; i++) {

			long N = sc.nextLong();
			long M = sc.nextLong();
			long S = sc.nextLong();
			/* long op = (M + S - 1) % N; */
			long op = (M + S - 2) % N + 1;
			System.out.println(op);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}
}
