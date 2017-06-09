package org.hrank.algorithm.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Class to implement game-of-thrones 1 algo.
 * 
 * @author suhail-a
 * @version 1.0
 */
public class GameOfThrones {

	static final String NO = "NO";
	static final String YES = "YES";

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char[] arr = s.toCharArray();
		Arrays.sort(arr);

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (map.containsKey(arr[i])) {

				int data = map.get(arr[i]) + 1;
				map.put(arr[i], data);

			} else {
				map.put(arr[i], count);
			}
		}

		int oddCounter = 0;
		for (Character data : map.keySet()) {

			if (oddCounter > 1) {
				System.out.println(NO);
				System.exit(0);
			}

			else if (map.get(data) % 2 != 0) {
				oddCounter++;
			}
		}
		System.out.println(YES);
		sc.close();
	}

}
