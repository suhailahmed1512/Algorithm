package org.hrank.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Class to implement jim-and-the-orders algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class JimAndTheOrders {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 1; i <= n; i++) {
			int t = sc.nextInt();
			int d = sc.nextInt();
			int timeTaken = t + d;
			map.put(i, timeTaken);
		}

		for (Integer key : getOrderAcordingToTime(map).keySet()) {
			/* System.out.println(key + " -- " + sortedMap.get(key)); */
			System.out.print(key + "\t");
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to sort the data based on order time & time taken to deliver plus
	 * order number will be given priority if two time matches
	 * 
	 * @param map
	 * @return
	 */
	static Map<Integer, Integer> getOrderAcordingToTime(
			Map<Integer, Integer> map) {
		List<Integer> mapKeys = new ArrayList<>(map.keySet());
		List<Integer> mapValues = new ArrayList<>(map.values());

		Collections.sort(mapKeys);
		Collections.sort(mapValues);

		LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

		Iterator<Integer> valueIt = mapValues.iterator();
		while (valueIt.hasNext()) {
			Integer val = valueIt.next();
			Iterator<Integer> keyIt = mapKeys.iterator();

			while (keyIt.hasNext()) {
				Integer key = keyIt.next();
				Integer comp1 = map.get(key);
				Integer comp2 = val;

				if (comp1.equals(comp2)) {
					keyIt.remove();
					sortedMap.put(key, val);
					break;
				}
			}
		}

		return sortedMap;
	}
}
