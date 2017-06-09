package org.hrank.algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubstringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String data = sc.next();

		List<String> frontSubStringList = getUniqueSubString(data);
		List<String> backSubStringList = getUniqueSubString(new StringBuilder(
				data).reverse().toString());
		List<String> list = new ArrayList<String>();

		list = populateList(frontSubStringList, list);
		list = populateList(backSubStringList, list);

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println(list.size());

		/* getUniqueSubStringComplexity(data, data.length()); */
		sc.close();
	}

	static List<String> getUniqueSubString(String data) {
		List<String> hs = new ArrayList<String>();
		// add elements to the hash set
		for (int i = 0; i < data.length(); ++i) {
			for (int j = 0; j < (data.length() - i); ++j) {
				hs.add(data.substring(j, i + j + 1));
			}
		}

		return hs;
	}

	static void getUniqueSubStringComplexity(String data, int length) {
		List<String> list = new ArrayList<String>();
		String[] arrayString = new String[length];
		for (int i = 0; i < length; ++i) {
			arrayString[i] = data.substring(length - 1 - i, length);
		}

		Arrays.sort(arrayString);
		for (int i = 0; i < length; ++i)
			list.add(arrayString[i]);
		/*
		 * long num_substring = arrayString[0].length();
		 * 
		 * for (int i = 0; i < length - 1; ++i) { int j = 0; for (; j <
		 * arrayString[i].length(); ++j) { if (!((arrayString[i].substring(0, j
		 * + 1)) .equals((arrayString)[i + 1].substring(0, j + 1)))) { break; }
		 * } num_substring += arrayString[i + 1].length() - j; }
		 */

		Collections.sort(list);
		for (String op : list) {
			System.out.println(op);
		}
	}

	/**
	 * Method to populate subStringList form forward and back sublist
	 * 
	 * @param subList
	 * @param subStringList
	 * @return
	 */
	static List<String> populateList(List<String> subList,
			List<String> subStringList) {
		for (String data : subList) {
			if (!subStringList.contains(data)) {
				subStringList.add(data);
			}
		}

		return subStringList;
	}

}
