package org.hrank.algorithm.bit;

import java.util.Scanner;

/**
 * Class to implement Lonely Integer algo. using XOR manipulation
 * 
 * @author suhail-a
 * @version 1.0
 */
public class LonelyInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("Value of i is "+ i
			// +" value at ith is "+arr[i]);
			result = result ^ arr[i];
			// System.out.println("Value of result after XOR manipulation "+result);
		}

		System.out.println(result);

		sc.close();

	}
}
