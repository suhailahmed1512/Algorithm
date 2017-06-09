package org.hrank.algorithm.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Class to implement anagram algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String str[] = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}

		for (String data : str) {
			/*System.out.println(getAnagramReplacementCount(data));*/
			System.out.println(getCounter(data));
		}

		sc.close();
	}

	/**
	 * Method to get the counter to make it anagram
	 * 
	 * @param data
	 * @return
	 */
	static int getAnagramReplacementCount(String data) {

		if (data.length() % 2 != 0) {
			return -1;
		} else {
			int counter = 0;
			int midNumber = data.length() / 2;
			String str1 = data.substring(0, midNumber);
			String str2 = data.substring(midNumber, data.length());
			System.out.println(str1 + " " + str2);
			char[] s1Chars = str1.toCharArray();
			for (char c : s1Chars) {
				int index = str2.indexOf(c);
				if (index == -1) {
					System.out.println("charactre to be check is " + c);
					counter = counter + 1;
				} /*
				 * else { str2 = str2.substring(0, index) + str2.substring(index
				 * + 1); }
				 */
			}

			return counter;
		}

	}

	static void getAnngram(Scanner sc) {

		int diff = 0, t;
		t = sc.nextInt();
		String str = sc.next();
		int len = str.length();
		for (int k = 0; k < t; k++) {
			if (len % 2 != 0)
				System.out.println("-1");
			else {
				String str1 = str.substring(0, (len / 2));
				String str2 = str.substring(len / 2);
				for (int i = 0; i < str1.length(); i++) {

					if (!str2.contains(str1.charAt(i) + ""))
						diff++;

				}
				System.out.println(diff);
			}
		}

	}

	static int getCounter(String data) {

		int counter = 0;
		if (data.length() % 2 != 0) {
			return -1;
		} else {

			int length = data.length();
			String str1 = data.substring(0, length / 2);
			String str2 = data.substring(length / 2);

			Set<Character> set2 = new LinkedHashSet<Character>();
			Set<Character> set1 = new LinkedHashSet<Character>();
			for (Character c : str2.toCharArray()) {
				set2.add(c);
			}

			char[] s1Chars = str1.toCharArray();
			for (char c : s1Chars) {
				set1.add(c);
				int index = str2.indexOf(c);
				if (index == -1) {
					counter = counter + 1;
					set1.add(c);
				}
			}
			if(set1.size() != set2.size()){
				
				counter += set2.size() - set1.size();
			}
			
			return counter;
		}
	}

}
