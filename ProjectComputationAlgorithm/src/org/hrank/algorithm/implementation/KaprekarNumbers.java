package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement kaprekar-numbers algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class KaprekarNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		boolean isNotInrange = true;
		for (int i = p; i <= q; i++) {

			if (isModifiedKaprekar(i)) {
				System.out.print(i + "\t");
				isNotInrange = false;
			}
		}
		if (isNotInrange) {
			System.out.println("INVALID RANGE");
		}
		sc.close();
	}

	/**
	 * Method to check whether the number is Modified-Karprekar's(Different from
	 * the Karprekar numbers- modified one) number or not
	 * 
	 * @param data
	 * @return
	 */
	static boolean isModifiedKaprekar(int data) {
		boolean isKarpekar = false;

		if (data == 1) {
			return true;
		} else if (data > 4) {

			String numString = String.valueOf(data);
			long square = (long) Math.pow(data, 2);
			/* System.out.println(square); */
			String revString = new StringBuilder(String.valueOf(square))
					.reverse().toString();
			/* System.out.println(revString); */
			long rightPiece = Long.valueOf(new StringBuilder(revString
					.substring(0, numString.length())).reverse().toString());

			long leftPiece = Long.valueOf(new StringBuilder(revString
					.substring(numString.length(), revString.length()))
					.reverse().toString());
			/* System.out.println(rightPiece + leftPiece); */

			long sum = rightPiece + leftPiece;

			if (data == sum) {
				isKarpekar = true;
			}
		}
		return isKarpekar;
	}
}
