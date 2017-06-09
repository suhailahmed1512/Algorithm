package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

public class Twins {

	public static void main(String[] args) {

		for (Integer data : sieveOfEratosthenes(2, 10)) {
			System.out.println(data);
		}
	}

	static List<Integer> sieveOfEratosthenes(int m, int n) {

		List<Integer> primeList = new ArrayList<Integer>();
		boolean[] isPrime = new boolean[(int) (n + 1)];
		isPrime[1] = true;

		for (int i = m; i <= n; i++) {

			if (!isPrime[i]) {
				primeList.add(i);

				int multiple = 2;

				while (i * multiple <= n) {

					isPrime[i * multiple] = true;
					multiple++;
				}
			}
		}

		return primeList;
	}
}
