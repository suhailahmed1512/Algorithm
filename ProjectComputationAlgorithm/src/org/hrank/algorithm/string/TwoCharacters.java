package org.hrank.algorithm.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement two-characters algo. without brute forcing it(complexity
 * has to be drilled down)
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class TwoCharacters {

	public static void main(String[] args) {

		final int FIRST = 1, SECOND = 2;

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String s = sc.next();

		int[] charFreqList = new int[26];

		// Filling array to zero for dictionary to get store the frequency of
		// characters
		Arrays.fill(charFreqList, 0);

		for (int i = 0; i < N; i++) {
			charFreqList[s.charAt(i) - 'a']++;
		}

		int ch = FIRST, count = 0, max = 0;
		char c;

		for (int i = 'a'; i <= 'z'; i++) {

			for (int j = 'a'; j <= 'z'; j++) {

				if (i != j && charFreqList[i - 'a'] != 0
						&& charFreqList[j - 'a'] != 0) {

					int flag = 0;
					ch = FIRST;

					for (int k = 0; k < N; k++) {
						c = s.charAt(k);
						if (c == i && ch == FIRST) {
							ch = SECOND;
						} else if (c == j && ch == SECOND) {
							ch = FIRST;
						} else if (c == i && ch == SECOND) {
							flag = 1;
							break;
						} else if (c == j && ch == FIRST) {
							flag = 1;
							break;
						}
					}
					count = charFreqList[i - 'a'] + charFreqList[j - 'a'];
					if (flag == 0 && count > max) {
						max = count;
					}
				}

			}
		}

		System.out.println(max);

		// Freeing up the resources
		sc.close();
	}

}
