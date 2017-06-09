package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement beautiful-triplets
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class BeautifulTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long D = sc.nextLong();

		List<Long> dataList = new ArrayList<Long>();

		for (int i = 0; i < N; i++) {
			dataList.add(sc.nextLong());
		}
		/*
		 * int k = Collections.binarySearch(dataList, 0L); System.out.println(k
		 * + " " + Collections.binarySearch(dataList, 1L));
		 */
		System.out.println(calculateTripletsCount(dataList, D));
		sc.close();
	}

	/**
	 * Method to calculate count of beautiful triplets
	 * 
	 * @param dataList
	 * @param D
	 * @return
	 */
	static long calculateTripletsCount(List<Long> dataList, long D) {

		long counter = 0;
		if (dataList.size() < 3) {
			return 0;
		} else {

			Collections.sort(dataList);
			for (int i = 0; i < dataList.size(); i++) {

				long ai = dataList.get(i);
				long aj = ai + D;
				long ak = aj + D;
				/*
				 * System.out .println(ai + " " + aj + " " + ak + " FOR INDEX "
				 * + i);
				 */
				long ajP = Collections.binarySearch(dataList, aj);
				long akP = Collections.binarySearch(dataList, ak);
				/* System.out.println(ajP + " " + akP); */
				if (!(ajP < 0) && !(akP < 0)) {
					counter++;
					/* System.out.println(counter + " COUNTER"); */
				}
			}
		}

		return counter;

	}
}
