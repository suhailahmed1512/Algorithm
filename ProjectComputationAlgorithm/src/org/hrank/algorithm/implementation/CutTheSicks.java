package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement Cut the Sticks algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class CutTheSicks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		List<Integer> newArrayList = list;

		int size = newArrayList.size();

		for (int i = 0; i < size; i++) {

			int leastCut = minimumElement(newArrayList);

			newArrayList = getCutList(newArrayList, leastCut);
			if (newArrayList.size() == 1) {
				/*newArrayList = getCutList(newArrayList, leastCut);*/
				System.out.println(newArrayList.size());
			} else {
				System.out.println(newArrayList.size());
				size = newArrayList.size();
				continue;
			}
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to find the minimum element
	 * 
	 * @param list
	 * @return
	 */
	static int minimumElement(List<Integer> list) {

		Collections.sort(list);
		return list.get(0);
	}

	/**
	 * Method to find the cut stick number list
	 */
	static List<Integer> getCutList(List<Integer> list, Integer leastCut) {

		List<Integer> cuttedList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) - leastCut != 0) {
				cuttedList.add(list.get(i));
			}
		}
		return cuttedList;
	}
}
