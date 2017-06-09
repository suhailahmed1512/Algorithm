package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement encryption algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Encryption {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int length = str.length();

		int rowVal = 0;
		int colVal = 0;

		for (int i = 1; i <= length; i++) {

			if (length % i == 0) {
				rowVal = length / i;
			} else {
				rowVal = (length / i) + 1;
			}

			colVal = i;

			if (colVal >= rowVal) {
				break;
			}

		}

		char arr[][] = new char[rowVal][colVal];

		int charPosition = 0;

		for (int i = 0; i < rowVal; i++) {
			if (charPosition > length - 1) {
				break;
			}
			for (int j = 0; j < colVal; j++) {
				if (charPosition > length - 1) {
					break;
				}
				arr[i][j] = str.charAt(charPosition);
				charPosition++;
			}
		}

		for (int l = 0; l < colVal; l++) {
			String op = "";
			for (int pos = 0; pos < rowVal; pos++) {
				op += String.valueOf(arr[pos][l]);
			}
			op = op.trim();
			System.out.print(op + "\t");
		}

		// Freeing up the resources
		sc.close();
	}
}
