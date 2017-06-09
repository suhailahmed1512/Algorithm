package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement between-two-sets algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class BetweenTwoSets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			A.add(sc.nextInt());
		}

		for (int j = 0; j < m; j++) {
			B.add(sc.nextInt());
		}

		int startElement = A.get(0);
		int endElement = B.get(B.size() - 1);

		List<Integer> commonFactorList = getAFactor(A, startElement, endElement);
		List<Integer> betweenList = getBFactor(commonFactorList, B);

		System.out.println(betweenList.size());

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get all the factor form set A
	 * 
	 * @param A
	 * @param startElement
	 * @param endElement
	 * @return
	 */
	static List<Integer> getAFactor(List<Integer> A, int startElement,
			int endElement) {

		List<Integer> factorAList = new ArrayList<Integer>();
		for (int i = startElement; i <= endElement; i++) {
			boolean checkForFactor = true;
			for (Integer data : A) {
				if (i % data != 0) {
					checkForFactor = false;
					break;
				}
			}

			if (checkForFactor) {
				factorAList.add(i);
			}
		}

		return factorAList;
	}

	/**
	 * Method to check for the factor in B from the list of A common factor
	 * 
	 * @param factorAList
	 * @param B
	 * @return
	 */
	static List<Integer> getBFactor(List<Integer> factorAList, List<Integer> B) {

		List<Integer> betweenList = new ArrayList<Integer>();

		for (Integer factorData : factorAList) {

			boolean checkForFactor = true;

			for (Integer bData : B) {

				if (bData % factorData != 0) {
					checkForFactor = false;
					break;
				}
			}

			if (checkForFactor) {
				betweenList.add(factorData);
			}
		}

		return betweenList;
	}
}
