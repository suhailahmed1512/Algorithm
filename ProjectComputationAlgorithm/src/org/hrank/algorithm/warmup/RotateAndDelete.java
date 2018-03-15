package org.hrank.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * Class to implement algo. for RotateAndDelete
 * 
 * @author sahm16
 * @version 1.0
 */
public class RotateAndDelete {

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		PrintStream out = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintStream(System.out);
			int t = Integer.parseInt(in.readLine());
			// Running the given test cases
			while (--t >= 0) {

				int n = Integer.parseInt(in.readLine());
				String lineItems[] = in.readLine().split(" ");
				int arr[] = new int[n];

				for (int i = 0; i < n; i++) {
					arr[i] = Integer.parseInt(lineItems[i]);
				}
				out.println(getLastElement(n, arr));
			}
		} catch (NumberFormatException e) {
			out.print("Exception occured due to" + e);
		} catch (IOException e) {
			out.print("Exception occured due to" + e);
		} finally {
			in.close();
			out.close();
		}
	}

	/**
	 * Method to fetch the last element after rotating and deleting array
	 * element
	 * 
	 * @param n
	 * @param arr
	 * @return
	 */
	static int getLastElement(int n, int[] arr) {
		int lastElement = 0;
		int deletPosition = n;
		boolean start = false;
		while (arr.length != 1) {

			arr = rotateArray(arr.length, arr.length - 1, arr);
			if (!start) {
				arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
				start = true;
			} else {
				arr = deleteArrayElement(arr.length, n - deletPosition, arr);
			}
			deletPosition--;

		}

		lastElement = arr[0];
		return lastElement;
	}

	/**
	 * Method to return rotate array
	 * 
	 * @param n
	 * @param d
	 * @param arr
	 */
	static int[] rotateArray(int n, int d, int arr[]) {

		int temp[] = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		int rotateArr[] = new int[n];
		for (int i = 0; i < n; i++) {

			if (i + d >= n) {
				break;
			}
			rotateArr[i] = arr[i + d];

		}

		// Re-creating array from sliced part to rotate
		for (int i = 0; i < d; i++) {
			rotateArr[n - d + i] = temp[i];
		}

		return rotateArr;
	}

	/**
	 * Method to delete the elements in the aray
	 * 
	 * @param n
	 * @param pos
	 * @param arr
	 * @return
	 */
	static int[] deleteArrayElement(int n, int pos, int arr[]) {

		/*
		 * int[] delArr = new int[n - 1]; for (int i = 0; i < n - 1; i++) {
		 * 
		 * if (pos == i + 1) { delArr[i] = arr[i + 1]; } else { delArr[i] =
		 * arr[i]; }
		 * 
		 * }
		 * 
		 * return delArr;
		 */

		int[] delArr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {

			if (n == pos && n > 1) {
				delArr[0] = arr[0 + 1];
			} else {
				System.out.println("POSITION "+pos+"n is "+n);
				delArr[pos - 1] = arr[pos];
			}

		}

		return delArr;

	}
}