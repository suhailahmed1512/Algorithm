package org.hrank.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement angry-children algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class AngryChildren {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			numberList.add(sc.nextInt());
		}

		Collections.sort(numberList);
		System.out.println(getUnfairness(numberList, K));

		// Freeing up the resources
		sc.close();

	}

	/**
	 * Method to get the unfairness of the list
	 * 
	 * @param numberList
	 * @param K
	 */
	static Integer getUnfairness(List<Integer> numberList, int K) {
		List<Integer> minMaxList = new ArrayList<>();
		for (int i = 0; i < numberList.size(); i++) {
			if (i + K - 1 == numberList.size()) {
				break;
			} else {
				/*
				 * System.out.println(numberList.get(i + K - 1) + " MAX NUMBER "
				 * + numberList.get(i) + " MIN NUMBER");
				 */
				int maxMin = numberList.get(i + K - 1) - numberList.get(i);
				minMaxList.add(maxMin);
			}
		}

		Collections.sort(minMaxList);
		return minMaxList.get(0);
	}
}
