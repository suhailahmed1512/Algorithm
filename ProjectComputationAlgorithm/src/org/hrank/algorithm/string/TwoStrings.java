package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement Two Strings algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class TwoStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String op;
		int P = sc.nextInt();

		for (int i = 0; i < P; i++) {
			op = "NO";
			String str1 = sc.next();
			String str2 = sc.next();

			for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
				if (str1.indexOf(c) != -1 && str2.indexOf(c) != -1) {
					op = "YES";
					break;
				}
			}
			System.out.println(op);
		}
		sc.close();

	}
}
