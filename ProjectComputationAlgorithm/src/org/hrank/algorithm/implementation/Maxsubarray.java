package org.hrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement max sub-array algo. the maximum possible sum of a
 * Contiguous sub-array Non-contiguous in O(logN) time
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class Maxsubarray {
	/**
	 * DEVELOPPR COMMENTS COMPEXITY HAS TO BE REDUCED FROM PLYNOIMIAL TO LEAST
	 * LINEAR CUrrently it's O(n) has be to bring down to min. O(NlogN)
	 * ## BRINGED DOWN TO LINEAR ## DONE
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			int size = sc.nextInt();

			int arr[] = new int[size];

			for (int j = 0; j < size; j++) {
				arr[j] = sc.nextInt();
			}

			System.out.print(getSumMaxContiguous(arr) + "\t");
			System.out.print(getMaxNonContigous(arr));
			System.out.println();

		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to get the max sum of non-contiguous array
	 * 
	 * @param arr
	 * @return
	 */
	public static int getMaxNonContigous(int arr[]) {
		//Handling if all the element (-)ive
		Arrays.sort(arr);
		if (arr[arr.length - 1] < 0) {
			return arr[arr.length - 1];
		} else {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] > 0) {
					sum += arr[i];
				}
			}
			return sum;
		}

	}

	/**
	 * Method to get the largest sum of contiguous array
	 * 
	 * @param arr
	 * @return
	 */
	public static int getSumMaxContiguous(int arr[]) {
		{
			int max_so_far = 0, max_ending_here = 0;

			for (int i = 0; i < arr.length; i++) {
				max_ending_here = max_ending_here + arr[i];
				if (max_ending_here < 0)
					max_ending_here = 0;
				if (max_so_far < max_ending_here)
					max_so_far = max_ending_here;
			}
			//Handling if all the element (-)ive
			if (max_so_far == 0) {
				Arrays.sort(arr);
				max_so_far = arr[arr.length - 1];
			}
			return max_so_far;
		}
	}
}
