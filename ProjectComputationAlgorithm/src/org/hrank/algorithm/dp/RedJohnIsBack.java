package org.hrank.algorithm.dp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement red-john-is-back algo.
 * 
 * @author suhail-a
 * @version 1.0
 */
public class RedJohnIsBack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int N = sc.nextInt();

			/* System.out.println(sieveOfEratosthenes(getNoOfWays(N))); */
			System.out.println(sieveOfEratosthenes(getNoOfWays(N)));
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get no of ways bricks can be arranged
	 * 
	 * @param N
	 * @return
	 */
	static long getNoOfWays(int N) {
		long ways;

		if (N <= 3) {
			ways = 1;
		} else {
			ways = 1;
			int c = 0;
			while (N > 3) {
				N = N - 4;
				c++;
				ways += binomial(N + c, c);
			}
		}

		return ways;
	}

	/**
	 * Method to count binomial
	 * 
	 * @param N
	 * @param K
	 * @return
	 */
	static long binomial(final int N, final int K) {
		BigInteger ret = BigInteger.ONE;
		for (int k = 0; k < K; k++) {
			ret = ret.multiply(BigInteger.valueOf(N - k)).divide(
					BigInteger.valueOf(k + 1));
		}
		return ret.longValue();
	}

	/**
	 * Method to calculate no of ways a brick can be arranged
	 * 
	 * @param N
	 * @return
	 */
	static long calculateNoOfWays(int N) {

		final int MAXN = 41;
		int[] noOfWays = new int[MAXN];

		noOfWays[0] = noOfWays[1] = noOfWays[2] = noOfWays[3] = 1;
		for (int i = 4; i < noOfWays.length; ++i) {
			noOfWays[i] = noOfWays[i - 1] + noOfWays[i - 4];
		}
		/*System.out.println(noOfWays.length + " LKEBGTh");*/
		return noOfWays.length - 1;
	}

	/**
	 * Method to get the count of prime number using Sieve-Of-Eratosthenes
	 * COmplexity has been drilled down to O(N) for large data
	 * 
	 * @param n
	 * @return
	 */
	static long sieveOfEratosthenes(long n) {

		List<Integer> primeList = new ArrayList<Integer>();
		boolean[] isPrime = new boolean[(int) (n + 1)];
		isPrime[1] = true;

		for (int i = 2; i <= n; i++) {

			if (!isPrime[i]) {
				primeList.add(i);

				int multiple = 2;

				while (i * multiple <= n) {

					isPrime[i * multiple] = true;
					multiple++;
				}
			}
		}

		return primeList.size();
	}

}
