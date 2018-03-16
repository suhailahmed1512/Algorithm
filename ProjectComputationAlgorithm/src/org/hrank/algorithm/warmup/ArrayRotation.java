package org.hrank.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Class to rotate the array
 * 
 * @author sahm16
 * @version 1.0
 * O(2(n-d)) with multiple loop and without using any in built in api
 */
public class ArrayRotation {

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
				out.print(getLastElement(n, arr));
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
		while (arr.length != 1) {

			arr = rotateArray(arr.length, arr.length - 1, arr);
			/*
			 * if (!start) { arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
			 * start = true; } else { arr = deleteArrayElement(arr.length, n -
			 * deletPosition, arr); } deletPosition--;
			 */
			arr = deleteArrayElement(arr.length, n - deletPosition, arr);
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
	 * Method to delete the element from array after rotation
	 * 
	 * @param n
	 * @param pos
	 * @param arr
	 * @return
	 */
	static int[] deleteArrayElement(int n, int pos, int arr[]) {

		if (pos >= n) {
			return Arrays.copyOfRange(arr, 1, n);
		}

		int revArr[] = revesre(arr);
		int remvedArr[] = remove(pos, revArr);

		return revesre(remvedArr);

	}

	/**
	 * Method to remove an element at particular index in an array
	 * 
	 * @param index
	 * @param arr
	 * @return
	 */
	static int[] remove(int index, int[] arr) {
		int[] newArr = new int[arr.length - 1];
		if (index < 0 || index > arr.length) {
			return arr;
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				i++;
			}
			newArr[j++] = arr[i];
		}

		return newArr;
	}

	/**
	 * Method to reverse an array ( for time being this will increase the
	 * complexity but 'll check later to reduce the complexity for this)
	 * 
	 * @param arr
	 * @return
	 */
	static int[] revesre(int[] arr) {

		int revArr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			revArr[i] = arr[arr.length - 1 - i];
		}

		return revArr;
	}
}
