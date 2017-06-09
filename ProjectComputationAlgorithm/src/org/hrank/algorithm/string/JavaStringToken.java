package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement JavaStringTokens
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class JavaStringToken {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		s = s.trim();
		if (s.length() > 400000) {
			sc.close();
			return;
		} else if (s.length() == 0) {
			System.out.println(0);
			sc.close();
			return;
		} else {

			String arr[] = s.split("[ !,?._'@]+");

			System.out.println(arr.length);

			for (String data : arr) {
				System.out.println(data);
			}
		}
		sc.close();
	}
}
