package org.hrank.algorithm.search;

/*import java.util.ArrayList;*/
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement sherlock-and-array algo. with O(n) time complexity
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class SherlockAndArray {

	static final String YES = "YES";
	static final String NO = "NO";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* List<Integer> list = null; */
		int arr[] = null;
		int tCase = sc.nextInt();

		for (int i = 0; i < tCase; i++) {

			int N = sc.nextInt();
			/* list = new ArrayList<Integer>(); */
			arr = new int[N];
			for (int j = 0; j < N; j++) {
				int data = sc.nextInt();
				arr[j] = data;
				/* list.add(data); */
			}

			if (isSherlockArray(arr)) {
				System.out.println(YES);
			} else {
				System.out.println(NO);
			}

			/*
			 * if (checkSherlockArray(list)) { System.out.println(YES); } else {
			 * System.out.println(NO); }
			 */

		}
		// Freeing up the resources
		sc.close();

	}

	/**
	 * Method to check Sherlock Array
	 * 
	 * @param arr
	 * @return
	 */
	static boolean checkSherlockArray(List<Integer> list) {

		boolean isSherlockArray = false;

		int sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		// Below code for instrumentation
		/* System.out.println("SUM IS " + sum); */

		int lsum = 0;
		int rsum = sum;
		for (int i = 0; i < list.size(); i++) {
			lsum = sum - rsum;

			/*
			 * System.out.println("LEFT SUM IS " + lsum);
			 * System.out.println("BEFORE RSUM IS CALC VAlue of i is  " +
			 * list.get(i) + " at " + i + "th position" + " and rsum is " +
			 * rsum);
			 */

			rsum = rsum - list.get(i);
			/* System.out.println("RIGHT SUM IS " + rsum); */
			if (lsum == rsum) {
				isSherlockArray = true;
				break;
			} else {
				continue;
			}
		}

		return isSherlockArray;
	}

	/**
	 * Method to find sherlock array without using collections api
	 * 
	 * @param arr
	 * @return
	 */
	static boolean isSherlockArray(int arr[]) {

		boolean isSherlockArray = false;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		// Below code for instrumentation
		/* System.out.println("SUM IS " + sum); */

		int lsum = 0;
		int rsum = sum;
		for (int i = 0; i < arr.length; i++) {
			lsum = sum - rsum;

			/*
			 * System.out.println("LEFT SUM IS " + lsum);
			 * System.out.println("BEFORE RSUM IS CALC VAlue of i is  " + arr[i]
			 * + " at " + i + "th position" + " and rsum is " + rsum);
			 */

			rsum = rsum - arr[i];
			/* System.out.println("RIGHT SUM IS " + rsum); */
			if (lsum == rsum) {
				isSherlockArray = true;
				break;
			} else {
				continue;
			}
		}
		return isSherlockArray;
	}
}
