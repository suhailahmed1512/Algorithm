package org.hrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Class to implement CompareTheTriplets from Algo. Section
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		int alicePt = 0, bobPt = 0;

		if (a0 > b0) {
			alicePt++;
		} else if (a0 < b0) {
			bobPt++;
		}
		if (a1 > b1) {
			alicePt++;
		} else if (a1 < b1) {
			bobPt++;
		}
		if (a2 > b2) {
			alicePt++;
		} else if (a2 < b2) {
			bobPt++;
		}

		System.out.print(alicePt + "\t" + bobPt);

		in.close();
	}

}
