package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement almost-sorted algo.
 * 
 * @author suhail-a
 * @version 1.0
 */
public class AlmostSorted {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*boolean isSorted;*/
		int N = sc.nextInt();
		List<Long> dataList = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			dataList.add(sc.nextLong());

		}

		if (isListSorted(dataList)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

	/**
	 * Method to check whether the I/P is already sorted
	 * 
	 * @param dataList
	 * @return
	 */
	static boolean isListSorted(List<Long> dataList) {

		boolean isSorted = true;
		for (int i = 0; i < dataList.size() - 1; i++) {

			if (dataList.get(i) > dataList.get(i + 1)) {
				return false;
			}
		}

		return isSorted;
	}

	/**
	 * Method to check whether swap can happen to make list sorted
	 * 
	 * @param dataList
	 * @param N
	 * @return
	 */
	static String checkSwapPossible(List<Long> dataList, int N) {

		return null;
	}

	/**
	 * Method to check whether reverse of sub-segment of list possible to make
	 * list sorted
	 * 
	 * @param dataList
	 * @param N
	 * @return
	 */
	static String checkRversePossible(List<Long> dataList, int N) {
		return null;

	}
}
