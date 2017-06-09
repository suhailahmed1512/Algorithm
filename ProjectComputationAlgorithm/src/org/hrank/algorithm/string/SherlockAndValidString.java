package org.hrank.algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Class to implement Sherlock and Valid String with O(N) time complexity
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class SherlockAndValidString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		char arr[] = new char[str.length()];
		arr = str.toCharArray();
		Arrays.sort(arr);

		Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int counter = 1;
			if (charFreqMap.containsKey(arr[i])) {
				int data = charFreqMap.get(arr[i]) + 1;
				charFreqMap.put(arr[i], data);
			} else {
				charFreqMap.put(arr[i], counter);
			}
		}

		int testSize = 0;
		boolean sherlockValidCheck = true;

		List<Integer> list = new ArrayList<Integer>();

		for (Character c : charFreqMap.keySet()) {
			/* System.out.println(charFreqMap.get(c) + " KEY SET"); */
			list.add(charFreqMap.get(c));

		}

		int mode = mostCommon(list);

		/* System.out.println(mode + " MODE"); */

		/* Collections.sort(list); */

		for (int k = 0; k < list.size(); k++) {
			if (list.get(k) != mode) {
				/*
				 * System.out.println("TEST SIZE IS " + testSize + " DATA IS " +
				 * list.get(k));
				 */
				testSize++;
				if (testSize >= 2) {
					sherlockValidCheck = false;
					break;
				}
			}
		}

		if (!sherlockValidCheck) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

		sc.close();
	}

	/**
	 * Method to get the most common or most occurred number
	 * 
	 * @param list
	 * @return
	 */
	public static <T> T mostCommon(List<T> list) {
		Map<T, Integer> map = new HashMap<>();

		for (T t : list) {
			Integer val = map.get(t);
			map.put(t, val == null ? 1 : val + 1);
		}

		Entry<T, Integer> max = null;

		for (Entry<T, Integer> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue())
				max = e;
		}

		return max.getKey();
	}
}
