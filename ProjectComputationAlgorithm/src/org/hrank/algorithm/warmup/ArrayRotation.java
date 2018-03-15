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
			String lineItems[] = in.readLine().split(" ");
			int n = Integer.parseInt(lineItems[0]);
			int d = Integer.parseInt(lineItems[1]);
			String dataLineItems[] = in.readLine().split(" ");
			int arr[] = new int[n];
			int i = 0;
			for (String data : dataLineItems) {
				arr[i] = Integer.parseInt(data);
				i++;
			}
			rotateArray(n, d, arr);

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
	 * Method to rotate array d times
	 * 
	 * @param n
	 * @param d
	 * @param arr
	 */
	static void rotateArray(int n, int d, int arr[]) {

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

		for (int data : rotateArr) {
			new PrintStream(System.out).print(data + "\t");
		}
	}
	
	
}
