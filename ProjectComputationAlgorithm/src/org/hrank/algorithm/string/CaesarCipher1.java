package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * CLass to implement caesar-cipher-1
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class CaesarCipher1 {
	/**
	 * DEVELOPER COMMENTS
	 * TIME COMPLEXITY BEEN REDUCED 
	 *  
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String str = sc.next();
		int k = sc.nextInt();

		System.out.println(getStringData(str, k, N));

		System.out.println(getDancingString(str, k, N));

		// Freeing up the resources
		sc.close();

	}

	/**
	 * Method to get swing the characters k time
	 * 
	 * BRUTE FORCED used in more time complexity
	 * 
	 * @param str
	 * @param k
	 * @param N
	 * @return
	 */
	static StringBuilder getStringData(String str, int k, int N) {

		StringBuilder str1 = new StringBuilder("");
		for (int i = 0; i < N; i++) {
			if (k > 26) {
				k = k % 26;
			}
			char character = str.charAt(i);
			/* System.out.println(character); */

			if (character >= 65 && character < 91) {

				if ((character + k) > 90) {

					character = (char) ((character + k) - 26);
					int c = (int) character;
					System.out.println(c);
				} else {

					character += k;
				}
				/* str1 += String.valueOf(character); */
				str1.append(character);

			} else if (character >= 97 && character < 123) {

				if ((character + k) > 122) {

					character = (char) ((character + k) - 26);

				} else {

					character += k;
				}
				/* str1 += String.valueOf(character); */
				str1.append(character);
			} else {
				/* str1 += String.valueOf(character); */
				str1.append(character);
			}

		}

		return str1;
	}

	/**
	 * Method to dance the character k time in more optimized manner compare to
	 * above method !!! time Complexity drilled down !!!-
	 * 
	 * @param str
	 * @param k
	 * @param N
	 * @return
	 */
	static String getDancingString(String str, int k, int N) {

		k = k % 26;

		String[] testString = str.split("");
		String danceString = "";
		for (String data : testString) {

			char c = data.charAt(0);
			if (65 <= c && c <= 90) {
				c = (char) (65 + (c - 65 + k) % 26);
			} else if (97 <= c && c <= 122) {
				c = (char) (97 + (c - 97 + k) % 26);
			}

			danceString += c;

		}

		return danceString;
	}

}
