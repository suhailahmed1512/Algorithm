package org.hrank.arrays;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Class to implement algo. for deleteing element from array after rotating
 * 
 * @author sahm16
 * @version 1.0
 *
 */
public class DeleteArray {

	public static void main(String[] args) {
		int n = 4, pos = 2;
		int[] arr = { 3, 4, 6, 1 };

		for (int data : deleteArrayElement(n, pos, arr)) {
			new PrintStream(System.out).print(data + "\t");
		}
	}

	static int[] deleteArrayElement(int n, int pos, int arr[]) {

		int[] delArr = new int[n-1];
		for (int i = 0; i < n - 1; i++) {

			if (n == pos && n > 1) {
				delArr[0] = arr[0 + 1];
			} else {
				delArr[pos - 1] = arr[pos];
			}

		}

		return delArr;

	}
}
