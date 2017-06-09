package org.hrank.algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class to implement super-functional-strings algo.
 * 
 * @author suhail-a
 * @version 1.0
 */
public class SuperFunctionalStrings {

	/**
	 * DEVELOPER COMMENTS COmplexity is very high in time O(N^2) has to be
	 * drilled down and also need to handle large values with core libraries
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {

			String data = sc.next();
			/* System.out.println("IP STRING data" + data); */
			long counter = 0;
			Set<String> substringSet = getUniqueSubstring(data);
			List<String> dataList = new ArrayList<String>(substringSet);
			for (int j = 0; j < dataList.size(); j++) {
				counter += countFunction(dataList.get(j).length(),
						getDistinctCharacters(dataList.get(j)), dataList.get(j));
			}
			System.out.println(counter);
			System.out.println(counter % 1000000007);

		}
		sc.close();
	}

	/**
	 * Method to get the set of unique substring
	 * 
	 * @param data
	 * @return
	 */
	static Set<String> getUniqueSubstring(String data) {

		Set<String> uniqueSubStringSet = new TreeSet<String>();
		// add elements to the hash set
		for (int i = 0; i < data.length(); ++i) {
			for (int j = 0; j < (data.length() - i); ++j) {
				uniqueSubStringSet.add(data.substring(j, i + j + 1));
			}
		}

		return uniqueSubStringSet;
	}

	/**
	 * Method to get number of distinct characters in a string
	 * 
	 * @param data
	 * @return
	 */
	static long getDistinctCharacters(String data) {

		Set<Character> characterSet = new TreeSet<Character>();
		for (int i = 0; i < data.length(); i++) {
			characterSet.add(data.charAt(i));
		}

		return characterSet.size();
	}

	/**
	 * Method to calculate the summation of function F(P) =
	 * (length(P)^distinct(P)) % (10^9 + 7)
	 * 
	 * @param length
	 * @param distinctCharCount
	 * @return
	 */
	static long countFunction(long length, long distinctCharCount, String str) {

		System.out.println(str);
		System.out.println(length + " total length");
		System.out.println(distinctCharCount + " distinctCharCount count");

		long op = (long) Math.pow(length, distinctCharCount);
		/* System.out.println("OP is " + op); */
		return op % 1000000007;
	}
}
