package org.hrank.algorithm.sorting;

import java.util.Scanner;

public class Runningtime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long size = sc.nextLong();

		long arr[] = new long[(int) size];

		for (long j = 0; j < size; j++) {
			arr[(int) j] = sc.nextLong();
		}

		System.out.println(insertSortSplit(arr));
		sc.close();
	}

	public static long insertSortSplit(final long[] data) {

		long counter = 0;
		for (int sortIndex = 1; sortIndex < data.length; sortIndex++) {
			counter = subInsertSort(data, sortIndex, counter);
		}

		return counter;
	}

	private static final long subInsertSort(final long[] data,
			final long sortIndex, long counter) {
		final long temp = data[(int) sortIndex];
		long insertIndex = (int) (sortIndex - 1);
		while (insertIndex >= 0 && temp < data[(int) insertIndex]) {
			insertIndex--;
			counter++;
		}
		insertIndex++;
		System.arraycopy(data, (int) insertIndex, data, (int) insertIndex + 1,
				(int) ((int) sortIndex - insertIndex));
		data[(int) insertIndex] = temp;

		return counter;

	}
}
