package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Class to implement equality-in-a-array algo.
 * 
 * @author suhail-a
 * @version 1.0
 */
public class EqualityInAArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			if (!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				map.put(str, map.get(str) + 1);
			}
		}
		List<Integer> values = new ArrayList<Integer>(map.values());
		Collections.sort(values);

		int deletionSteps = values.get(values.size() - 1);
		System.out.println(N - deletionSteps);
		sc.close();
	}
}
