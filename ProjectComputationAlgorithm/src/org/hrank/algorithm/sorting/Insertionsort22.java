package org.hrank.algorithm.sorting;

import java.util.Scanner;

public class Insertionsort22 {

	public static void insertionSortPart2(int[] ar) {
		int counter = 0;
		for (int sortIndex = 1; sortIndex < ar.length; sortIndex++) {
			counter = subInsertSort(ar, sortIndex, counter);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	private static final int subInsertSort(final int[] data,
			final int sortIndex, int counter) {
		final int temp = data[(int) sortIndex];
		int insertIndex = (int) (sortIndex - 1);
		while (insertIndex >= 0 && temp < data[(int) insertIndex]) {
			insertIndex--;
			counter++;
		}
		insertIndex++;
		System.arraycopy(data, (int) insertIndex, data, (int) insertIndex + 1,
				(int) ((int) sortIndex - insertIndex));
		data[(int) insertIndex] = temp;
		printArray(data);
		return counter;

	}
}
