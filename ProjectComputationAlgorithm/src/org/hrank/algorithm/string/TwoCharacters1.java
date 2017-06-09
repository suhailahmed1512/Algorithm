package org.hrank.algorithm.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement two-characters algo. without brute-forcing to drill down
 * the complexity to least O(n)
 * 
 * @author suhail-a
 * @version 1.1
 * 
 */
public class TwoCharacters1 {

	static final int FIRST = 1, SECOND = 2;

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		int alpha[] = new int[26];
		Arrays.fill(alpha, 0);
		int ch = FIRST;
		int count = 0, max = 0;
		int i, j, k;
		char c;

		for (i = 0; i < n; i++)
			alpha[str.charAt(i) - 'a']++;

		for (i = 'a'; i <= 'z'; i++) {
			for (j = 'a'; j <= 'z'; j++) {
				if (i != j && alpha[i - 'a'] != 0 && alpha[j - 'a'] != 0) {
					int flag = 0;
					ch = FIRST;
					for (k = 0; k < n; k++) {
						c = str.charAt(k);
						if (c == i && ch == FIRST)
							ch = SECOND;
						else if (c == j && ch == SECOND)
							ch = FIRST;
						else if (c == i && ch == SECOND) {
							flag = 1;
							break;
						} else if (c == j && ch == FIRST) {
							flag = 1;
							break;
						}
					}
					count = alpha[i - 'a'] + alpha[j - 'a'];
					if (flag == 0 && count > max) {
						max = count;
						// System.out.println(count);
					}

					// System.out.println((char)(i)+" "+(char)(j)+" "+flag+" flag");
				}
			}
		}

		System.out.println(max);
		// Freeing up the resources
		s.close();
	}

}
