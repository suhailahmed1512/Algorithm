package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement algo. for Beautiful Binary String
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class BeautifulBinaString {

	// Need to check on algo. not working as expected

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		String str = sc.next();
		char arr[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < size; i++) {

			if (arr[i] == '0' && i != arr.length - 1) {

				if (i + 1 == str.length() || i + 2 > str.length() - 1) {
					break;
				}

				if (arr[i + 1] == '1' && arr[i + 2] == '0') {

					if (arr[i + 1] == '0') {
						arr[i + 1] = '1';
					} else {
						arr[i + 1] = '0';
					}
					if (arr[i + 2] == '0') {
						arr[i + 2] = '1';
					} else {
						arr[i + 2] = '0';
					}
					count++;
				}
			}

		}
		/*
		 * if(count!=0) System.out.println(count); else
		 */
		System.out.println(count);

		sc.close();
	}
}
