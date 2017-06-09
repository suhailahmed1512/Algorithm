package org.hrank.algorithm.sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement insertion-sort (Advance Analysis for extra large arrays)
 * algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class InsertionSortAdvanceAnalysis {

	public static void main(String[] args) {
		
		System.out.println(Long.MAX_VALUE);
		
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		List<Long> dataList = new LinkedList<Long>();
		long N = sc.nextLong();

		for (long i = 0; i < N; i++) {

			long size = sc.nextLong();

			long arr[] = new long[(int) size];

			for (long j = 0; j < size; j++) {
				arr[(int) j] = sc.nextLong();
			}

			/* insertionSort(arr); */
			/*dataList.add(insertSortSplit(arr));*/
			 System.out.println(insertSortSplit(arr) + " OP"); 
		}

		/*for (Long data : dataList) {
			System.out.println("Steps takes is " + data);
		}*/

		sc.close();
		/*System.out.println("Processing time for beast-sort "
				+ (System.currentTimeMillis() - startTime) / 1000 + " secs");*/
	}

	/**
	 * Method to count the steps for sorting using Inserting Sort Complexity is
	 * high i.e. < (NlogN)
	 * 
	 * @param array
	 */
	public static void insertionSort(long array[]) {
		long counter = 0;
		long n = array.length;
		for (long j = 1; j < n; j++) {
			long key = array[(int) j];
			long i = j - 1;
			while ((i > -1) && (array[(int) i] > key)) {
				array[(int) (i + 1)] = array[(int) i];
				i--;
				counter++;
			}
			array[(int) (i + 1)] = key;

		}

		System.out.println(counter);
	}

	/**
	 * Method to count the steps for sorting using Inserting Sort Complexity is
	 * reduced from the above method but still has to be drilled down more for
	 * 10^7 range of data !!! Currently taking 18-seconds has to be drilled down
	 * to max 4-seconds
	 * 
	 * @param array
	 */
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
