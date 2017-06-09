package org.hrank.algorithm.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Class to implement happy-ladybugs algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class HappyLadybugs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();

		for (int i = 0; i < g; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			if (!str.contains("_")) {
				System.out.println(checkForHappyBugs(str, n) == true ? "YES"
						: "NO");
			} else {
				System.out
						.println(checkForPairCharacters(str, n) == true ? "YES"
								: "NO");
			}
		}

		// freeing up the resources
		sc.close();
	}

	/**
	 * Method to check all the characters are in pair creating data dictionary
	 * 
	 * @param str
	 * @param n
	 * @return
	 */
	static boolean checkForPairCharacters(String str, int n) {

		Map<Character, Integer> charDictionary = new HashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != '_') {
				if (charDictionary.containsKey(str.charAt(i))) {
					charDictionary.put(str.charAt(i),
							charDictionary.get(str.charAt(i)) + 1);
				} else {
					charDictionary.put(str.charAt(i), count);
				}
			}
		}

		boolean isCharacterPaired = true;
		for (Character c : charDictionary.keySet()) {
			/* System.out.println(c + " " + charDictionary.get(c)); */
			if (charDictionary.get(c) <= 1) {
				/* System.out.println(c); */
				return false;
			}
		}

		/*
		 * if (str.contains("_")) { isCharacterPaired = true;
		 * System.out.println(charDictionary.size() + " SIZE"); }
		 */

		return isCharacterPaired;
	}

	/**
	 * Method to check for Happy Bugs String which is already in a pattern
	 * 
	 * @param str
	 * @return
	 */
	static boolean checkForHappyBugs(String str, int n) {

		boolean isHappyBugs = true;
		if (!checkForPairCharacters(str, n)) {
			return false;
		} else {
			char tempChar = str.charAt(0);
			int counter = 0;
			for (int i = 1; i < str.length() - 2; i++) {
				if (tempChar == str.charAt(i)) {
					counter++;
				} else if (tempChar != str.charAt(i) && counter == 0) {
					return false;
				} else if (str.charAt(i) != tempChar && counter > 0) {
					tempChar = str.charAt(i);
					counter = 0;
				}
			}
		}

		return isHappyBugs;
	}
}
