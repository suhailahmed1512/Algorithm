package org.hrank.algorithm.warmup;

import java.util.Scanner;

public class TestRotate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
			// /System.out.print(arr[i]+"\t");
		}

		for (int i = 0; i < 5; i++) {

			arr = rotatingArrays(arr);

		}

		for (int num : arr) {
			System.out.print(num + "\t");
		}

		sc.close();
	}

	public static int[] rotatingArrays(int arr[]) {

		int rotatedArr[] = new int[arr.length];

		if (arr != null && arr.length > 1) {

			// System.out.println("Value of last element of given arr is "+arr[arr.length-1]);
			rotatedArr[0] = arr[arr.length - 1];

			for (int i = 1; i <= arr.length - 1; i++) {

				// /System.out.println(arr[i]);
				rotatedArr[i] = arr[i - 1];
			}

		}

		else {

			rotatedArr[0] = arr[arr.length - 1];
		}

		return rotatedArr;
	}
}
