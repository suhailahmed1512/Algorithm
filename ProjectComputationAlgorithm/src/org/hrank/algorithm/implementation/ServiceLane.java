package org.hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to implement service-lane algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class ServiceLane {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // length of freeway
		int t = in.nextInt(); // number of testcases
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		in.nextLine();
		String str = in.nextLine();
		Scanner inStr = new Scanner(str);

		while (inStr.hasNextInt()) {

			arr.add(inStr.nextInt());

		}

		for (int a0 = 0; a0 < t; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int smallest = 10;

			for (int i = x; i <= y; i++) {
				if (smallest > arr.get(i)) {
					smallest = arr.get(i);
				}

			}
			System.out.println(smallest);
		}

		in.close();
		inStr.close();
	}
}
